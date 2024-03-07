import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Pokemon } from '../Models/pokemonDTO';
import { Coach } from '../Models/coachDTO';
import { Observable, map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  pokemonDTOs : Pokemon [] = [];
  coachDTOs : Coach [] = [];
  baseUrlFirebasePokemon = 'https://proyecto-9f1f3-default-rtdb.europe-west1.firebasedatabase.app/pokemon.json';
  baseUrlFirebaseCoach = 'https://proyecto-9f1f3-default-rtdb.europe-west1.firebasedatabase.app/coach.json';
  baseUrlDB = 'http://localhost:8092/api/v1';

  constructor(public http : HttpClient) {
      this.http.get<Pokemon[]>(this.baseUrlDB+"/pokemons")
         .subscribe (response => {
           console.log(response);
           this.pokemonDTOs=response;
      })
  }

  insertCoach(username : string) : void {
    const coach = new Coach(username);

    this.coachDTOs.push(coach);
    let Arr2=JSON.stringify(this.coachDTOs);

    this.http.put(this.baseUrlFirebaseCoach,Arr2)
    .subscribe(response => {
      console.log(response);
    })
    console.log(this.coachDTOs);
  }

  insertCoachDB(url : string, obj : Object){
    this.http.put(url,obj);
  }

  insertPokemon(): void {
    const obj = JSON.stringify(this.pokemonDTOs);
    this.http.post(this.baseUrlFirebasePokemon, obj)
    .subscribe(response => {
      console.log(response);
    });
}


  allPokemons() : Observable<Pokemon []> {
    return this.http.get<Pokemon[]>(this.baseUrlDB + "/pokemons");
  }

  pickPokemons() : Pokemon  [] {
    let pks : Pokemon[] = [];
    this.http.get<Pokemon []>(this.baseUrlDB + "/pokemons")
           .subscribe (response => {
            //console.log(response);
            response.forEach(pokemon => {
              const poke = new Pokemon( pokemon.name,
                                    pokemon.avatar,
                                    pokemon.type,
                                    pokemon.ability,
                                    pokemon.level,
                                    pokemon.health,
                                    pokemon.health_max,
                                    pokemon.coach);
              this.pokemonDTOs.push(poke);
              pks.push(poke);
            });
           })
    return pks;
  }
}
