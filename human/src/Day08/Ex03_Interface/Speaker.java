package Day08.Ex03_Interface;

import Day08.Ex05_AnonymousObject.RemoteControl;

public class Speaker implements RemoteControl {
	
	private int volume;			// 음량

	@Override
	public void turnOn() {
		System.out.println("스피커 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스피커 전원을 끕니다.");
	}

	@Override
	public void se스피커olume(int volume) {
		// 유효성 검사
		// 볼륨 최댓값을 넘지 못하게 지정
		if( volume > RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		// 볼륨 최솟값을 넘지 못하게 지정
		else if( volume < RemoteControl.MIN_VOLUME ) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 스피커 볼륨 : " + this.volume);
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

}
