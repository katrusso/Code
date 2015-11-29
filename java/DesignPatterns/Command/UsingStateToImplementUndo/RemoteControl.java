public class RemoteControl {
	Command[] buttonCommands;	//the remote is going to handle 7 buttons which we'll hold in an array.
	Command undoCommand;

	public static final int UNDO = 6; //let's say we define the 7th button as the undo button

	private static final int NUMBER_OF_REMOTE_SLOTS = 7;

	public RemoteControl() {
		buttonCommands = new Command[NUMBER_OF_REMOTE_SLOTS];

		Command noCommand = new NoCommand(); //I'm unclear why first term isn't "NoCommand"; Why does it matter? NoCommand implements Command.
		for(int i = 0; i < NUMBER_OF_REMOTE_SLOTS; i++) {
			buttonCommands[i] = noCommand; 
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command buttonCommand) {
		buttonCommands[slot] = buttonCommand;
	}

	public void buttonWasPushed(int slot) { 

		if (slot == RemoteControl.UNDO) {
			undoCommand.undo(); 
		} else {
			buttonCommands[slot].execute();
			undoCommand = buttonCommands[slot];
		}
	}


	public String toString() { //overrides toString() to print out each slot and its corresponding cmd.
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n ----- Remote Control -----\n");
		for( int i = 0; i < buttonCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + buttonCommands[i].getClass().getName() + " \n");
		}
		return stringBuff.toString();
	}
}