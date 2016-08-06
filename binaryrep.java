/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
  
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] a=new int[size];
        int count=0,m=0;
        String[] b=new String[size];
         int[] c=new int[size];
          int[] d=new int[size];
        for(int i=0;i<size;i++)
        {
         a[i]=sc.nextInt();
        }
         for(int i=0;i<size;i++)
         {
             b[i]=Integer.toBinaryString(a[i]);
         }
       for(int i=0;i<size;i++)
       {
           for(int j=0;j<b[i].length();j++)
           if(b[i].charAt(j)=='1')
           {
              count++;
              c[i]=count;
           }
           count=0;
       }
      
       
       for(int i=0;i<size;i++)
         {
             for(int j=i+1;j<size-1;j++)
             {
             if(c[i]<c[j])
             {
              c[i]=c[i]+c[j];
              c[j]=c[i]-c[j];
              c[i]=c[i]-c[j];
              a[i]=a[i]+a[j];
              a[j]=a[i]-a[j];
              a[i]=a[i]-a[j];
             }
            
         }
         }
          for(int i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
         
    }
}



        
        
        
        
        
    

