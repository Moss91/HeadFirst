/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

/**
 *
 * @author TiehoM
 */
public class Shuffle1 {
    public static void main(String[] args) {
        int x = 3;
        if(x>2){
            System.out.print("a");
        }
        
        x = x -1;
        System.out.print("-");
        
        if (x == 2) {
            System.out.print("b c");
        } 
        
            x = x -1;
            System.out.print("-");
        
        while(x>0){
            if (x == 1) {
                System.out.print("d\n");
                x = x - 1;
             }
        }
    } 
}
        
