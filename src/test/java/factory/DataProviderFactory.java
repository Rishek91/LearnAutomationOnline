package factory;

import dataProvider.ConfigDataProvider;
import dataProvider.ExcelDataprovider;

public class DataProviderFactory {

	public static ConfigDataProvider getConfig(){
		ConfigDataProvider config=new ConfigDataProvider();
		
		return config;
	}
	
	public static ExcelDataprovider getExcel(){
		ExcelDataprovider excel=new ExcelDataprovider();
		
		return excel;
	}
	
}
