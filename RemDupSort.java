import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class RemDupSort {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		int[] result = new int[30];
		if ((s = in.readLine()) != null) {
			String[] ss = s.split("\\s+");
			for (int i = 0; i < ss.length; i++) {
				result[i] = Integer.parseInt(ss[i]);

				if (map.containsKey(result[i])) {
					map.put(result[i], map.get(result[i]) + 1);
				} else {
					map.put(result[i], 1);
				}
			}
			for (Integer k : map.keySet()) {
				if (map.get(k) == 1) {
					res.add(k);
				}
			}
			Collections.sort(res);
			if (res.size() == 0) {
				System.out.println(0);
			} else {
				for (int i = 0; i < ss.length; i++) {
					if (result[i] == res.get(0)) {
						System.out.println(i+1);
						break;
					}
				}
			}
		}
	}
}
