package UseOfInbuiltMethods;

public class StringBuilder {
	public static void main(String[] args) {
		StringBuilder build = new StringBuilder();
		System.out.println(build.equals(build));
		System.out.println(build.hashCode());
		build.notify();
		System.out.println(build.getClass());
	}
}