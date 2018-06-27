package java50;

public class SumOfFirst10PrimeNum1 {

	public static void main(String[] args) {

		int count=1;int num=2;int c=0;int sum=2;
		while(count<=10) {

			for (int i = 2; i <=num ; i++) {
				if(num%i==0) {
					c++;
				}

			}

			if(c==1) {
				System.out.println(num);
				sum=sum+num;
				count++;
			}
			num++;
			c=0;
		}
		System.out.println(sum);
	}

}
