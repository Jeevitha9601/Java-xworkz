package UseOfInbuiltMethods;

public class LocalDateTime {

	public static void main(String[] args) {
    LocalDateTime time=new LocalDateTime();
    System.out.println(time.equals(time));
    System.out.println(time.hashCode());
    System.out.println(time.toString());
    System.out.println(time.getClass());
	}

}
