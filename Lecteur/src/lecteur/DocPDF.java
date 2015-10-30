/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecteur;

/**
 *
 * @author tbalandier
 */
public class DocPDF {

    private String nom;
    private String chemin;


public DocPDF() {
    nom = "";
    chemin = "";
}

public DocPDF(String nom, String chemin) {
    this.nom = nom;
    this.chemin = chemin;
}

public String getNom() {
    return nom;
}

public String getChemin() {
    return chemin;
}
public void setNom(String nom) {
    this.nom =  nom;
}
public void setChemin(String chemin) {
    this.chemin = chemin;
}

public void show() {
    System.out.println("Nom du document : " + this.getNom());
    System.out.println("Chemin du document : " + this.getChemin());
}

}