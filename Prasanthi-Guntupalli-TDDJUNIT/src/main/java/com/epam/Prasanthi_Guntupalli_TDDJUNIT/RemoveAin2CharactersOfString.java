package com.epam.Prasanthi_Guntupalli_TDDJUNIT;
public class RemoveAin2CharactersOfString 
{
	public String removeA(String str1)
	{
		if(str1.length()>=2) 
		{
			if(str1.charAt(0)=='A' && str1.charAt(1)!='A') 
			{
				str1=str1.substring(1);
			}
			else if(str1.charAt(0)!='A' && str1.charAt(1)=='A')
			{
				str1=str1.charAt(0)+str1.substring(2);
			}
			else if(str1.charAt(0)=='A'  &&  str1.charAt(1)=='A')
			{
				str1=str1.substring(2);
			}
			return str1;
		}
		else 
		{
			if(str1.length()==1)
			{
				if(str1.charAt(0)=='A')
				{
					str1=str1.substring(1);
				}
				return str1;
			}
			else
			{
				return str1;
			}
		}
	}

}
