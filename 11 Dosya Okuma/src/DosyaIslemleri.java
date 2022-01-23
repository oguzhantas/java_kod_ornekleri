import java.io.*;

public class DosyaIslemleri {

	public static void main(String[] args) throws IOException {
		int ch; 
        FileReader dosya=null;
        try
        {
           dosya = new FileReader("cikis.txt");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("Dosya bulunumadý");
        }
  
        // Dosya sonuna kadar oku 
        while ((ch=dosya.read())!=-1)
            System.out.print((char)ch);

        dosya.close();
	}
}
