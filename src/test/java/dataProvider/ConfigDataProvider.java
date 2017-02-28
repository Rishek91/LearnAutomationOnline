package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	
	public ConfigDataProvider(){
		
		File src=new File("./Configuration/Config.properties");
		try {
			FileInputStream fis=new FileInputStream( src);
			
			 pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			
			System.out.println("Exception is "+e.getMessage());
		
		}
	
	}
	
	public String getChromepath(){
		
		String Chrome_path=pro.getProperty("ChromePath");
		return  Chrome_path;
	}
	
	public String getIEPath(){
		
		String IE_path=pro.getProperty("IEPath");
		return IE_path;
	}
	
	public String getFireFoxPath(){
		
		String FireFox_Path=pro.getProperty("FireFoxPath");
		return FireFox_Path ;
	}
		
	
	public String getApplicationUrl(){
		
		String Url=pro.getProperty("Url");
		return  Url;
		
		
	}
	}
