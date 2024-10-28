import { EntityModel } from "../../shared/model/entity.model";

export class Credential extends EntityModel {

    public username?: string;
    public password?: string;

    constructor(id?: number, username?: string, password?: string) {
        super(id);
        this.username = username;
        this.password = password;
    }
}