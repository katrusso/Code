//I altered the DataOutputStreamDemo.java to incorporate FileWriter to see if that writes the ints to a text file correctly. 
// it turns out it does, but now the ints are not printing correctly to the terminal after they are read back in.  -- Kat Russo

//source: http://www.tutorialspoint.com/java/io/dataoutputstream_writeint.htm

import java.io.*;

public class FileWriterDemo {
   public static void main(String[] args) throws IOException {
      
      int[] i = {128,250,430,520,820};
      
      try{
         // create file output stream
         FileWriter fw = new FileWriter("test2.txt");
           
           
         // for each int in int buffer
         for(int j:i)
            fw.write(j + "\n");     //This is writing the correct integers to file.
           
         fw.close();
         
         // create file input stream
         FileInputStream fis = new FileInputStream("test2.txt");
         
         // create new data input stream
         DataInputStream dis = new DataInputStream(fis);
         
         // available stream to be read
         while(dis.available() > 0)
         {
            // read four bytes from data input, return int
            int k = dis.readInt();        //##!!!   THIS IS NOT READING IN THE CORRECT INTEGER VALUES ###!!!

            // print int
            System.out.println(k + " ");
         }
      }catch(Exception e){
         // if any error occurs
         e.printStackTrace();
      }finally{
         
         
      }
   }
}