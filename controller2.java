class WireLessController{
	String lan;
	String wan;
	String police;
	String wifi;
	String controller;
	
	WireLessController(){
		
	}
	
	
	public static void main(String[] args){
		WireLessController controller1=new WireLessController();
		System.out.println(controller1.lan);
		System.out.println(controller1.wan);
		System.out.println(controller1.police);
		System.out.println(controller1.wifi);
		System.out.println(controller1.controller);
		
   WireLessController controller2=new WireLessController();
   controller2.lan="LAN";
   controller2.wan="WAN";
   controller2.police="Use";
   controller2.wifi="WI-FI";
   controller2.controller="Police control";
        System.out.println(controller2.lan);
		System.out.println(controller2.wan);
		System.out.println(controller2.police);
		System.out.println(controller2.wifi);
		System.out.println(controller2.controller);

	}
}