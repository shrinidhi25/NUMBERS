/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package isogram;

/**
 *
 * @author Student
 */
public class Isogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="subdermatoglyphic";
        String str1="book";
        int flag=0;
        for(int i=0;i<=str.length()-1;i++)
        {
             for(int j=i+1;j<str.length();j++)
             {
            if(str.charAt(i)==str.charAt(j))
            {
              flag=1;
            }
        }}
        if(flag==0)
        {
            System.out.println("isogram");
        }
        else
        {
            System.out.println("non-isogram");
        }
    }
}
