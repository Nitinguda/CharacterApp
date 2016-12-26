package edu.niu.cs.z1760203.characterapp;

/**
 * Created by z1760203 on 2/16/2016.
 */
public class Character {

    private String characterDesc;
    private int characterID;

    public Character(String newDesc, int newID){

        characterDesc = newDesc;
        characterID = newID;
    }//constructor ends


    //getter methods

    public int getCharacterID(){
        return characterID;
    }

    public String getCharacterDesc() {
        return characterDesc;
    }

    //setter methods

    public void setCharacterDesc(String characterDesc) {
        this.characterDesc = characterDesc;
    }

    public void setCharacterID(int characterID) {
        this.characterID = characterID;
    }


}//class ends
