package com.comcast.crm.genericutility;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtility {
	public Object getdatafromJsonfile(String Key) throws Throwable {
		   FileReader fileR=new FileReader("./ConfigAppData/commondata.json");
		   JSONParser parser=new JSONParser();
		 Object obj = parser.parse(fileR);
		 JSONObject map=(JSONObject)obj;
		 Object data= map.get(Key);
		 return data;
			   
}
}