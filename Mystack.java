import java.io.*;
import java.util.*;

 class Mystack
{
   	
            Vector v=new Vector();
            
	    	public void push(Object o)
            {
                v.add(o);
            }

            public Object pop() 
            {
				
				
				
				Object o=v.remove();
				return o;
		
            }

	   
    
}
    