/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;
/**
 *
 * @author TiehoM
 */
public class TestAnimalDrive {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog();
        animals[1] = new Wolf();
        animals[2] = new Hippo();
        animals[3] = new Cat();
        animals[4] = new Lion();
        
        Hippo h = new Hippo();
        Dog d = new Dog();
        Vet b = new Vet();
        b.giveShot(h);
        
        for(int x=0; x<animals.length; x++){
        
            System.out.print(x +" ");
            animals[x].eat();
            animals[x].sleep();
            animals[x].roam();
            animals[x].makeNoise();
        }
        System.out.println("There's " + animals.length + " animals in the array");
    }
}
