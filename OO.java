/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oo;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class OO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=0)
        {
            System.out.println("it is positive");
        }
        else
        {
            System.out.println("it is negative");
        }
    }
}
