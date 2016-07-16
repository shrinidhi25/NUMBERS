/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package h;

/**
 *
 * @author Student
 */
public class H {

   
    public static void main(String[] args) {
    
       ar ob;
        ob = new ar();
      int s= ob.check(); 
        System.out.println(s);
    }

public static class ar{
    public  int check(){
        int[] a={6,5,4,3,7,6};
        for(int i=0;i<6;i++)
        {
            if(a[i]==i)
             return i; 
        }
        return 0;
    } 

}
}