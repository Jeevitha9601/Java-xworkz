package Main;

import java.util.Date;

public class DateKiller {

	public static void main(String[] args) {
		Date date = new Date(7 - 5 - 2023);
		boolean afterdate = date.after(date);
		System.out.println(afterdate);
		boolean beforedate = date.before(date);
		System.out.println(beforedate);
		int compare = date.compareTo(date);
		System.out.println(compare);
		int ref = 12 - 4 - 23;
		int hash = date.hashCode();
		System.out.println(hash);
		date.setTime(hash);
	}

}
