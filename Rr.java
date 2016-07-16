/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rr;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Rr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
       int s=sc.nextInt();
       int n=0;
       while(s!=0)
       {
       n=(n*10)+s%10;
       s=s/10;
       }
        System.out.println("the valve"+n);
       
    }
    }

