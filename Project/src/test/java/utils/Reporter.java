package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;


public class Reporter{
    public static TakesScreenshot ts;
    public static ExtentSparkReporter spark;
    public static ExtentReports report;

    public static ExtentReports generateExtentReport(){
        spark = new ExtentSparkReporter("./reports/report.html");
        report = new ExtentReports();
        report.attachReporter(spark);
        return report;
    }

    public static String captureScreenshot(String filename){
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
        String dest = "./" + name;
        ts = (TakesScreenshot)Base.driver;
        File file = ts.getScreenshotAs(OutputType.FILE);

        File screenshotDir = new File(System.getProperty("user.dir") + "/reports");
        if(!screenshotDir.exists()){
            screenshotDir.mkdirs();
        }
        File target = new File(screenshotDir, name);
        try{
            FileUtils.copyFile(file, target);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return dest;
    }

    public static void attachScreenshotToReport(String filename, ExtentTest test, String msg){
        try{
            test.log(Status.PASS, msg, MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(filename)).build());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
