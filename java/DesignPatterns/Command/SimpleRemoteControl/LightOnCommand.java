public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) { //The constructor is passed the specific light that this cmd is going to control and stashes it in a light instance var.
		this.light = light;				//When execute() gets called, this is the light object that is going to be the Receiver of the request.
	}

	public void execute() { //this method calls on() on the receiving object, which is the light we are passed in (above).
		light.on();
	}
}