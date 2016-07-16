/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Reverse {

   
    public static void main(String[] args) {
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
