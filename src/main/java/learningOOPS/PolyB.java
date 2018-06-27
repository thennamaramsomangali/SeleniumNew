package learningOOPS;

public class PolyB extends PolyA {
	
	public static void main(String[] args) {
		
		PolyB obj=new PolyB();
		
		obj.show();
		
	}

	//if below method defined then obj will call this method(from PolyB) and not the method from PolyA.this is method overriding
	//if not declared and defined it will call method from PolyA
	
	public void show() {  
		System.out.println("empty of polyB");
	}
	
	
}

