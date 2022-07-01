/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factors;

import java.util.*;
public class Factors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        a=in.nextInt();
        b=1;
        while(b<=a){
            if(a%b==0){
                System.out.println(b);
            }
            b=b+1;
        }
    }
    
}
