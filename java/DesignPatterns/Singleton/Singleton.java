/*
	 - THE SINGLETON PATTERN is a convention for ensuring one and only one object is instantiated for a given class.
	 - To get a Singleton object, you don't instantiate one directly -- you ask for an instance using the static method "getInstance()".
	 You need to use the class name to reference a static method, ergo: "Singleton.getInstance();" in this case.

	 - With the Singleton Pattern, objects are created only when they are needed (not when app begins -- important for resource-intensive objects that aren't used immediately)

	 - The singleton object ensures every object in the app is making use of the same global resource;
	 whenever you need an instance, query the class and it will hand you back the single instance.

	Examples of objects we only need one of:
		- thread pools
		- caches
		- dialog boxes
		- objects that handle preferences 
		- objects that handle registry settings
		- objects used for logging
		- objects that act as device drivers to things like printers and graphics cards
*/
//===========================================================================================================================================//
//SYNCHRONIZATION & LAZY INSTANTIATION
public class Singleton {
	private static Singleton uniqueInstance; 

	private Singleton() {} 

	public static synchronized Singeton getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new Singleton(); 
												
		return uniqueInstance;
	}
}

/*
	private static Singleton uniqueInstance ::
		declares a class (static) variable, uniqueInstance, of type Singleton that can't be accessed by outside classes or subclasses of Singleton;
		it holds our one instance of the Singleton class;
		as a class variable it can be seen by all methods in the class.

	private Singleton() {} ::
		the code in Singleton.java is the only code that can call this constructor; 
		no other class can instantiate an instance of Singleton because they can't see it ("private")
	
	public static synchronized Singeton getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new Singleton();
		return uniqueInstance;
	}	::
					- if uniqueInstance doesn't exist, instantiate Singleton through its private constructor using "uniqueInstance = new Singleton()";
					- LAZY INSTANTIATION: if we never need the instance, it never gets created.

					-"synchronized" is used in multi-threading: it forces every thread to wait its turn before it can enter the method. That is, 
					no two threads can enter the method at the same time. This prevents two objects being created from interleaving at the line 
					'if (uniqueInstance ==null).'
					DOWNSIDE: After this method runs once, there's no further need to synchronize the method, making synchronization unneeded overhead (expensive).
					 - if the performance of getInstance() isn't critical to your app, do nothing.
					 - synchronizing a method can decrease performance by a factor of 100 so if a high traffic part of your code uses getInstance(), reconsider.

					- a static (class) method, it can be called like this: Singleton.getInstance(); 
					you need to use the class name to reference a static method.

					 - use Singleton.getInstance() to instantiate an object
*/
//===========================================================================================================================================//
//EAGER INSTANTIATION
public class Singleton {
	private static Singleton uniqueInstance = new Singleton();

	private Singleton() {}

	public static Singleton getInstance() {
		return uniqueInstance;
	}
}

/*
	If you app always creates and uses an instance of the Singleton or the overhead of creation and runtime aspects of the Singleton are not onerous,
	rather than lazy instantiation, create the object eagerly in a static initializer -- that guarantees the code is THREAD SAFE.

	- in this case, we rely on the JVM to create the unique instance of the Singleton when the class is loaded; 
	the JVM guarantees that the instance will be created before any thread can access the static uniqueInstance var.
*/
//===========================================================================================================================================//
//DOUBLE-CHECKED LOCKING (REDUCED SYNCHRONIZATION)
public class Singleton {
	private volatile static Singleton uniqueInstance;

	private Singleton() {}

	public static Singleton getInstance() {
		if( uniqueInstance == null) {
			synchronized (Singleton.class) {
				if( uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}

/*
	With double-checked locking, we first check to see if an instance is created. If not, THEN we synchronize -- ensuring we only synchronize
	the first time through (every subsequent time, the uniqueInstance var won't be null, and therefore returned immediately when the method is called).

	- if performance is an issue in your use of getInstance, this method of implementing the Singleton can drastically reduce overhead.

	private volatile static Singleton uniqueInstance::
		- the VOLATILE keyword ensures that multiple threads handle the variable correctly when it is being initialized to the Singleton instance.
		Volatile is used to indicate that a variable's value will be modified by different threads.
		Declaring a volatile Java variable means:
			- The value of this variable will never be cached thread-locally: all reads and writes will go straight to "main memory";
			- Access to the variable acts as though it is enclosed in a synchronized block, synchronized on itself;
			"acts as though" because to the programmer at least (and probably in most JVM implementations) there is no actual lock object involved.
			(this code happens to implement an actual synchronized block in addition to the keyword).


	public static Singleton getInstance() {
		if( uniqueInstance == null) {      			<------check for an instance; if there isn't one, enter a synchronized block
			synchronized (Singleton.class) {
				if( uniqueInstance == null) {		<-----once in the block, check again and if still null, create an instance.
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
*/

