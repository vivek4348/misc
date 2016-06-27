
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemUtil {

	public static List<String> alphaNumericCombinations(String phoneNumber) {
	    List<String> results = new ArrayList<String>();
	    results.add("");
	    for (int i = 0; i < phoneNumber.length(); i++) {
	        String possibleAlphaNumericCharaters = map.get(phoneNumber.charAt(i));
	        List<String> nextResults = new ArrayList<String>(possibleAlphaNumericCharaters.length() * results.size());
	        for (String prefix : results) {
	            for (int j = 0; j < possibleAlphaNumericCharaters.length(); j++) {
	            	StringBuilder sb = new StringBuilder();
	                nextResults.add(sb.append(prefix).append(possibleAlphaNumericCharaters.charAt(j)).toString());
	            }
	        }
	        results = nextResults;
	    }
	    return results;
	}

	private static final Map<Character, String> map = new HashMap<Character, String>() {
		{
			put(' ', " ");
			put('0', "0");
			put('1', "1");
			put('2', "2abc");
			put('3', "3def");
			put('4', "4ghi");
			put('5', "5jkl");
			put('6', "6mno");
			put('7', "7pqrs");
			put('8', "8tuv");
			put('9', "9wxyz");
		}
	};
	
	public static void main(String args[]) {
		/*int count = 0;
		for(String s: alphaNumericCombinations("6234563344")) {
			//System.out.println(s);
			count = count + 1;
		}
		System.out.println(count);*/
		long startTime = System.currentTimeMillis();
		System.out.println(alphaNumericCombinations("6234562345").size());
		System.out.println("The Total Time Taken is :" + (System.currentTimeMillis() - startTime));

	}
	
	
}
