/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additionseries3;

import java.util.*;
public class AdditionSeries3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the end value ");
        a=in.nextInt();
        System.out.println("enter the number of which do you want to make a series");
        b=in.nextInt();
        c=b;
        while(b<=a){
            System.out.println(b);
            b=(b*10)+c;
        }
    }
    
}
