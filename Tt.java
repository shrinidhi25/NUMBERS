/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tt;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Tt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner sc=new Scanner(System.in);
        int[] b=new int[9];
        for(int i=0;i<9;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<b.length;i++)
        {
            for(int j=i+1;j<b.length;j++)
            {
                if(b[i]==b[j])
                {
                    b[i]=-1;
                    b[j]=-1;
                }       
            }
        }
       for(int i=0;i<b.length;i++)
       {
         if(b[i]!=-1)
         {
             System.out.println(b[i]);
         }
       }
    }
    }

