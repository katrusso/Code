public class StereoOnForCDCommand implements Command {
	Stereo stereo;

	public StereoOnForCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute(){
		stereo.stereoOn();
		stereo.setCD();
		stereo.setVolume(11);
	}

	public void undo() {
		stereo.stereoOff();
	}

}