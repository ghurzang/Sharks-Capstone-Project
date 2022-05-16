package utilities;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.Base;

public class util extends Base {
	
	public static String screenShotName() {
		
		Date data = new Date(0);
		String screenShot = data.toString().replace(":", "_").replace(" ", "_");
		return screenShot;
	}
	
	public static void takeScreenShots() {
		
		String location = System.getProperty("user.dir")+ "\\output\\screenshots\\";
		String screenShotFileName = screenShotName() + ".png";
		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(file, new File(location + screenShotFileName));
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception in execution");
		}
	}
		
		public static void threadSleep() {
			try {
				Thread.sleep(3000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			
		}
	}
}
