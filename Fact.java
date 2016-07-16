/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fact;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Fact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc=new Scanner(System.in);
          int s=sc.nextInt();
          int fact=1;
          for(int i=1;i<=s;i++)
          {
             fact=fact*i; 
          }
          System.out.println(+fact);
    }
}
