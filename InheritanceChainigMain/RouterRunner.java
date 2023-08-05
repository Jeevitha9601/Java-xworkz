package InheritanceChainigMain;

import InheritanceChaining.BroadCast;
import InheritanceChaining.Router;

public class RouterRunner {

	public static void main(String[] args) {
	Router 	router=new Router(5,"WAN","To differnt network","BP","MDC");
	System.out.println(router.ipAddress); 
	System.out.println(router.layer); 
	System.out.println(router.use); 
	System.out.println(router.transferData); 
	System.out.println(router.material); 
	System.out.println("==================================");
	
	Router broadCast=new BroadCast();
	System.out.println(broadCast.ipAddress); 
	System.out.println(broadCast.layer); 
	System.out.println(broadCast.use); 
	System.out.println(broadCast.transferData); 
	System.out.println(broadCast.material); 

	}

}
