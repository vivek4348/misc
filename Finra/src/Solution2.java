
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {

	
	
	public static void main(String args[]) {
		/*int count = 0;
		for(String s: alphaNumericCombinations("6234563344")) {
			//System.out.println(s);
			count = count + 1;
		}
		System.out.println(count);*/
		long startTime = System.currentTimeMillis();
		System.out.println(letterCombinations("623").size());
		System.out.println("The Total Time Taken is :" + (System.currentTimeMillis() - startTime));
		
		// 1
		// 2
		


		// RV
		// VG
		// OD
		
		// 10
		// Vivek End.

	}
	
	private static final Map<Character, String> letterMap = new HashMap<Character, String>() {
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
    
    public static ArrayList<String> letterCombinations(String digits) {
        char[] cs = new char[digits.length()];
        ArrayList<String> res = new ArrayList<String>();
        appendDigits(digits, 0, cs, res);
        return res;
    }
    
    private static void appendDigits(String digits, int i, char[] cs, ArrayList<String> res){
        if(i == digits.length()){
            res.add(new String(cs));
            return;
        }
        String letters = letterMap.get(digits.charAt(i));
        for(int j = 0; j < letters.length(); j++){
            cs[i] = letters.charAt(j);
            appendDigits(digits, i + 1, cs, res);
        }
    }
}
