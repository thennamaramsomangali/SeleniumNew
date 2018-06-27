package allLeads;

import org.testng.annotations.Test;

public class Sample {
	
	public class DuplicateLead extends ProjectMethods {
		@Test (groups={"All"} ,enabled=false) //(groups={"regression"}) 
		//@Test (invocationCount=4,threadPoolSize=4) 
		//@Test (invocationCount=4,threadPoolSize=4,invocationTimeOut=10000) 
		//@Test (invocationCount=4)
		public void duplicateLead() throws InterruptedException {
			
			startApp("chrome", "http://leaftaps.com/opentaps");
			System.out.println("duplicate");

}
	}
}
