
package javaapplication68;

import java.util.*;

/**
 *
 * @author hp
 */
public class JavaApplication68 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String s1 ;
       int a;
        Scanner in= new Scanner (System.in);
        System.out.println("Enter a word");
        s1=in.next();
        a=s1.length();
              System.out.println("the last 4 letters of your word is :"+s1.substring(a-4));
        }
     
    }
    

    
    
