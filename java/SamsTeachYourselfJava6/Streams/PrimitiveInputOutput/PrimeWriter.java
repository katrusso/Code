/*
	You can use data input streams and data output streams to read and write primitive data types (boolean, unsigned byte (0 - 255), double, float, int, long short) 
	as opposed to Strings and signed bytes (-128 to 127). 

	A data input stream's different read methods do not all return a value that can be used as an eof indicator (such as -1, with Strings).
	As an alternative, you can wait for an EOFException to be thrown when a read method reaches the end of a stram. The loop that reads 
	the data can be enclosed in a try-catch block and the associated catch statement should handle only EOFException objects.

	You can call close() on the stream and take care of other cleanup tasks inside the catch block. 

	methods that apply to data input and output streams:
		 - readBoolean(),	writeBoolean(boolean)
		 - readByte (), 	writeByte(int)
		 - readDouble(), 	writeDouble(double)
		 - readFloat(), 	writeFloat(float)
		 - readInt(), 		writeInt(int)
		 - readLong(), 		writeLong(long)
		 - readShort(), 	writeShort(int)

		 - readUnsignedByte()  //returned as int value
		 - readUnsignedShort()  //returned as int value

	app should write the 400 prime numbers to a file
*/

import java.io.*; //streams, exceptions

public class PrimeWriter {
	public static void main(String[] args) {
		int[] primes = new int[400]; //array object containing 400 integers
		int numPrimes = 0;

		//candidate: the # that might be prime
		int candidate = 2;
		while (numPrimes < 400) {
			if ( isPrime(candidate) ) { //if the candidate is a prime number:
				primes[numPrimes] = candidate; //add it to the prime number int array at the latest unused index 
				numPrimes++;
			}
			candidate++; //incriment the candidate value regardless of whether the previous candidate was prime or not
		}
		try {
			//write output to disk
			FileOutputStream file = new FileOutputStream("400primes.txt"); //create an output stream
			BufferedOutputStream buff = new BufferedOutputStream(file); //filter the output stream
			DataOutputStream data = new DataOutputStream(buff); // DataOutputStream's arg should be an existing output stream (e.g. buffered or file output stream)

			for (int i = 0; i < 400; i++)
				data.writeInt(primes[i]);
			data.close();
		} catch (IOException e) {
			System.out.println( "Error -- " + e.toString() );
		}
	}

	public static boolean isPrime(int checkNumber) {
		double root = Math.sqrt(checkNumber);
		for (int i = 2; i <= root; i++) {
			if (checkNumber % i == 0 ) //if any # between 2 and the square root of the candidate can divide evenly into the candidate, it's not prime.
				return false;
		}
		return true;
	}

}