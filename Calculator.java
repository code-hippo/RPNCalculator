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
public class Calculator {
static     int e=0;
     int u=0;
     String output="";
    
    Arraystack op=new Arraystack();static char l;
    
    /**
     *
     * @param args
     * @throws IOException
     */
  
    public static void main(String[] r) throws IOException{
               BufferedReader bg=new BufferedReader(new InputStreamReader(System.in));
        String s=bg.readLine(); 
    RPNcalculator str =new RPNcalculator();
    Calculator g=new Calculator();
    g.convertExpression(s);
    str.evaluateRPN(g.convertExpression(s));
   
    
   }
    public String convertExpression ( String s)
    {
        
       
    
        
    while(e<s.length()){
   char b=s.charAt(e);
   
   
   
   
   
   if (b!='('&&b!=')'&&b!='+'&&b!='-'&&b!='*'&&b!=' ')
   {output=output+b;e=e+1;if(e<s.length()){if(s.charAt(e)!='('&&s.charAt(e)!=')'&&s.charAt(e)!='+'&&s.charAt(e)!='-'&&s.charAt(e)!='*'&&s.charAt(e)!=' ')
   {}
   else {output=output+' ';if(e<s.length()){if(s.charAt(e)=='*'){}else{while(u>0){l=(Character)(op.pop());output=output+l;u=u-1;}}
   }}}}
       
   
   else if(b=='*'){op.push(b);e=e+1;
   u=u+1;}
   else if (b=='-'){op.push(b);e=e+1;u=u+1;
       
   
           }
   else if (b=='+'){op.push(b);e=e+1;u=u+1;
   }
   else if(b==' '){e=e+1;}
   else if(b=='('){e=e+1;
       convertExpression(s);} 
   
   
   
  
    
   else if(b==')'){while(u>0){l=(Character)(op.pop());output=output+l;u=u-1;}e=e+1;}

   
   }
    
   while(u>0){l=(Character)(op.pop());output=output+l;u=u-1; 
    }
   System.out.println(output);
    return output;
    
    
    }
  


}
