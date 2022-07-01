/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package division;

import java.util.*;
public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        Scanner in=new Scanner(System.in);
        System.out.println("enter your percentage");
        x=in.nextInt();
        if (x>=60)
        {
            System.out.println("First Division");
        }
        else
        {
            if(x>=40)
            {
                System.out.println("Second Division");
            }
            else
            {
                if(x>=30)
                {
                    System.out.println("Gandhi division(Third Division)");
                }
                else{
                    System.out.println(" Kahniki patha padhuchu re gadha fail heichu gharaku ja heri");
                }
            }
        }
    }
    
}
