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
        //trying to read config properties file
	try {
		 //loading into file input stream
		 input = new FileInputStream(dir+"//config.properties");
		 //init properties object
 		 Properties prop = new Properties();
		 //load input file into properties object
		 prop.load(input);
		 //reading ip property
		 String ip = prop.getProperty("ip");
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
