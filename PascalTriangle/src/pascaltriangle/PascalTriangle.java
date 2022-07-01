/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascaltriangle;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class PascalTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1,d=0,p=0,a=1,b=1,c=1,e=1,f=1,g=1,s=1,t=1,u=1;
        int x,y,z,w,j;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the end value");
        x=in.nextInt();
        while(i<=x){
            j=0;
            p=i+1;
            while(j<=i){
                while(p<=x){
                    System.out.print(" ");
                    p=p+1;
                }
                z=i-j;
                while(a<=j){
                    s=s*a;
                    a=a+1;
                }
                d=s;
                while(b<=j){
                    f=f*b;
                    b=b+1;
                }
                c=f;
                while(e<=z){
                    t=t*e;
                    e=e+1;
                }
                y=t;
                w=d/(c*y);
                System.out.print(w);
                System.out.print(" ");
                j=j+1;
            }
           System.out.println();
           i=i+1;
        }
    }
    
}
