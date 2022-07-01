/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberseries;

import java.util.*;
public class NumberSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the end value");
        a=in.nextInt();
        b=1;
        c=0;
        while(b<=a){
            while(b%2==0)
                  {
                c=c-b;
                b=b+1;
                 }
            c=c+b;
            b=b+1;
        }
        System.out.println(c+"");
    }
    
}
