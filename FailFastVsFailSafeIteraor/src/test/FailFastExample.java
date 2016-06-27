package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastExample
{
    
    
	public static void main(String[] args) {
		 //testFailFast();

		testFailSafe();        
    }

	private static void testFailSafe() {
		ConcurrentHashMap<String, String> concurrentPhoneMap = new ConcurrentHashMap<String, String>();
		concurrentPhoneMap.put("Apple", "iPhone");
		concurrentPhoneMap.put("HTC", "HTC one");
		concurrentPhoneMap.put("Samsung", "S5");

		Iterator<String> iterator = concurrentPhoneMap.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(concurrentPhoneMap.get(iterator.next()));
			concurrentPhoneMap.put("Sony", "Xperia Z");
		}
		Iterator<String> iterator2 = concurrentPhoneMap.keySet().iterator();
		while (iterator2.hasNext()) {
			System.out.println(concurrentPhoneMap.get(iterator2.next()));
			
		}
	}

	private static void testFailFast() {
		Map<String,String> phoneMap = new HashMap<String,String>();
        phoneMap.put("Apple", "iPhone");
        phoneMap.put("HTC", "HTC one");
        phoneMap.put("Samsung","S5");
        
        Iterator<String> iterator = phoneMap.keySet().iterator();
        
        while (iterator.hasNext())
        {
            System.out.println(phoneMap.get(iterator.next()));
            phoneMap.put("Sony", "Xperia Z");
        }
	}
    
}