/*
	After writing to the text file, app creates a buffered input stream from the file and reads the bytes back in.

	BufferDemo gets 2 cmd-line args if they are provided and uses them in the ArgStream constructor.

	The writeStream() method is called to write the series of byes to a buffered output stream, and the readStream() method
	is called to read those bytes back.

	The streams:
	1. Take the filename, numbers.txt, and use it to create and input or output stream.
	2. The file stream is used to create a buffered input or output stream (a filter -- modifies the way an existing stream is handled.)
	3. The buffered stream's write() method is used to send data, read() is used to receive data.
	4. The buffered stream is closed.

	Bc file streams and buffered streams throw IOException objects if an error occurs, all operations involving streams are enclosed in try-catch blocks.
	
	read() returns an integer from 0 to 255 representing the next byte in the stream. If no byte is available, -1 is returned.
	read(byte[], int1, int2) for input streams: loads stream data into a byte array.
		byte[]: a byte array where data will be stored
		int1: the element inside the array where the data's first byte should be stored
		int2: the number of bytes to write.
	
	write(int): use to send a single byte to the output stream
	write(byte[], int array starting point, int number of byte to write) for output streams: writes multiple bytes from the specified byte array.
		byte[]: a byte array containing the bytes to output
		int1: the starting point in the array
		int2: the number of bytes to read.

	e.g.1
		javac BufferDemo.java
		java BufferDemo 4 13

		Output:: 
			Writing: 
 			4 5 6 7 8 9 10 11 12 13
			Reading: 
 			4 5 6 7 8 9 10 11 12 13

 	e.g.2 
		javac BufferDemo.java
		java BufferDemo 4

		Output:: 
			Writing: 
 			 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50
 			 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95
 			 96 97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126 127 128 129 130
 			 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145 146 147 148 149 150 151 152 153 154 155 156 157 158 159 160 161 162 163 164 
 			 165 166 167 168 169 170 171 172 173 174 175 176 177 178 179 180 181 182 183 184 185 186 187 188 189 190 191 192 193 194 195 196 197 198
 			 199 200 201 202 203 204 205 206 207 208 209 210 211 212 213 214 215 216 217 218 219 220 221 222 223 224 225 226 227 228 229 230 231 232
 			 233 234 235 236 237 238 239 240 241 242 243 244 245 246 247 248 249 250 251 252 253 254 255
			Reading: 
			 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50
 			 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95
 			 96 97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126 127 128 129 130
 			 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145 146 147 148 149 150 151 152 153 154 155 156 157 158 159 160 161 162 163 164 
 			 165 166 167 168 169 170 171 172 173 174 175 176 177 178 179 180 181 182 183 184 185 186 187 188 189 190 191 192 193 194 195 196 197 198
 			 199 200 201 202 203 204 205 206 207 208 209 210 211 212 213 214 215 216 217 218 219 220 221 222 223 224 225 226 227 228 229 230 231 232
 			 233 234 235 236 237 238 239 240 241 242 243 244 245 246 247 248 249 250 251 252 253 254 255
*/

import java.io.*;

public class BufferDemo {
	public static void main(String[] args) {
		int start = 0;
		int finish = 255;
		if (args.length > 1 ) {
			start = Integer.parseInt(args[0]); //overwrites start and finish with user input from cmd-line args
			finish = Integer.parseInt(args[1]);
		} else if (args.length > 0)
			start = Integer.parseInt(args[0]); 

		ArgStream as = new ArgStream(start, finish); 
		System.out.println("\nWriting: ");
		boolean success = as.writeStream(); //bool success: indicates whther the stream operation was completed successfully
		System.out.println("\nReading: ");
		boolean readSuccess = as.readStream(); //bool readSuccess: indicates whther the stream operation was completed successfully
	}
}

class ArgStream {  //helper class
	int start = 0;
	int finish = 255;

	ArgStream (int st, int fin) {
		start = st;
		finish = fin;
	}

	boolean writeStream() {
		try {
			FileOutputStream file = new FileOutputStream("numbers.txt"); //creates an outputstream with the output destination being the file numbers.txt
			BufferedOutputStream buff = new BufferedOutputStream(file); //creates a filter (buffered stream) to alter how information in the FileOutputStream is handled.
			for (int out = start; out <= finish; out++) {
				buff.write(out);
				System.out.print(" " + out);
			}
			buff.close();
			return true;
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage() );
			return false;
		}
	}

	boolean readStream() {
		try {
			FileInputStream file = new FileInputStream("numbers.txt");
			BufferedInputStream buff = new BufferedInputStream(file);
			int in = 0;
			do {
				in = buff.read();
				if (in != -1)
					System.out.print(" " + in);
			} while (in != -1);
			buff.close();
			return true;
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage() );
			return false;
		}
	}
}