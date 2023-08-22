package Main;

import java.time.LocalDate;
//import java.time.temporal.Temporal;
//import java.time.temporal.TemporalAccessor;

public class LocalDateKiller {

	public static void main(String[] args) {
		LocalDate localDate;
		//Temporal localDate1;
		//TemporalAccessor adjust=LocalDate.adjustInto(localDate);
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.MAX);
		System.out.println(LocalDate.MIN);
		System.out.println(LocalDate.of(2001, 06,9));
		System.out.println(LocalDate.of(2000, 12, 29));
		
		
	}

}
