/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naturalnumber;

import java.util.*;
public class NaturalNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the end value");
        a=in.nextInt();
        b=1;
        while(b<=a)
        {
            System.out.println(b);
            b=b+1;
        }
    }
    
}
