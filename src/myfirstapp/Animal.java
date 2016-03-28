/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapp;

/**
 *
 * @author aniruddha
 */
public class Animal {
    
    int legs;
    int eyes;
    String name = new String("Tiger");

    Animal() {
        
        // default
    }
    
    Animal(int myLegs, int myEyes) {
        
        legs = myLegs;
        eyes = myEyes;
        // paeamatrized
    }
    
    Animal(Animal animal){
        
        // copy
    }
    
    
    void run(int myLegs, int countLegs){
        
        legs = legs +1;
    }
    
    void blinkEyes(){
        
        eyes = 0;
    }
    
    void giveName(){
        
        name = "Tiger";
    }
}
