/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortchech;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Sortchech {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] n=new int[size];
        int flag=0;
        for(int i=0;i<size;i++)
        {
            n[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++)
        {
          if(n[i]>n[i+1])
          {
            flag=1;
          }
        }
        if(flag==1)
        {
            System.out.println("the array is not sorted");
        }
        else
        {
            System.out.println("the is sorted");
        }
    }
}
