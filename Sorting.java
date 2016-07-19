/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int[] d=new int[5];
        for(int j=0;j<5;j++)
        {
           d[j]=sc.nextInt();
        }
        
        for(int j=0;j<5;j++)
        {
            for(int i=j+1;i<5;i++)
            {
                int temp=d[i];
                d[i]=d[j];
                d[j]=temp;
            }
        }
         for(int j=0;j<2;j++)
         {
             System.out.println(d[j]);
         }
    }
}
