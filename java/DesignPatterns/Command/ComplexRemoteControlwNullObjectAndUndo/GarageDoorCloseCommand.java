public class GarageDoorCloseCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.doorClose();
	}

	public void undo() {
		garageDoor.doorOpen();
	}

}