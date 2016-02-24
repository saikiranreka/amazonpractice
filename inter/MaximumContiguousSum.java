package inter;

public class MaximumContiguousSum {

	public static void main(String[] args) {
		int[] arr = new int[] { -2, 1, -3, 4, -1, 2, 1, -5,4 };
		int curr_max = arr[0];
		int total_max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			curr_max = Math.max(curr_max + arr[i], arr[i]);
			if (curr_max > total_max) {
				total_max = curr_max;
			}
		}
System.out.println(total_max);
	}

}
