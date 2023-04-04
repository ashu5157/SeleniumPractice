package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Example2 {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream t1=new FileInputStream("F:\\Acceleration\\software\\ecllipse workspace\\JavaBasicProgram\\PropertyFile\\Data.properties");
		Properties prop=new Properties();
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("emailid"));
		System.out.println(prop.getProperty("mobile"));
	}

}
