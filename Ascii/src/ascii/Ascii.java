/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii;
import java.util.*;
public class Ascii {

    public static void main(String[] args) {
        char ch;
        System.out.println("Enter a character");
        Scanner in=new Scanner(System.in);
        ch=in.next().charAt(0);
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}