/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear2;

import java.util.*;
public class LeapYear2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a year");
        a=in.nextInt();
        if(a%100==0)
        {
            if(a%400==0)
            {
                System.out.println(a+" is a leap year");
            }
            else{
                System.out.println(a+" is not a leap year");
            }
        }
        else{
                if(a%4==0){
                    System.out.println(a+ " is a leap year");
                }
                else{
                    System.out.println(a+" is not a leap year");
                }
            }
     
    }
    
}
