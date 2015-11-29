public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	public void execute() {
		ceilingFan.fanOff();
	}

	public void undo() {		//added to implement UNDO
		ceilingFan.fanOnHigh();
	}
}