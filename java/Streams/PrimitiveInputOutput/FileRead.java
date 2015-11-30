/*
   I did NOT write this code -- Kat Russo.
   Source: http://www.tutorialspoint.com/java/java_filewriter_class.htm
*/

import java.io.*;

public class FileRead{

   public static void main(String args[])throws IOException{

      File file = new File("Hello1.txt");
      // creates the file
      file.createNewFile();
      // creates a FileWriter Object
      FileWriter writer = new FileWriter(file); 
      // Writes the content to the file
      writer.write("This\n is\n an\n example\n"); 
      writer.flush();
      writer.close();

      //Creates a FileReader Object
      FileReader fr = new FileReader(file); 
      char [] a = new char[50];
      fr.read(a); // reads the content to the array
      for(char c : a) //for each character in the array
          System.out.print(c); //prints the characters one by one
      fr.close();
   }
}