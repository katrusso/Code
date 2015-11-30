//I did NOT write this code. -- Kat Russo
//source: http://www.tutorialspoint.com/java/io/dataoutputstream_writeint.htm

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataOutputStreamDemo {
   public static void main(String[] args) throws IOException {
      
      InputStream is = null;
      DataInputStream dis = null;
      FileOutputStream fos = null;
      DataOutputStream dos = null;
      int[] i = {128,250,430,520,820};
      
      try{
         // create file output stream
         fos = new FileOutputStream("test.txt");
           
         // create data output stream
         dos = new DataOutputStream(fos);
           
         // for each int in int buffer
         for(int j:i)
         {
            // write int to data output stream
            dos.writeInt(j);                       //##!!! CONVERTS INT TO A CHARACTER IN THE TEXT FILE. ##!!!
         }
           
         // force data to the underlying file output stream
         dos.flush();
         
         // create file input stream
         is = new FileInputStream("test.txt");
         
         // create new data input stream
         dis = new DataInputStream(is);
         
         // available stream to be read
         while(dis.available()>0)
         {
            // read four bytes from data input, return int
            int k = dis.readInt();
            
            // print int
            System.out.println(k+" ");  //Integers print correctly to the terminal
         }
      }catch(Exception e){
         // if any error occurs
         e.printStackTrace();
      }finally{
         
         // releases all system resources from the streams
         if(is!=null)
            is.close();
         if(dis!=null)
            dis.close();
         if(fos!=null)
            fos.close();
         if(dos!=null)
            dos.close();
      }
   }
}