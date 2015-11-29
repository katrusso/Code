public class CeilingFanMediumCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed; //local state to keep track of the previous speed of the fan

	public CeilingFanMediumCommand( CeilingFan cf) {
		this.ceilingFan = cf;
	}

	public void execute() {
		prevSpeed = ceilingFan.getSpeed(); //before we change the speed of the fan we need to record its previous state incase we need to Undo it later
		ceilingFan.medium();
	}

	public void undo() {	//to undo, set the speed of the fan back to the previous speed
		if ( prevSpeed == CeilingFan.HIGH)
			ceilingFan.high();
		else if ( prevSpeed == CeilingFan.MEDIUM)
			ceilingFan.medium();
		else if ( prevSpeed == CeilingFan.LOW)
			ceilingFan.low();
		else if ( prevSpeed == CeilingFan.OFF)
			ceilingFan.off();
	}
}