package qa.mastercard;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSentances {

	@Test
	public void lenthofsentance () {
		String sentance = "The cow jumped over the moon";
		HashMap<String,String> map= new HashMap<String, String>();
		map = (HashMap<String, String>) Lenthandwordfromstring.LongestWord(sentance);
		Assert.assertEquals(map.get("longestword"), "jumped");
		Assert.assertEquals(map.get("wordlenght"), "6");
	}
	
	@Test
	public void lenthofsentance2 () {
		String sentance = "God is Great";
		HashMap<String,String> map= new HashMap<String, String>();
		map = (HashMap<String, String>) Lenthandwordfromstring.LongestWord(sentance);
		Assert.assertEquals(map.get("longestword"), "Great");
		Assert.assertEquals(map.get("wordlenght"), "5");
	}
	
	@Test
	public void lenthofsentance3 () {
		String sentance = "Good Morning to Everyone";
		HashMap<String,String> map= new HashMap<String, String>();
		map = (HashMap<String, String>) Lenthandwordfromstring.LongestWord(sentance);
		Assert.assertEquals(map.get("longestword"), "Everyone");
		Assert.assertEquals(map.get("wordlenght"), "8");
	}
	
	@Test
	public void lenthofsentance4 () {
		String sentance = "";
		HashMap<String,String> map= new HashMap<String, String>();
		map = (HashMap<String, String>) Lenthandwordfromstring.LongestWord(sentance);
		Assert.assertEquals(map.get("longestword"), "");
		Assert.assertEquals(map.get("wordlenght"), "0");
	}
	
	@Test
	public void lenthofsentance5 () {
		String sentance = null;
		HashMap<String,String> map= new HashMap<String, String>();
		map = (HashMap<String, String>) Lenthandwordfromstring.LongestWord(sentance);
		System.out.println(map.get("longestword"));
		System.out.println(map.get("wordlenght"));
		Assert.assertEquals(map.get("longestword"), "");
		Assert.assertEquals(map.get("wordlenght"), "0");
	}
}
