import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVariableDeclare {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		
FileInputStream file=new FileInputStream("C:\\Users\\PARANTHAMAN GEETHA\\eclipse-workspace\\Basics_learn\\src\\data.properties");
prop.load(file);
System.out.println(prop.getProperty("browser"));
System.out.println(prop.getProperty("url"));
FileOutputStream outPUt=new FileOutputStream("C:\\Users\\PARANTHAMAN GEETHA\\eclipse-workspace\\Basics_learn\\src\\data.properties");
prop.store(outPUt, null);
//need to get the dta from file should set the value
prop.setProperty("browser","FireFox");
Object browser=prop.getProperty("browser");

prop.setProperty("url","Udemy Login.com");
Object url=prop.getProperty("url");
System.out.println("Updated browser version to file is "+browser);
System.out.println("Updated url to file is "+url);


	}

}
