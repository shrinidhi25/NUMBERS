/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mul;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Mul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        int a;
        for(int i=0;i<=100;i++)
        {
             a=sum*i;
             System.out.println(a);
        }
        
    }
}
