import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringTools {

	@Test
	public void count() {
		assertTrue(StringTools.count("fred", 'd')==1);
		assertTrue(StringTools.count("fred marr", ' ')==1);
		assertTrue(StringTools.count("fred marr", 'z')==0);
		assertTrue(StringTools.count("fred marr", 'r')==3);
		assertTrue(StringTools.count("", ' ')==0);
	}
	
	@Test
	public void countSubstring() {
		assertTrue(StringTools.countSubString("Mississipi", "issi")==2);
		assertTrue(StringTools.countSubString("bbbbb", "b")==5);
		assertTrue(StringTools.countSubString("sexc", "c")==1);
		assertTrue(StringTools.countSubString("", "")==1);
		assertTrue(StringTools.countSubString("bbbts", "bb")==2);
	}
	
	@Test
	public void reverse() {
		assertTrue((StringTools.reverse("lmao")).equals("oaml"));
		assertTrue((StringTools.reverse("fred")).equals("derf"));
		assertTrue((StringTools.reverse("")).equals(""));
		assertTrue((StringTools.reverse("xxx")).equals("xxx"));
		assertTrue((StringTools.reverse("123 ")).equals(" 321"));
	}
	
	@Test
	public void expand() {
		assertTrue((StringTools.expand("lmao")).equals("lmmaaaoooo"));
		assertTrue((StringTools.expand("")).equals(""));
		assertTrue((StringTools.expand("xx")).equals("xxx"));
		assertTrue((StringTools.expand("lm ao")).equals("lmm   aaaaooooo"));
	}
	
	@Test
	public void alternating() {
		assertTrue((StringTools.alternating("lmao", "sexy"))
				.equals("lsmeaxoy"));
		assertTrue((StringTools.alternating("", "sexy"))
				.equals("sexy"));
		assertTrue((StringTools.alternating("sexy", ""))
				.equals("sexy"));
		assertTrue((StringTools.alternating("lmaolol", "sexy"))
				.equals("lsmeaxoylol"));
		assertTrue((StringTools.alternating("lmao", "sexyfuck"))
				.equals("lsmeaxoyfuck"));
	}
	
	@Test
	public void linkExtractor() {
		assertNull(StringTools.linkExtractor("lol"));
		assertNull(StringTools.linkExtractor(""));
		assertTrue((StringTools.linkExtractor("losdbhshref=\"fuck you \"ians"))
				.equals("href=\"fuck you \""));
		assertTrue((StringTools.linkExtractor
				("losdbhshref   =   \"fuck you\"ians"))
				.equals("href   =   \"fuck you\""));
		assertTrue((StringTools.linkExtractor("losdbhs  href= \"fuck you\""))
				.equals("href= \"fuck you\""));
		assertNull(StringTools.linkExtractor("losdbhshef=\"fuck you\"ians"));
		assertNull(StringTools.linkExtractor("losdbhshref4=\"fuck you\"ians"));
		assertNull(StringTools.linkExtractor("losdbhshref=2\"fuck you\"ians"));
		assertNull(StringTools.linkExtractor("losdbhshref=\"fuck youians"));
		assertNull(StringTools.linkExtractor("losdbhshref=fuck youians"));
		assertNull(StringTools.linkExtractor("losdbhshref\"fuck you\"ians"));
	}
	
	@Test
	public void testLinkExtractor() {
		String a = "asdhref = \"72911href = \" 12.2.1.2 \"ds";
		assertTrue(StringTools.linkExtractor(a).equals("href = \" 12.2.1.2 \"")
				);
	}
	


}
