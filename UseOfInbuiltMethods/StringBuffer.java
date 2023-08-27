package UseOfInbuiltMethods;

import Class.String;

public class StringBuffer {
	public static void main(String[] args) {
		StringBuffer string=new StringBuffer();
		System.out.println(string.hashCode());
		System.out.println(string.toString());
		string.notifyAll();
		string.notify();
	}
}
