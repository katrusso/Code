public class RemoteControl {
	Command[] onCommands;	//the remote is going to handle 7 on/off commands which we'll hold in the corresponding arrays.
	Command[] offCommands;
	Command undoCommand;	//Added to implement UNDO; this is where we'll store the last command executed for the undo button.

	private static final int NUMBER_OF_REMOTE_SLOTS = 7;

	public RemoteControl() {
		onCommands = new Command[NUMBER_OF_REMOTE_SLOTS];
		offCommands = new Command[NUMBER_OF_REMOTE_SLOTS];

		Command noCommand = new NoCommand(); 
		for(int i = 0; i < NUMBER_OF_REMOTE_SLOTS; i++) {
			onCommands[i] = noCommand; 
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;	//Added to implement UNDO; like the other slots, undo starts off with a NoCommand so pressing undo before any other button won't do anything at all.
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) { 
		onCommands[slot].execute();
		undoCommand = onCommands[slot];		//Added to implement UNDO; first we execute the cmd, then we save a reference to it in the undoCommand instance var. When the undoButtonWasPushed(), reverses the operation of the cmd.
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];	//Added to implement UNDO
	}

	public void undoButtonWasPushed() {
		undoCommand.undo();		//Added to implement UNDO; when the undo button is pressed, we invoke the undo method of the command stored in the undoCommand. This reverses the operation of the last command executed.
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

/*
	The NoCommand object is an example of a null object. 
	A null object is useful when you don't have a meaningful object to return and yet you want to remove 
	the responsibility for handling null from the client.

	For the remote control, we don't have a meaningful object to assign to each slot so we provided a 
	NoCommand object that acts as a surrogate and does nothing when its execute method is called.

	Otherwise, we could have checked to see if a command was loaded every time we referenced a slot:
	
	e.g. 

	public void onButtonWasPushed(int slot){
		if (onCommands[slot] != null)
			onCommands[slot].execute();
	}
*/ 