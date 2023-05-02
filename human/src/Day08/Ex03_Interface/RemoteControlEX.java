package Day08.Ex03_Interface;

import Day08.Ex05_AnonymousObject.RemoteControl;

public class RemoteControlEX {
	
	public static void main(String[] args) {
		
		RemoteControl tvRc = new Television();
		tvRc.turnOn();
		tvRc.setVolume(5);
		tvRc.setVolume(100);
		tvRc.setMute(true);
		tvRc.turnOff();
		System.out.println();
		
		RemoteControl speakerRc = new Speaker();
		tvRc.turnOn();
		tvRc.setVolume(5);
		tvRc.setVolume(-100);
		tvRc.setMute(false);
		tvRc.turnOff();
		System.out.println();
		
		RemoteControl.changBattery();
		
	}
	

}
