class Stadium{
	String sports;
	String cricket;
	String running;
	String walking;
	String vollyboll;
	
	Stadium()
	{
	
	}
	public static void main(String[] args){
		Stadium stadium=new Stadium();
		
		System.out.println(stadium.sports);
		System.out.println(stadium.cricket);
		System.out.println(stadium.running);
		System.out.println(stadium.walking);
		System.out.println(stadium.vollyboll);
		
		stadium.sports="Sports";
		stadium.cricket="Cricketer";
		stadium.running="Runner";
		stadium.walking="walker";
		stadium.vollyboll="vollyboll player";
		
		System.out.println(stadium.sports);
		System.out.println(stadium.cricket);
		System.out.println(stadium.running);
		System.out.println(stadium.walking);
		System.out.println(stadium.vollyboll);
		
		Stadium stadium1=new Stadium();
		
		System.out.println(stadium1.sports);
		System.out.println(stadium1.cricket);
		System.out.println(stadium1.running);
		System.out.println(stadium1.walking);
		System.out.println(stadium.vollyboll);
		
		stadium1.sports="Sports";
		stadium1.cricket="Cricketer";
		stadium1.running="Runner";
		stadium1.walking="walker";
		stadium1.vollyboll="vollyboll player";
		
		System.out.println(stadium1.sports);
		System.out.println(stadium1.cricket);
		System.out.println(stadium1.running);
		System.out.println(stadium1.walking);
		System.out.println(stadium.vollyboll);

		
	}
	
}