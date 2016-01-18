/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Bhargav
 */

public class sample {
   int e=0;
    public static void main(String args[]) throws IOException {
        
        BufferedReader bg=new BufferedReader(new InputStreamReader(System.in));
        String s;
       s=bg.readLine(); 
       sample pain=new sample();
pain.set(s);
        
        
        
        
        args=new String[2];int i;
        for (i=0;i<14;i++){System.out.println(i);}System.out.println(i);
args[0]="3.0";args[1]="2.0";
System.out.println("run"+'b');


        // this program requires two 
        // arguments on the command line 
        if (args.length == 2) {
            // convert strings to numbers
            float a = (Float.valueOf(args[0])); 
            float b = (Float.valueOf(args[1]));

            // do some arithmetic
            System.out.println("a + b = " +
                               (a + b));
            System.out.println("a - b = " +
                               (a - b));
            System.out.println("a * b = " +
                               (a * b));
            System.out.println("a / b = " +
                               (a / b));
            System.out.println("a % b = " +
                               (a % b));
        } else {
            System.out.println("This program " +
                "requires two command-line arguments.");
            
        }
    }
    String set(String s){
        while(e<s.length()){
            char b=s.charAt(e);
            
            System.out.println();
            e=e+1;if(b=='5'){run(s);
        }
    }
  
    return s;
}
    void run(String s){;while(e<s.length()){System.out.println("number");e=e+1;
        char b=s.charAt(e);if(b=='5'){set(s);
        }System.out.println("footer");
        
        System.out.println(e);
            }
    }}
