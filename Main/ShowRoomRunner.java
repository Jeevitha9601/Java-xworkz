package Main;

import Casting.MobileShowRoom;
import Casting.ShowRoom;
import Casting.WatchShowRoom;
import CastingMain.ShowRoomUtil;

public class ShowRoomRunner {

	public static void main(String[] args) {
		ShowRoom showRoom=new ShowRoom();
		
		WatchShowRoom watchShowRoom=new WatchShowRoom();
		
		MobileShowRoom mobileShowRoom=new MobileShowRoom();
		
		ShowRoomUtil util=new ShowRoomUtil();
		System.out.println("Calling run method with ShowRoom  ref");
	       util.run(showRoom);
	       
	       ShowRoomUtil util1=new ShowRoomUtil();
			System.out.println("Calling run method with  WatchShowRoom ref");
		       util1.run(watchShowRoom);
		       
		       ShowRoomUtil util2=new ShowRoomUtil();
				System.out.println("Calling run method with MobileShowRoom  ref");
			       util2.run(mobileShowRoom);
		       
	       
 
	}

}
