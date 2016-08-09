/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Pro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="is4hf56hgh124";
        Scanner sc=new Scanner(System.in);
         char[] a={'0','1','2','3','4','5','6','7','8','9'};
         for(int i=0;i<str.length();i++)
         {
          for(int j=0;j<a.length;j++)  
          {
            if((char)str.charAt(i)==a[j])  
            {
                System.out.print(a[j]);  
            }
          }
         
         }
    }
}
