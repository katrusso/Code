import java.io.*; //contains IOExceptions (Stream exceptions)

public class ByteReader {
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("./class.txt");
			boolean eof = false;
			int count = 0;
			while (!eof) {
				int input = file.read();
				System.out.print(input + " ");
				if (input == -1)
					eof = true;
					else
						count++;
			}
			file.close();
			System.out.println("\n Bytes read: " + count);
		} catch (IOException e) {
			System.out.println(("Error -- " + e.toString()));
		}
	}
}