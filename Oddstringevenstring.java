/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oddstringevenstring;

/**
 *
 * @author Student
 */
public class Oddstringevenstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="program";
        String sb = " ";
        String sb1 = " ";
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
          sb+=" "+str.charAt(i);
            }
            else
            {
               sb1+=" "+str.charAt(i);
            }
          
        }
        System.out.println(sb+"   "+sb1);
        
    }
}
