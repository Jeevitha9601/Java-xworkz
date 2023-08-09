package OverRiding2Main;


import OverRiding2.Hotel;
import OverRiding2.TajHotel;

public class HotelKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in Hotel Killer");
		Hotel hotel=new Hotel();
		hotel.restorant();
		hotel.restorant("Mysure");
		hotel.restorant("Hssan", 6);
		Hotel hotel1=new TajHotel();
		hotel1.restorant();
		hotel1.restorant("Mangalore");
		hotel1.restorant(5);
		hotel1.restorant("Tipture", "5*");
	}

}
