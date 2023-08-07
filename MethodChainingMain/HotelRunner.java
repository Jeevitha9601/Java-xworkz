package MethodChainingMain;

import MethodChaining.Hotel;

public class HotelRunner {
public static void main(String[] args) {
	Hotel hotel=new Hotel();
	hotel.chef();
	hotel.chef("Bangalore","Aramane");
}
}
