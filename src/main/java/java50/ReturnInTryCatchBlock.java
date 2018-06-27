package java50;

public class ReturnInTryCatchBlock {


	public int add() {

		try {
			System.out.println(1/0+"try/catch");
			return 0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return 1;
		}
		//return 2;  //use return out of catch block //best practises

	}
	public static void main(String[] args) {

		ReturnInTryCatchBlock obj=new ReturnInTryCatchBlock();
		//obj.add();
		int a = obj.add();
		System.out.println(a);


	}

}
