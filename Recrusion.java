/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recrusion;

/**
 *
 * @author Student
 */
public class Recrusion {
   
    public static void main(String[] args) {
         int n=1;
     count(n);   
    }
  public static int count(int n)
     {
         if(n<=100)
         {
             System.out.println(n);    
        return count(n+1);
         } 
         else
             return 0;
     }
  
}
