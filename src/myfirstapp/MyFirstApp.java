package myfirstapp;

public class MyFirstApp {
    
    public static void main(String[] args) {
        
        System.out.println("Hello World");
        
        Animal animal = new Animal();
        animal.blinkEyes();
        animal.blinkEyes(3);
        
        String str = new String("android");
        
        System.out.println(" "+str.toUpperCase());
        
        Animal an = new Animal(6, 2);
        
        Animal an2 = new Animal(an);
        
    }
}
