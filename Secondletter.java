/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package secondletter;

/**
 *
 * @author Student
 */
public class Secondletter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int n=71777,d,e=0;
      while(n!=0)
      {
        d=n%10;
        if(d==7)
        {
          e++;  
        }
        n=n/10;
      }
        System.out.println(e);  
        
 
    }
}
