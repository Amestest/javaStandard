package javaStandard;
class Tv {
	boolean power; // 전원상태(on/off)
	int channel; // 채널
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		
	}
}

class VCR {
	boolean power; //전원상태(on/off)
	int counter = 0;
	void powr() {
		power = !power;
	}
	void play() {
		/*내용 생략*/
	}
	void stop() {
		/*내용 생략*/
	}
	void rew() {
		/*내용 생략*/
	}
	void ff() {
		/*내용 생략*/
	}
}
class TVCR extends Tv {
	VCR vcr =  new VCR();
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	void rew() {
		vcr.rew();
	}
	void ff() {
		vcr.ff();
	}
}
