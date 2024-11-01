export class Autorization {

    public token?: string;
    public picture?: string;
    public user?: string;

    constructor( token?: string, picture?: string, user?: string ) {
        this.token = token;
        this.picture = picture;
        this.user = user;
    }
}