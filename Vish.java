/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vish;


public class Vish {

   
    public static void main(String[] args) {
      String str="shrinidhi";
      char b;
      String s="";
      for(int i=0;i<str.length();i++)
      {
          b=str.charAt(i);
          if(b!=' ')
          {
              s=s+b;
             // System.out.println("the"+s);
              str=str.replace(b,' ');
             //  System.out.println("the"+str);
          }
          
      }
       System.out.println("the"+s);
      
    }
}
