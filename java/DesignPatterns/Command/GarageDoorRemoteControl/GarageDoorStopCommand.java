public class GarageDoorStopCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorStopCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.stop();
	}
}