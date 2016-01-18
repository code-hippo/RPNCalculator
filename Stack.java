/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assign;
import java.io.*;
import java.util.Iterator;
import java.util.EmptyStackException;
/**
 *
 * @author Bhargav
 */

  public interface Stack { 
    public void push( Object o) ; 
    public Object pop(); 
    public boolean isEmpty(); 
    public Object top(); 
  } 
class Arraystack implements Stack{
    int n=0;
    Object[] anArray=new Object[1000];
        public void push(Object o)
        {n=n+1;anArray[n-1]=o;
        
       
          }
        
        
    
    public Object pop()  
     {if(anArray==null){throw new EmptyStackException();}
 
 int i;Object y;
        y= anArray[n-1];
        n=n-1;
         return y;
     }
    public boolean isEmpty(){
         if(anArray.length == 0)
         {
             return true;}
         else {return false;}
         
    
}
public Object top(){
         return anArray[0];
 }
 
}
