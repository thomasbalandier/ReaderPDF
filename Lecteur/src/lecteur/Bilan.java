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
public class Bilan {
    
    private String nom;
    private int valeur;

    public Bilan() {
        
    }
    
    public Bilan(String nom) {
        this.nom = nom;
    }

    public Bilan(int valeur) {
        this.valeur = valeur;
    }

    public Bilan(String nom, int valeur) {
        this.nom = nom;
        this.valeur = valeur;
    }

    
    
    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the valeur
     */
    public int getValeur() {
        return valeur;
    }

    /**
     * @param valeur the valeur to set
     */
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    
    public void show(){
        System.out.println("RUBRIQUE=" + this.getNom() + "##VALEUR=" + this.getValeur() + "##");
    }
    
}
