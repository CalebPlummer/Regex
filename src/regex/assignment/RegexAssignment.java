/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex.assignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author cplummer
 */
public class RegexAssignment {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        s.close(); 
        Pattern numberFormat = Pattern.compile("[(]?([0-9]{3})[).-][' ']?([0-9]{3})[.-]([0-9]{4})");
        Matcher match = numberFormat.matcher(input);
        
        
        if(match.matches())
        {
            String g1 = match.group(1);
            String g2 = match.group(2);
            String g3 = match.group(3);
            System.out.println("Your number matches the format");
            System.out.println("(" + g1 + ") " + g2 + "-" + g3);
        }
        else
        {
            System.out.println("Your number does not match the correct format, please enter the correct format.419.330.9240");
        }
    }
    
}
