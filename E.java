/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Ex {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] b=new int[9];
        for(int i=0;i<9;i++)
        {
            b[i]=sc.nextInt();
        }
        Outer: for(int i=0;i<b.length;i++)
        {
            for(int j=i+1;j<b.length;j++)
            {
                if(b[i]==b[j])
                {
                    System.out.println(b[i]);
                    break Outer;
                }
            }
        }
        
                
                      
                
                
                
           
       }
        }
    

