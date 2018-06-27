package learningOOPS;

public class PolyB extends PolyA {
	
	public static void main(String[] args) {
		
		PolyB obj=new PolyB();
		
		obj.show();
		//obj.run();
		
	}

	//if below method defined then obj will call this method(from PolyB) and not the method from PolyA.this is method overriding
	//if not declared and defined it will call method from PolyA
	
	
	@Override
	public void show() {  
		System.out.println("empty of polyB");
	}
	
	
	
	// @Override
	// void run() { } //final method can not be overridden
	
}

