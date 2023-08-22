package Main;

public class ThreadKiller {

	public static void main(String[] args) {
		Thread thread=new Thread();
		long id=thread.getId();
		System.out.println(id);
		String name=thread.getName();
		String ref="Jeevitha";
		System.out.println(name);
		//or
		System.out.println(ref);
		int get=thread.getPriority();
		System.out.println(get);
		boolean alive=thread.isAlive();
		System.out.println(alive);
		int max=thread.MAX_PRIORITY;
		System.out.println(max);
	}

}
