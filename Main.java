import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
public static void main(String args[]) {
	//User current path
	final String dir = System.getProperty("user.dir");
	//input stream file prop
	InputStream input;
    //provo a fare l'input stream e a leggere qualcosa
	try {
		input = new FileInputStream(dir+"//config.properties");
		 Properties prop = new Properties();
		 //carico il file di input
		 prop.load(input);
		 //provo a leggere la proprietà ip
		 String ip=prop.getProperty("ip");
		 System.out.println("La proprietà ip letta dal file config vale: "+ip);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
