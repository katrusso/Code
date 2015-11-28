public class RemoteControl {
	Command[] onCommands;	//the remote is going to handle 7 on/off commands which we'll hold in the corresponding arrays.
	Command[] offCommands;

	private static final int NUMBER_OF_REMOTE_SLOTS = 7;

	public RemoteControl() {
		onCommands = new Command[NUMBER_OF_REMOTE_SLOTS];
		offCommands = new Command[NUMBER_OF_REMOTE_SLOTS];

		Command noCommand = new NoCommand(); //I'm unclear why first term isn't "NoCommand"; Why does it matter? NoCommand implements Command.
		for(int i = 0; i < NUMBER_OF_REMOTE_SLOTS; i++) {
			onCommands[i] = noCommand; 
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) { //when on or off button is pressed, the hw takes care of calling the corresponding methods.
		onCommands[slot].execute();
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}

	public String toString() { //overrides toString() to print out each slot and its corresponding cmd.
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n ----- Remote Control -----\n");
		for( int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
