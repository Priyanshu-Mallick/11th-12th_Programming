/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

import java.util.*;
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int y;
        Scanner in=new Scanner(System.in);
       System.out.println("Enter a year as your choice then i will tell you whether it is a leapyear or not");
       y=in.nextInt();
       if (y%100==0){
           if(y%400==0)
                        {
               System.out.println(y+" is a leapyear");
                         }
           else{
               System.out.println(y+" is not a leapyear");
           }
       }
       else{
           if(y%4==0)
                       {
               System.out.println(y+" is a leapyear");
               
                       }
           else{
               System.out.println(y+" is not a leap year");
           }
       }
    }
    
}
