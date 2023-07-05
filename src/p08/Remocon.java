package p08;

public class Remocon implements Remote,TVRemocon,Aircon,RemoconCh {

	@Override
	public void on() {
		System.out.println("TV를 킵니다");
		
	}

	@Override
	public void off() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void up() {
		System.out.println("채널 위로");
		
	}

	@Override
	public void down() {
		System.out.println("채널 아래로");
	
		
	}

	@Override
	public void air_on() {
		System.out.println("에어컨을 킵니다");
		
	}

	@Override
	public void air_off() {
		System.out.println("에어컨을 끕니다");
		
	}

	@Override
	public void chenUp() {
		System.out.println("채널을 올립니다");
		
	}

	@Override
	public void chendown() {
		System.out.println("채널을 내립니다");
		// TODO Auto-generated method stub
		
	}
	
	

}
