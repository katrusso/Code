
/*
	This class finds a specific prime number in a sequence, such as the 10th prime, 100th prime, or 1,000th prime.
	This can take some time, especially for #s beyond 100k so the search for the right prime takes place in its own thread.
	
VARIABLES:
	target: long, indicates when the specified prime in the sequence has been found. If you're looking for the 5,000th prime, target = 5000.
	prime: long, holds the last prime number found by this class
	finished: a bool that indicates whether the target has been reached.
	numPrimes: the # of primes that have been found
	candidate: the # that might possibly be prime; begins at the first prime number which is 2.
*/

//to create a thread, class must subclass Thread class or implement Runnable interface. Runnable contains 1 method: run() which must also be implemented.
//the Thread class implements the Runnable interface.

public class PrimeFinder implements Runnable {  
	public long target;
	public long prime;
	public boolean finished = false;
	private Thread runner; //create a reference to an object of the Thread class; notice this is a private instance var

	//The runner var has a value of null before any oject is assigned to it so the if stmt is used to make sure the thread is not started more than once.
	PrimeFinder(long inTarget){ // constructor sets the target instance var and starts the thread. 
		target = inTarget;
		if (runner == null){
			runner = new Thread(this);
			runner.start(); //starts the thread, causing another method to be called: run(). 
		}
	}
	//run() must be present in all threaded objects
	//put the most computing-intensive tasks in their own thread (like this) so they don't bog down the rest of the program.
	//to stop a thread, place a loop in the thread's run() method that ends when a var changes in value.
	public void run() {
		long numPrimes = 0;
		long candidate = 2;
		while(numPrimes < target) {
			if (isPrime(candidate)) {
				numPrimes++;
				prime = candidate;
			}
			candidate++;
		}
		finished = true; 
		//after the right # of primes has been found, the while loop ends and finished instance var is set to true. 
		//The end of the run() method is reaches and the thread is no longer doing any work. 
	}

	boolean isPrime(long checkNumber) {
		double root = Math.sqrt(checkNumber);
		for(int i = 2; i <= root; i++) {
			if (checkNumber % i == 0)
				return false;
		}
		return true;

	}
}