package Main;

public class StringKiller {

	public static void main(String[] args) {
		String string = new String("Jeevitha ");
		char chat = string.charAt(4);
		System.out.println(chat);
		String string1 = "ML Engeeniring";
		String[] ref = string.split(string);
		System.out.println(ref);
		String[] ref2 = string.split("Jeevitha ML Engeeniring", 8);
		System.out.println(ref2);
		String con = string.concat(string1);
		System.out.println(con);
		int compare = string.compareTo(con);
		System.out.println(compare);
		String sub = string.substring(2, 7);
		System.out.println(sub);
		boolean empty = string.isEmpty();
		System.out.println(empty);
		int len = string.length();
		System.out.println(len);
		boolean starts = string.startsWith(string1, 8);
		System.out.println(starts);
		boolean ends = string.endsWith(sub);
		System.out.println(ends);
		String run = "Jeevitha ";
		boolean equals = string.equalsIgnoreCase(run);
		System.out.println(equals);
		boolean equ = string.equals(run);
		System.out.println(equ);
		String upper = string.toUpperCase();
		System.out.println(upper);
		String lower = string.toLowerCase();
		System.out.println(lower);
		boolean blank = string.isBlank();
		System.out.println(blank);
		int index = string.indexOf(string1);
		System.out.println(index);
		String tri=string.trim();
		System.out.println(tri);
	}

}
