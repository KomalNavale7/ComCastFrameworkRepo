package genericWebDriverUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int getRandomNumber() {
	      Random random=new Random();
	      int randomint = random.nextInt(2000);
	      return randomint;
}

public String getSystemDateyyymmdd() {
	Date dateobj=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat();
	String date = sdf.format(dateobj);
	return date;
}
}


