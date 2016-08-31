/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package secondsmallelement;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Student
 */
public class Secondsmallelement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] n=new int[size];
        for(int i=0;i<size;i++)
        {
            n[i]=sc.nextInt();
        }
        Arrays.sort(n);
        System.out.println(n[1]);
        
    }
}
