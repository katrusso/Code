/*
	app receives console input.

	The System class, part of the java.lang pkg, has a class variable called "in" that is an input stream object.
	This object receives input from the keyboard through the stream.

	You can work with this stream as you would any other input stream. To create a new buffered input stream 
	associated with the System.in input stream:

	BufferedInputStream command = new BufferedInputStream(System.in);

	app reads the user input through a buffered input stream using the stream's read() method, which
	returns -1 when the end of input has been reached.

	This occurs when the user presses the Enter key, a carriage return ('\r') or a newline character ('\n').
*/

import java.io.*; //streams & exceptions

public class ConsoleInput {
	public static String readLine() {
		StringBuffer response = new StringBuffer(); //A string buffer is like a String, but can be modified
		try {
			BufferedInputStream buff = new BufferedInputStream(System.in);
			int in = 0;
			char inChar;
			do {
				in = buff.read(); //Reads the next byte of data from the input stream. The value byte is returned as an int in the range 0 to 255
				inChar = (char)in; //converts the int in byte to a character
				if ((in != -1) & (in != '\n') & (in != '\r')) {
					response.append(inChar); //appends the character to the String Buffer
				}
			} while ((in != -1) & (inChar != '\n') & (in != '\r')); //reads the buffered input stream until it runs out of characters
			buff.close(); //closes the buffered input stream
			return response.toString(); //returns the completed modified String (StringBuffer) to main()
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
			return null; 
		}
	}

	public static void main(String[] args) {
		System.out.print("What's your name?: ");
		String input = ConsoleInput.readLine();
		System.out.println("Hello, " + input);
	}
}