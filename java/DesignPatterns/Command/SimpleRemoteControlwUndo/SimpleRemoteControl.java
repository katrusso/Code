public class SimpleRemoteControl {
	Command slot;

	public SimpleRemoteControl() {}

	public void setCommand( Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}

	public void undoButtonWasPressed() { //used in implementing UNDO
		slot.undo();
	}
}
