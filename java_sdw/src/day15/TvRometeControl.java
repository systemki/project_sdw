package day15;
 //RemoteControl 인터페이스를 구현한 TvRemoteControl 구현 클래스 
public class TvRometeControl implements RemoteControl {

	private boolean power;
	private int channel;
	private final int MAX_CHANNEL = 999;
	
	@Override
	public void powerOn() {
		power = true;
		
	}

	@Override
	public void powerOff() {
		power = false;
		
	}
	
	public void channerUp() {
		if(!power) {
			return;
		}
		channel++;
		if(channel >  MAX_CHANNEL) {
			channel = 1;
		}
	}
	
	public void channerDown() {
		if(!power) {
			return;
		}
		channel--;
		if(channel < 1) {
			channel = MAX_CHANNEL;
		}
	}
	public void setchannerUp(int channel) {
		if(!power) {
			return;
		}
		this.channel = channel;
		if(channel < 1 || channel > MAX_CHANNEL) {
			channel = MAX_CHANNEL;
			
		}	
	}
}
