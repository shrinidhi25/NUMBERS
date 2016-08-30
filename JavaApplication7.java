/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Student
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="the price of the bread is 100rs";
        String[] s1=s.split(" ");
 for(int i=0;i<s1.length;i++)
 {
     char[] a=s1[i].toCharArray();
            Arrays.sort(a);
            System.out.println(a);
 }
       
       
    }
}
