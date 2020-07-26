package org.epam.junit;

public class Junit implements Verify {
	public String accept(String str)
	{   
	        String s="";
		
	      int l=str.length();
		if(l>=2)
		{
			if(str.charAt(0)!='A')
			{
				s=s+str.charAt(0);
				
			}
			if(str.charAt(1)!='A')
			{
				s=s+str.charAt(1);
				
			}
			if(l>2)
			{
				
				s=s+str.substring(2,l);
				
			}
		
			
		}
		else
		{
			if(l==1)
			{
				if(str.charAt(0)!='A')
				{
					s=s+str.charAt(0);
					
				}	
				
				
			}
			}
		
		
	   return(s);
	}

}
