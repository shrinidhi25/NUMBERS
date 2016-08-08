/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package volandsurcuboib;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Volandsurcuboib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner  sc=new Scanner(System.in);
         int l=sc.nextInt();
          int b=sc.nextInt();
           int h=sc.nextInt();
           int tsa=2*((l*b)+(b*h)+(h*l));
           int vol=(l*b*h);
           System.out.println(tsa+" "+vol);
    }
}
