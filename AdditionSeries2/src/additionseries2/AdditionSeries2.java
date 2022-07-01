/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additionseries2;

import java.util.*;

/**
 *
 * @author hp
 */
public class AdditionSeries2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the end value");
        a= in.nextInt();
      b=a*(a+1)/2;
      System.out.println("The sum of the " +a+" numbers is "+b);
    }
    
}
