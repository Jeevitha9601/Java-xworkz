package Main;

import java.time.LocalDateTime;

public class LocalDateTimeKiller {

	public static void main(String[] args) {
		LocalDateTime localDateTime; 
		System.out.println(LocalDateTime.of(2023, 10, 8, 13, 38));
		System.out.println(LocalDateTime.of(2001, 6, 9, 23, 40, 19, 21));
		System.out.println(LocalDateTime.of(9, 8, 4, 8, 5));
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.now());
	}

}
