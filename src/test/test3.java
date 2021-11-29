
package test;

import java.util.HashMap;
import java.util.Map;

public class test3 {

	static int[] myArray = { 1, 3, 1, 5, 5 };
	static int n = 8;


	public static void main(String args[]) {

		Map<Integer, Integer> avalue = new HashMap<>();
		

		for (int v : myArray) {
			if (!avalue.containsKey(v)) {
				avalue.put(v, 1);
			} else {
				Integer val=avalue.get(v);
				avalue.remove(v);
				avalue.put(v, val+1);
			}
		}

		
		for (Map.Entry<Integer, Integer> entry : avalue.entrySet()) {

			if (entry.getValue() == 1) {
				String word = "*";
				System.out.println(entry.getKey() + ":" + word);
			} else if (entry.getValue() == 2) {
				String word = "**";
				System.out.println(entry.getKey() + ":" + word);
			} else if (entry.getValue() == 3) {
				String word = "***";
				System.out.println(entry.getKey() + ":" + word);
			} else if (entry.getValue() == 4) {
				String word = "****";
				System.out.println(entry.getKey() + ":" + word);
			}
		}
	}

}
