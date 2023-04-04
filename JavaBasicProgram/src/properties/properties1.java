package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class properties1 {

	public static void main(String[] args) throws IOException {
		FileInputStream f1=new FileInputStream("F:\\Acceleration\\software\\ecllipse workspace\\JavaBasicProgram\\PropertyFile\\Data.properties");
		Properties p1=new Properties();
		p1.load(f1);
	//p1.getProperty("password");
	System.out.println(p1.getProperty("password"));
	System.out.println(p1.getProperty("username"));
	System.out.println(p1.getProperty("emailid"));
	System.out.println(p1.getProperty("applicationurl"));
	System.out.println(p1.getProperty("mobile"));
	String ref=p1.getProperty("mobile");
	System.out.println(ref);
	int num=Integer.parseInt(ref);
	int res=num/10;
	System.out.println(res);
	
	}

}

