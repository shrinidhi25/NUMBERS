/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringlong;

/**
 *
 * @author Student
 */
public class Stringlong {

    /**
     * @param args the command line arguments
     */
    public static String main(String[] args) {
        // TODO code application logic here
        
         String longPre = "";
        String[] strs = null;
    if(strs.length>0)
    {
        longPre = strs[0];
    }
    for(int i=1; i<strs.length; i++)
    {
        String analyzing = strs[i];
        int j=0;
        for(; j<Math.min(longPre.length(), strs[i].length()); j++){
            if(longPre.charAt(j) != analyzing.charAt(j)){
                break;
            }
        }
        longPre = strs[i].substring(0, j);
    }
return longPre; 
    }
    
}
