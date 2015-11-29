public class CeilingFanHighCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	public void execute() {
		ceilingFan.fanOnHigh();
	}

	public void undo() {
		ceilingFan.fanOff();	//added to implement UNDO
	}
}