export class Coach {
    username : string;
    constructor(username:string){
        this.username = '@' + username;  //Adding @ to the username for easy identification of coaches
    }
}