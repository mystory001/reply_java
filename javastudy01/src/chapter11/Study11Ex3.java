package chapter11;

import java.util.*;

public class Study11Ex3 {
	
	public static String printBar(char ch, int value) { 
		char[] bar = new char[value]; 

		for(int i=0; i < bar.length; i++) { 
			bar[i] = ch; 
		} 

		return new String(bar); 	// String(char[] chArr)
	}

	public static void main(String[] args) {

		String[] data = {"A","B","A","B","C","B","A","B","B","D","F"};
		
		HashMap map = new HashMap();
		
		for(int i = 0 ; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				int value = (int)map.get(data[i]);
				map.put(data[i], value + 1);
			} else {
				map.put(data[i], 1);
			}
		}
		
		Iterator it = map.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = (int)entry.getValue();
			System.out.println(entry.getKey() + " : " + printBar('#',value) + " " + value);
		}
		
	}

}
