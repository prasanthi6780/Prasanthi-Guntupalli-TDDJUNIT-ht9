package com.epam.Prasanthi_Guntupalli_TDDJUNIT;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RemoveAin2CharactersOfStringTest{
	@Test
	public void removeAchars() {
		RemoveAin2CharactersOfString ra = new RemoveAin2CharactersOfString();
		String actual = ra.removeA("");
		assertEquals("",actual);
	}
	@Test
	public void removeAchars1() {
		RemoveAin2CharactersOfString ra = new RemoveAin2CharactersOfString();
		String actual = ra.removeA("A");
		assertEquals("",actual);
	}
	@Test
	public void removeAchars2() {
		RemoveAin2CharactersOfString ra = new RemoveAin2CharactersOfString();
		String actual = ra.removeA("BAB");
		assertEquals("BB",actual);
	}
	@Test
	public void removeAchars3() {
		RemoveAin2CharactersOfString ra = new RemoveAin2CharactersOfString();
		String actual = ra.removeA("BCA");
		assertEquals("BCA",actual);
	}
	@Test
	public void removeAchars4() {
		RemoveAin2CharactersOfString ra = new RemoveAin2CharactersOfString();
		String actual = ra.removeA("ABCD");
		assertEquals("BCD",actual);
	}
	@Test
	public void removeAchars5() {
		RemoveAin2CharactersOfString ra=new RemoveAin2CharactersOfString();
	    	
		String actual = ra.removeA("AACD");
		assertEquals("CD",actual);
	}
	@Test
	public void removeAchars6() {
		RemoveAin2CharactersOfString ra=new RemoveAin2CharactersOfString();
	    	
		String actual = ra.removeA("BACD");
		assertEquals("BCD",actual);
	}
	@Test
	public void removeAchars7() {
		RemoveAin2CharactersOfString ra=new RemoveAin2CharactersOfString();
	    	
		String actual = ra.removeA("BBAA");
		assertEquals("BBAA",actual);
	}
	@Test
	public void removeAchars8() {
		RemoveAin2CharactersOfString ra=new RemoveAin2CharactersOfString();
	    	
		String actual = ra.removeA("AABAA");
		assertEquals("BAA",actual);
	}
	


}