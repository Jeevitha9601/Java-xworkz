    class Carrom{
	String board;
	int pan;
	String powder;
	int player;
	String vacation;
	
	Carrom(String board){
    this.board=board;
	}
	Carrom(String board,int pan){
	this.board=board;
	this.pan=pan;
    }
    Carrom(String board,int pan, String powder){
	this.board=board;
	this.pan=pan;
	this.powder=powder;
    }
    Carrom(String board,int pan, String powder,int player){
	this.board=board;
	this.pan=pan;
	this.powder=powder;
	this.player=player;
    }
    Carrom(String board,int pan, String powder,int player,String vacation){
	this.board=board;
	this.pan=pan;
	this.powder=powder;
	this.player=player;
	this.vacation=vacation;
    }
    public static void main(String[] args){
	System.out.println("Invoking the main method");
	Carrom carrom=new Carrom("wood");
	System.out.println("board type "+carrom.board);
	Carrom carrom1=new Carrom("wood",10);
	System.out.println("board type "+carrom1.board+" Number of pans "+carrom1.pan);
	Carrom carrom2=new Carrom("wood",12,"carrom poweder");
	System.out.println("board type "+carrom2.board+" Number of pans "+carrom2.pan+" powder type "+carrom2.powder);
	Carrom carrom3=new Carrom("wood",12,"carrom poweder",4);
	System.out.println("board type "+carrom3.board+" Number of pans "+carrom3.pan+" Powedre type "+carrom3.powder+" Number of players "+carrom3.player);
	Carrom carrom4=new Carrom("wood",12,"carrom poweder",4,"Free time");
	System.out.println("board type "+carrom4.board+" Number of pans "+carrom4.pan+" Powedre type "+carrom4.powder+" Number of players "+carrom4.player);
	System.out.println("Carrom use to play on "+carrom4.vacation);
	
    }
    }