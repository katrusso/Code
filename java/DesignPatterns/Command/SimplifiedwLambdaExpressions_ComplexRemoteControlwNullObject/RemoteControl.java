public class RemoteControl {
	Command[] onCommands;	//the remote is going to handle 7 on/off commands which we'll hold in the corresponding arrays.
	Command[] offCommands;

	//String[] onCommandNames;
	//String[]offCommandNames;

	private static final int NUMBER_OF_REMOTE_SLOTS = 7;

	public RemoteControl() {
		onCommands = new Command[NUMBER_OF_REMOTE_SLOTS];
		offCommands = new Command[NUMBER_OF_REMOTE_SLOTS];
		//onCommandNames = new String[NUMBER_OF_REMOTE_SLOTS]; //if using lambda expressions, name remote control slots by updating setCommand() to take a name parameter, and update toString() to print the name
		//offCommandNames = new String[NUMBER_OF_REMOTE_SLOTS];


		/* Command noCommand = new NoCommand(); 
		for(int i = 0; i < NUMBER_OF_REMOTE_SLOTS; i++) {
			onCommands[i] = noCommand; 
			offCommands[i] = noCommand;
		}*/

		//option #2: remove the code the create a NoCommand object (above)
		//instead of a NoCommand object, use a lambda expression that does nothing, just like execute() of the NoCommand object did nothing.
		for(int i = 0; i < NUMBER_OF_REMOTE_SLOTS; i++) {
			onCommands[i] = () -> { }; 
			offCommands[i] = () -> { }; 
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

/*
	NOTE: (IF USING LAMBDA EXPRESSIONS)
	
	In the toString() method, .getClass() is used to get the class of the Command object, and then .getName() to get the name of the class. 
	If you use lambda expressions, this method outputs weirdness because they don't have nice class names (their names are assigned internally
	 by the java runtime).

	 To fix the code, update setCommand() to include a parameter for the name of the slot, and modify toString() to use this name. 
*/

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