/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author FARID
 */
public class Fruit {
    private String nomFruit;
    private double prixFruit;
    private double promotion;

    public double getPromotion() {
        return promotion;
    }

    public void setPromotion(double promotion) {
        this.promotion = promotion;
    }
    
    public Fruit(String nomFruit) {
        this.nomFruit = nomFruit;
    }

    public Fruit() {
    }

    public String getNomFruit() {
        return nomFruit;
    }

    public void setNomFruit(String nomFruit) {
        this.nomFruit = nomFruit;
    }

    public double getPrixFruit() {
        return prixFruit;
    }

    public void setPrixFruit(double prixFruit) {
        this.prixFruit = prixFruit;
    }
    
    
}
