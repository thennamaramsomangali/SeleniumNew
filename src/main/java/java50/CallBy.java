package java50;

public class CallBy {

	/*int data=50;  

	 void change(int data){  
	 data=data+100;//changes will be in the local variable only  
	 }  

	 public static void main(String args[]){  
	   CallBy op=new CallBy();  

	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data); */ 


	int data=50;  

	void change(CallBy op){  
		op.data=op.data+100;//changes will be in the instance variable  
	}  


	public static void main(String args[]){  
		CallBy op=new CallBy();  

		System.out.println("before change "+op.data);  
		op.change(op);//passing object  
		System.out.println("after change "+op.data);  

	}  

}
//There is only call by value in java, not call by reference. If we call a method passing a value, 
//it is known as call by value. 
//The changes being done in the called method, is not affected in the calling method.


//In case of call by reference original value is changed if we made changes in the called method.
//If we pass object in place of any primitive value, original value will be changed.
//In this example we are passing object as a value.






