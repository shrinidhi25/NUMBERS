/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farentocel;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Farentocel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner  sc=new Scanner(System.in);
        double c=sc.nextInt();
        double f=c*1.8+32;
        System.out.println("Farenhite="+f);
    }
}
