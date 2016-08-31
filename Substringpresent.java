/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package substringpresent;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 *
 * @author Student
 */
public class Substringpresent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String string1 = "abate"; 
String string2 = "beat";
String str= "bat";

System.out.println("Search1="+string1.toUpperCase().contains(str.toUpperCase()));

System.out.println("Search2="+string2.toUpperCase().contains(str.toUpperCase()));
    }
}
