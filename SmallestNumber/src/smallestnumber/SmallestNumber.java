/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallestnumber;

import java .util.*;
public class SmallestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("enter three numbers");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a<b & a<c){
            System.out.println(a+" is the smalest number among above three numbers");
        }
        else {
            if(b<c){
            System.out.println(b+" is the smalest number among above three numbers");
                    }
            else {
                System.out.println(c+" is the smalest number among above three numbers");
            }
              }
        
    }
    
}
