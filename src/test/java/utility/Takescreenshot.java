package utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Takescreenshot {
	public static void srceenshot1(WebDriver driver, String name) throws IOException {

		TakesScreenshot src = (TakesScreenshot) driver;

		File source = src.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "\\srceenshot\\" + name + ".png";

		File destination = new File(path);

		org.openqa.selenium.io.FileHandler.copy(source, destination);
		
		
		
	}
}
