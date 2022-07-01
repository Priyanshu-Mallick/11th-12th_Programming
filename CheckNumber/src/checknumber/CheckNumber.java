/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checknumber;

import java.util.*;
public class CheckNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application  logic here
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        a= in.nextInt();
        if(a>0){
            System.out.println(a+"  is a positive number");
                 }
        else{
            if(a<0){
                System.out.println(a+" is  a negative number");
            }
            else {
                System.out.println("The number you chosen  is zero");
            }
        }
    }
    
}
