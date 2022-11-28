package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstMostDuplicate {

	public static void main(String[] args) {
		String str ="ababaaaabbbccccccccc";
		System.out.println(str.length());
		char[] textchar1 = str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for (int i = 0; i < textchar1.length; i++) {
	           if (map.containsKey(textchar1[i])) {
	        	   map.put(textchar1[i],map.get(textchar1[i])+1);
	           }
	           else {
	        	   map.put(textchar1[i], 1);
	           }
			}
	           System.out.println(map);
	           int maxOcc=0;
	           char key=0;
	           Set<Entry<Character, Integer>> entrySet = map.entrySet();
	           for (Entry<Character, Integer> entry : entrySet) {
				int value = entry.getValue();
				if(value>maxOcc) {
					key=entry.getKey();
					maxOcc=entry.getValue();
				}
				}
	           System.out.println(key);
	           System.out.println(maxOcc);
			}

	}


