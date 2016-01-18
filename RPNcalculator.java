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
public class RPNcalculator {
           
           int i=0;
          int t=0;
          int[] p=new int[1000];
          
           public static void main(String[] a) throws IOException{
               BufferedReader bg=new BufferedReader(new InputStreamReader(System.in));
        String s=bg.readLine(); 
        RPNcalculator w=new RPNcalculator();
        w.evaluateRPN(s);
           
           
           
           }
           void evaluateRPN(String s)
           {int k;Arraystack Array;Array = new Arraystack();
              
        
  while(i<s.length())
       {
           
        
        char b=s.charAt(i);
        if (s.length()==1){System.out.println(Character.getNumericValue(b));i=s.length();}
        else if(s.length()==0){System.out.println("string not entered");}
        else if (b=='*'){i=i+1;
            Array.push((int)(Array.pop())*(int)(Array.pop()));
            
            }
        else if(b=='+'){
            i=i+1;
            Array.push((int)(Array.pop())+(int)(Array.pop()));
           }
        else if(b=='-'){i=i+1;
        
            Array.push(-(int)(Array.pop())
                    +(int)(Array.pop()));
        }
        else if(b==' '){i=i+1;
            }
        else {
            int c=Character.getNumericValue(b);
            t=t*10+c;i=i+1;if (s.charAt(i) =='-'||s.charAt(i)=='+'||s.charAt(i)=='*'||(s.charAt(i))==' ')
            { Array.push(t);t=0;
            }         }}
        System.out.println(Array.top());
}
}
    
              
