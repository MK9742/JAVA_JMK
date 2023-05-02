package Day08.Ex03_Interface;

public interface RemoteControl {
	

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	

	default void setMute(boolean mute) {
		if( mute ) {
			System.out.println("�쓬�냼嫄� �꽕�젙");
			setVolume(0);
		}
		else {
			System.out.println("�쓬�냼嫄� �빐�젣");
			setVolume(5);
		}
	}
	
	// static 硫붿냼�뱶(�젙�쟻 硫붿냼�뱶)
	// : 援ы쁽 媛앹껜媛� �뾾�뼱�룄 �씤�꽣�럹�씠�뒪留뚯쑝濡쒕룄 �샇異쒖씠 媛��뒫�븳 硫붿냼�뱶
	static void changeBattery() {
		System.out.println("諛고꽣由щ�� 援먰솚");
	}
	
	
	

}





