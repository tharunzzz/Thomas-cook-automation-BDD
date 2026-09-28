package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot extends Base{
    public static void captureScreenshot(String filename){
        File screenshotDir = new File("screenshots");

        if(!screenshotDir.exists()){
            screenshotDir.mkdir();
        } 

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File screenshotPath = new File(screenshotDir, filename + ".png");
        try{
            FileUtils.copyFile(screenshot, screenshotPath);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}