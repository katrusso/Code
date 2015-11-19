/*
	To run this app: 
		javac PrimeThreads.java
		java PrimeThreads 1 10 100 1000
*/

//this app uses the PrimeFinder class.

public class PrimeThreads {
	public static void main(String[] args) {
		PrimeThreads pt = new PrimeThreads(args);
	}

//the for-loop creates one PrimeFinder object for each command-line argument specified when the program is run.
	//when a PrimeFinder object is created, the object starts running in its own thread (as specified by the PrimeFinder constructor)
	public PrimeThreads (String[] args) {
		PrimeFinder[] finder = new PrimeFinder[args.length];
		for (int i = 0; i < args.length; i++) {
			try {		//all number-parsing methods throw NumberFormatException exceptions to they are enclosed in try/catch blocks to deal with non-numeric args
				long count = Long.parseLong(args[i]);  //bc args are Strings, must convert them to longs
				finder[i] = new PrimeFinder(count);
				System.out.println("Looking for prime " + count);
			} catch (NumberFormatException nfe) {
				System.out.println("Error: " + nfe.getMessage());
			}
		}
		boolean complete = false;

		/*
		This while loop checks to see whether any PrimeFinder thread has completed which is indicated by its finished instance var equaling true.
		When a thread has completed, the displayResult() method is called to display the prime 3 that was found.
		The thread is then set to null, freeing the object for garbage collection (and preventing its result from being displayed more than once.

		The call to Thread.sleep(1000) causes the while loop to pause for 1 second during each pass through the loop. A slowdown in loops helps 
		keep the Java interpreter from executing statements at such a furious pace that it becomes bogged down.
		*/
		while (!complete) {
			for (int j = 0; j < finder.length; j++) {
				if (finder[j] == null) continue;
				if (!finder[j].finished){
					complete = false;
				} else {
					displayResult(finder[j]);
					finder[j] = null;
				}
			}
			try{
				Thread.sleep(1000);
			} catch (InterruptedException ie){
				//do nothing
			}
		}
	}
	private void displayResult(PrimeFinder finder) {
		System.out.println("Prime " + finder.target + " is " + finder.prime);
	}
}