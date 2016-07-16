/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package f;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
     String s1=new String();
     String s2=new String();
     s1=sc.nextLine();
     s2=new StringBuffer(s1).reverse().toString();
     
        System.out.println("the reverse"+s2);
     
         
    }
}
