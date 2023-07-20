class Metro{
	String tickets;
	int metroNumber;
	String stops;
	int numberOfStops;
	String station;
	
	
	Metro(){
		
	}
	public static void main(String[] args){
		Metro metro=new Metro();
		System.out.println(metro.tickets);
		System.out.println(metro.metroNumber);
		System.out.println(metro.stops);
		System.out.println(metro.numberOfStops);
		System.out.println(metro.station);
		
		metro.station="mahalakshmi layout";
		metro.tickets="Tickets";
		metro.metroNumber=123;;
		metro.numberOfStops=5;
		metro.stops="Rajajinagar and nandhini layout";
		
		System.out.println(metro.tickets);
		System.out.println(metro.metroNumber);
		System.out.println(metro.stops);
		System.out.println(metro.numberOfStops);
		System.out.println(metro.station);
		
		Metro metro1=new Metro();
		
	     System.out.println(metro1.station);
		System.out.println(metro1.numberOfStops);
        System.out.println(metro1.tickets);
		System.out.println(metro1.metroNumber);
		System.out.println(metro1.stops);
		
		metro1.station="Rajajinagar";
		metro1.tickets="Tickets";
		metro1.metroNumber=456;;
		metro1.numberOfStops=8;
		metro1.stops="Rajajinagar and nandhini layout";

		System.out.println(metro1.station);
		System.out.println(metro1.numberOfStops);
        System.out.println(metro1.tickets);
		System.out.println(metro1.metroNumber);
		System.out.println(metro1.stops);

	}
}