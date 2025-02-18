package com.comcast.crm.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
   public String getdatafrompropertyfile(String key) throws Throwable {
	   FileInputStream fis=new FileInputStream("./ConfigAppData/commondata.properties");
	   Properties pobj=new Properties();
	   pobj.load(fis);
	   String data = pobj.getProperty(key);
	   return data;
	  
}
}
