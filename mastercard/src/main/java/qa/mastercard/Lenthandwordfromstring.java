package qa.mastercard;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Lenthandwordfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	}
	

	public static Map <String, String> LongestWord(String s) {
		HashMap <String, String> sentance = new HashMap<String, String>();
		int maxlength = 0;
		int wordlength = 0;
		String substring = new String ();
		String word = Integer.toString(0);
		if (s == null || s == "") {
			substring = "";
		}
		else{
			StringTokenizer token = new StringTokenizer(s, " ");
			while (token.hasMoreTokens()){
				word = token.nextToken();
				wordlength = word.length();
				if (wordlength > maxlength) {
					maxlength = wordlength;
					substring = word;
				}
			}
			sentance.put("longestword", substring);
			sentance.put("wordlenght", Integer.toString(substring.length()));
		}
			sentance.put("longestword", substring);
			sentance.put("wordlenght", Integer.toString(substring.length()));
			
			return sentance;
	}


}