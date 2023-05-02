package Day08.Ex05_AnonymousObject;

public class RemoteControlEx {
	public static void main(String[] args) {

		// 익명구현객체
		// 클래스를 정의하지 않고도, 이름없이 구현된 객체
		// 인터페이스 객체명 = new 인터페이스(인자1...){ 객체정의}
		RemoteControl rc = new RemoteControl() {

			int vloum;
			private String volume;

			@Override
			public void turnOn() {
				System.out.println("ON");

			}

			@Override
			public void turnOff() {
				System.out.println("OFF");

			}

			@Override
			public void setVolume(int volume) {
				this.vloum = volume;
				System.out.println("volume : " + this.volume);

			}

			@Override
			public void se스피커olume(int volume) {

			}

		};
		rc.turnOn();
		rc.setVolume(50);
		rc.turnOff();

	}
}
