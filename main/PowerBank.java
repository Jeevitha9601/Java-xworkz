package main;

public class PowerBank {
	public Battery battery;//Association
	public void capacity() {
		if(this.battery!=null) {
			this.battery.capacitor();
			System.out.println("invoking capacity in powerbank");
		}
		else {
			System.out.println("not invoking capacity in powerbank");
		}
		}
		
	public void name() {
		if(this.battery!=null) {
			this.battery.brand();
			System.out.println("invoking brand in powerbank");
		}
		else {
			System.out.println("not invoking brand in powerbank");
		}
	}
	
	}
	
	


