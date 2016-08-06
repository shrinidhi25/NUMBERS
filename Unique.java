/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unique;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Unique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        


        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];int x; 
         x=sc.nextInt();
        for(int i=0;i<x;i++)
             arr[i]=sc.nextInt();
        for(int j=0;j<x;j++)
         for(int i=j+1;i<x;i++)
            if(arr[j]==arr[i])
            {
                arr[i]='\0';
                arr[j]='\0';
            }
        for(int i=0;i<x;i++)
        if(arr[i]!='\0')
            System.out.print( " "+arr[i]);
         
    }
}
