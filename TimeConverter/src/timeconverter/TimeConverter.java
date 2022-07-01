/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeconverter;

import java.util.*;
public class TimeConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int m,h,x,y,z,s;

        Scanner in=new Scanner(System.in);
        System.out.println(" Enter a time in second");
        s= in.nextInt();
        m=(s/60);
        h=(s/3600);
        x=s%3600;
        y=x/60;
        z=x%60;
         System.out.println(s+" Seconds = "+ h+" hour ," + y+" minutes , "+z+" seconds");
         
        
    }
    
}
