package java50;

public class MissingNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total_num=4;
		int[] numbers = new int[]{1,2,4};
		int expected_num_sum = total_num * ((total_num + 1) / 2);
		System.out.println(expected_num_sum);
		int num_sum = 0;
		for (int i: numbers) {
			System.out.println(i);
			System.out.println(num_sum);
			num_sum += i;
			System.out.println("============");
			System.out.println(num_sum);
		}
		System.out.print( expected_num_sum - num_sum);
		System.out.print("\n");
		
	}

}
