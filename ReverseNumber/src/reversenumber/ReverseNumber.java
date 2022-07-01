/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversenumber;

import java.util.*;
public class ReverseNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter a number");
        a=in.nextInt();
        b=0;
        d=a;
        while(a>0){
            c=a%10;
            b=b*10+c;
            a=a/10;
        }
         if(d==b){
             System.out.println(d+" is  a palendom number");
         }
         else{
             System.out.println(d+" is not a palendrom number");
         }
        
    }
    
}
