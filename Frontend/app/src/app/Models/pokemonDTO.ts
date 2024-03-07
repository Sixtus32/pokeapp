export class Pokemon {
    name : string;
    avatar : string;
    type : string;
    ability : string;
    level : number;
    health : number;
    health_max : number;
    coach : number;

    constructor(name : string, avatar : string, type : string, ability : string, level : number, health : number, health_max : number, coach : number){
        this.name = name;
        this.avatar = '../assets/pokemon_images/' + avatar;
        this.type = type;
        this.ability = ability;
        this.level = level || 10;
        this.health = health;
        this.health_max = health || 100;
        this.coach=coach;
    }
}