public class RemoteControlTest {

	public static void main(String[] args) {

		//create the remote (Invoker) and ceiling-fan (Receiver)
		RemoteControl remote = new RemoteControl();
		CeilingFan ceilingFan = new CeilingFan("Living Room");

		//instantiate the fan's commands
		CeilingFanHighCommand fanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand fanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanLowCommand fanLow = new CeilingFanLowCommand(ceilingFan);
		CeilingFanOffCommand fanOff = new CeilingFanOffCommand(ceilingFan);
		Command undo = new NoCommand();

		//program the remote
		remote.setCommand(0, fanOff);
		remote.setCommand(1, fanLow);
		remote.setCommand(2, fanMedium);
		remote.setCommand(3, fanHigh);
		remote.setCommand(6, undo); //Note: coded button 6 to be the UNDO button in RemoteControl.java


		//push buttons
		remote.buttonWasPushed(1); //LOW
		remote.buttonWasPushed(0); //OFF
		System.out.println(remote);	
		remote.buttonWasPushed(6); // (UNDO) LOW
		remote.buttonWasPushed(3);	//HIGH
		System.out.println(remote);
		remote.buttonWasPushed(6); // (UNDO) LOW

	}
}