/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.ArrayList;

/**
 *
 * @author FARID
 */
public class ListeFruit extends ArrayList<Fruit>{

    public ListeFruit() {
    }
    
    public void ajouterFruit(Fruit fruit){
        this.add(fruit);
    }
       
}
