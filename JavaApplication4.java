/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        // TODO code application logic here
         int r,i,j,c,temp,k = 0;
        int[] a=new int[100];
        int[][] arr1=new int[10][10];
Scanner sc=new Scanner(System.in);  
 r=sc.nextInt();
c=sc.nextInt();
for(i=0;i<c*r;i++)
a[i]=sc.nextInt();
for(i=0;i<r*c;i++)
for(j=i+1;j<r*c;j++)
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
for(i=0;i<r;i++)
for(j=0;j<c;j++)
{
arr1[i][j]=a[k];
k++;
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
    System.out.print(arr1[i][j]);
}
    System.out.println(""); 
    }

    
    }
}
