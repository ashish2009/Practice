package webAutomation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverInitiation {

    private static String url = "http://127.0.0.1:4444/wd/hub";

    private static String browser = "chrome";

    private static String platform = "MAC";

    private AppiumDriver appiumDriver;

    private static DesiredCapabilities getBrowserCapability(){
        DesiredCapabilities desiredCapabilities = null;

        if(browser.equalsIgnoreCase("CHROME")){
            desiredCapabilities = DesiredCapabilities.chrome();
            desiredCapabilities.setPlatform(Platform.ANY);

            if(System.getProperty("os.name").equalsIgnoreCase("LINUX") || System.getProperty("os.name").equalsIgnoreCase("MAC")){
                System.setProperty("webdriver.chrome.driver","/Users"+System.getProperty("user.name")+"/Documents/selenium/chromedriver");
            }else {
                System.setProperty("webdriver.chrome.driver","C:\\Users\\"+System.getProperty("user.name")+"\\Documents\\selenium\\chromedriver");
            }
        }else if (browser.equalsIgnoreCase("IE")){
            desiredCapabilities = DesiredCapabilities.internetExplorer();
            desiredCapabilities.setPlatform(Platform.WINDOWS);
        }else {
            desiredCapabilities = DesiredCapabilities.firefox();
            desiredCapabilities.setPlatform(Platform.ANY);

            if(System.getProperty("os.name").equalsIgnoreCase("LINUX") || System.getProperty("os.name").equalsIgnoreCase("MAC")){
                System.setProperty("webdriver.gecko.driver","/Users"+System.getProperty("user.name")+"/Documents/selenium/geckodriver");
            }else {
                System.setProperty("webdriver.gecko.driver","C:\\Users\\"+System.getProperty("user.name")+"\\Documents\\selenium\\geckodriver");
            }
        }
        return desiredCapabilities;
    }

    private static void setCustomProfile(DesiredCapabilities capabilities,String path){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir="+path);
        capabilities.setCapability(ChromeOptions.CAPABILITY,options);
    }

    private static void setAndroidAppCapability(String androidAppPath,String androidAppName){
        File appDir = new File(androidAppPath);
        File app = new File(appDir, androidAppName);
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName", "null");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("unicodeKeyboard", "true");
        capabilities.setCapability("clearDeviceLogsOnStart", true);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        capabilities.setCapability("newCommandTimeout", "45000");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability("app", app.getPath());
        capabilities.setCapability("appPackage", "com.quikr");
        capabilities.setCapability("appActivity", "com.quikr.old.SplashActivity");
        //  capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
    }

    private static void setAndroidSiteCapability(DesiredCapabilities capabilities){
        capabilities = DesiredCapabilities.android();
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,30000);
        capabilities.setPlatform(Platform.ANY);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
    }

    private static void setIosSiteCapability(DesiredCapabilities capabilities){
        capabilities = DesiredCapabilities.iphone();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.3");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, browser);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "");
    }


    private static void setIOSAppCapability(String appPath,String appName){
        File appDir = new File(appPath);
        File app = new File(appDir, appName);
        DesiredCapabilities capabilities=new DesiredCapabilities();

        capabilities.setCapability("platformVersion", "11.4");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone 7");
        capabilities.setCapability("udid", "68d9e1b007c77039354187975a19b2d20b67ca8c");
        capabilities.setCapability("app", app.getPath());
        capabilities.setCapability("xcodeSigningId", "iPhone Developer");
        capabilities.setCapability("xcodeOrgId", "236WEL7W7T");
        capabilities.setCapability("noReset", false);
        capabilities.setCapability("fullReset", true);
        capabilities.setCapability("wdaLocalPort",8100);
        capabilities.setCapability("realDeviceLogger", "/usr/local/lib/node_modules/deviceconsole");
        capabilities.setCapability("showIOSLog", "true");
    }

    private void getDriver(String driverName,String url,DesiredCapabilities capabilities) throws MalformedURLException {
        if(driverName.equalsIgnoreCase("android")){
            appiumDriver = new AndroidDriver(new URL(url),capabilities);
        }else {
            appiumDriver = new IOSDriver(new URL(url),capabilities);
        }
    }

    public static void main(String[] args) throws MalformedURLException {

        RemoteWebDriver remoteWebDriver = new RemoteWebDriver(new URL(url),getBrowserCapability());
        remoteWebDriver.get("https://www.quikr.com");
    }
}
