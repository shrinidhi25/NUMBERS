/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rev;

/**
 *
 * @author Student
 */
public class Rev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="shrinidhi";
        String a;
        a=new StringBuffer(s).reverse().toString();
        System.out.println(a);
    }
}
