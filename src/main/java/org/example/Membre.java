package org.example;

import lombok.Data;

@Data

public class Membre {
    private String identifiant;
    private String nom;
    private String prenom;
    private String email;
    private String phone;


    public Membre(String identifiant, String nom, String prenom, String email, String phone) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object ob){
        if(ob instanceof Membre){
            if(this == ob) return true;
            if(ob == null ) return false;
            Membre mbr = (Membre)ob;
            if ( mbr.identifiant == this.identifiant ){
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return identifiant.hashCode();
    }

}
