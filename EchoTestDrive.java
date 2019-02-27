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
public class EchoTestDrive {
    public static void main(String[] args) {
        Elcho el = new Elcho();
        Elcho e2 = new Elcho();
   
        int x = 0;
        while(x<4){
        el.hello();
        el.count = el.count +1;
        if(x==3){
      
        }
        if (x>0){
        }
        x = x + 1;
        }
        System.out.println(e2.count);
    }
}
