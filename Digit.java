/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package digit;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Digit {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String str=new String();
     String str2=new String();
     str=sc.nextLine();
     str2=new StringBuffer(str).reverse().toString();
     
        System.out.println("the reverse"+str2);
     
         
     
    }
}
