/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adyant;

import java.util.*;
public class Adyant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        String n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a name do you want to print");
        n=in.next();
        System.out.println("Enter how many time do you want to print");
        a=in.nextInt();
        b=1;
        while(b<=a){
            System.out.println(n);
            b=b+1;
        }
       
        
    }
    
}
