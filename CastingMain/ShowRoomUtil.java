package CastingMain;

import Casting.MobileShowRoom;
import Casting.WatchShowRoom;
import Casting.ShowRoom;

public class ShowRoomUtil extends ShowRoom{
	
public void run(ShowRoom room) {
	
	ShowRoom showRoom=new ShowRoom();
	showRoom.showRoomInfo();
	
	if(room instanceof MobileShowRoom) {
	ShowRoom mobileShowRoom=new MobileShowRoom();
	mobileShowRoom.showRoomInfo();	
	
	MobileShowRoom mobileShowRoom2=(MobileShowRoom)mobileShowRoom;
	mobileShowRoom2.mobileShowRoomInfo();
	}
	
	if(room instanceof WatchShowRoom) {
		ShowRoom watchShowRoom=new WatchShowRoom();
		watchShowRoom.showRoomInfo();
		
		WatchShowRoom watchShowRoom2=(WatchShowRoom)watchShowRoom;
		watchShowRoom2.watchShowRoomInfo();
	}
	}
}
