package Amazon;

import java.util.ArrayList;

public class LNDS {

	public static void main(String[] args) {
		int[] array = new int[] { 8, 6, 1, 7, 2, 5, 3, 4 };
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		res.add(new ArrayList<Integer>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(array[0]);
			}
		});
		for (int i = 1; i < array.length; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int j = 0; j < i; j++) {
				ArrayList<Integer> temp2 = res.get(j);
				if (temp2.get(temp2.size() - 1) <= array[i]
						&& temp.size() < temp2.size()) {
					temp = new ArrayList<Integer>();
					temp.addAll(res.get(j));
				}

			}
			temp.add(array[i]);
			res.add(temp);
		}
		for (int i = 0; i < res.size(); i++){
			for (Integer t : res.get(i)) {
				System.out.print(t+" ");
			}
			System.out.println();
		}
	}
}
