/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int[] a=new int[8];
        for(int j=0;j<a.length;j++)
        {
            a[j]=sc.nextInt();
        }
        if(a[0]==a[2]&&a[4]==a[6]&&a[1]==a[7]&&a[3]==a[5])
        {
            System.out.println("square");
        }
        
    }
}
