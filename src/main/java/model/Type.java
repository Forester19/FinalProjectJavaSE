package model;

/**
 * Created by Владислав on 14.04.2017.
 */
public class Type extends BaseEntity {
    public Type(int id, String name) {
        super(id, name);

    }
    public String write(){
        return id + " " +name;
    }
    public String writeToPlanesFile(){
        return id+"," +name;
    }


}
