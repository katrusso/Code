public class Stereo {
	String location = "";
	int volume = 0;

	public Stereo(String location){
		this.location = location;
	}

	public void stereoOn(){
		System.out.println("The stereo is on.");
	}

	public void setCD(){
		System.out.println("The CD is set.");
	}

	public void setVolume(int volume){
		this.volume = volume;
		System.out.println("The stereo volume is set to " + volume + ".");
	}

	public void stereoOff() {
		System.out.println("The stereo is off.");
	}
}