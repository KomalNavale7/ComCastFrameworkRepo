package PractiseObjectRepository;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.comcast.crm.genericutility.FileUtility;
import com.objectrepositoryutility.LoginPage;

public class CreateLoginOrganization {
        public static void main(String[] args) throws Throwable  
        {
        	WebDriver driver=new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	FileUtility fu=new FileUtility();
        	driver.get(fu.getdatafrompropertyfile("url"));
        	LoginPage lp=new LoginPage(driver);
        	lp.loginToApp("admin","admin");
        
        }
}