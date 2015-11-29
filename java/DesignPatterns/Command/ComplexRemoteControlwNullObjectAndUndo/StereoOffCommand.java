public class StereoOffCommand implements Command {
	Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.stereoOff();
	}

	public void undo() {
		stereo.stereoOn();
		stereo.setCD();
		stereo.setVolume(11);
	}

}