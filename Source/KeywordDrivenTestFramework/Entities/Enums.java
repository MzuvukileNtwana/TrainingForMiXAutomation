package KeywordDrivenTestFramework.Entities;

/**
 * Created with IntelliJ IDEA.
 * User: fnell
 * Date: 2013/04/26
 * Time: 3:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Enums
{
    public enum BrowserType {
        IE, FireFox, Chrome, Safari, Canary
    }
    
    public enum ResultStatus
    {
        PASS, FAIL, WARNING, UNCERTAIN
    }
    
    public enum RelativePosition
    {
        Above, Below, Right, Left
    }
    
    public enum MobilePlatform {
        Android, iOS
    }
    
    public enum Device 
    {
       SamsungS4("udid","4d00961000c430bd","http://127.0.0.1:4723/wd/hub",MobilePlatform.Android),
       SamSung_Custom_Phone("udid", "emulator-5554", "http://127.0.0.1:4723/wd/hub", MobilePlatform.Android);
       
       
       public final String CapabilityName;
       public final String DeviceID;
       public final String ServerURL;
       public final MobilePlatform platform;
        
       // This constructor defines and instantiates the parameters declared above. Parameter order is specified here and will 
       // define the order in which the enum types' properties are specified. 
       Device(String CapabilityName, String DeviceID, String ServerURL, MobilePlatform _platform)
       {
           this.CapabilityName = CapabilityName;
           this.DeviceID = DeviceID;
           this.ServerURL = ServerURL;
           this.platform = _platform;
       }
      
    }
    
    public enum DeviceConfig {
        
        //Capability information is stored here.
        //AppName and AppFilePath are for both APK and IPA.
        //Uses the format Name(deviceName, platformName, automationName, Version, appPackage, appActivity, appName, appFilePath)
        
        
        MixTelematics("5554", "Android", "Appium", "4.4", "com.mixtelematics.mix.go.main", "com.mixtelematics.mix.go.main.LoginActivity", "MiXGo_16.3.0.0.apk", "C:\\MixTelematics\\mixtelematics_keyworddriventestautomation_dvt\\Applications"),
        MixTelematics_GalaxyS4("4d00961000c430bd", "Android", "Appium", "5.0.1", "com.mixtelematics.mix.go.main", "com.mixtelematics.mix.go.main.LoginActivity", "MiXGo_16.3.0.0.apk", "C:\\MixTelematics\\mixtelematics_keyworddriventestautomation_dvt\\Applications");
        
        public final String deviceName;
        public final String platformName;
        public final String automationName;
        public final String Version;
        public final String appPackage;
        public final String appActivity;
        public final String ApplicationName;
        public final String ApplicationFilePath;
       
        
        // This constructor defines and instantiates the parameters declared above. Parameter order is specified here and will 
       // define the order in which the enum types' properties are specified. 
        
        DeviceConfig(String deviceName, String platformName, String automationName, String Version, String appPackage, String appActivity, String ApplicationName, String ApplicationFilePath)
        {
           this.deviceName = deviceName; 
           this.platformName = platformName; 
           this.automationName = automationName; 
           this.Version = Version; 
           this.appPackage = appPackage; 
           this.appActivity = appActivity; 
           this.ApplicationName = ApplicationName;
           this.ApplicationFilePath = ApplicationFilePath;
        }
    }
    
    public enum Environment
    {
        // Add environment urls here, parameter order is defined by the constructor (Environment) definition below
        // Please note that adding an addtional environment type will require you to comma-seperate them.
        // Visit http://docs.oracle.com/javase/tutorial/java/javaOO/enum.html to learn more about Java Enum declarations. 
       
        // Here we are declaring the Dev Environment type, and passing the following two properties, a url and a connection string, 
        // which are defined below as both being string literals:
        
        // DEV[FirstPageURL,FirstDatabaseConnectionString]
        
        CONFIG("http://config.dev.mixtelematics.com/","http://mailinator.com/"),
        INT("https://integration.mixtelematics.com","http://mailinator.com/"),
        INTDP("https://integration.mixtelematics.com/driverportal.web/#/login",""),
        UATDP("https://mymix.uat.mixtelematics.com/",""),
        USDP("https://mymix.us.mixtelematics.com/",""),
        UKDP("https://mymix.uk.mixtelematics.com/",""),
        ENTDP("https://mymix.ent.mixtelematics.com/",""),
        //OMANDP("https://mymix.oman.mixtelematics.com/",""),
        AUDP("https://mymix.au.mixtelematics.com/",""),
        CPTDP("https://mymix.za.mixtelematics.com/",""),
        UAT("https://uat.mixtelematics.com","http://mailinator.com/"),
        CPT("https://za.mixtelematics.com","http://mailinator.com/"),
        EU("https://eu.mixtelematics.com","http://mailinator.com/"),
        ENT1("https://ent1.mixtelematics.com","http://mailinator.com/"),
        UK("https://uk.mixtelematics.com","http://mailinator.com/"),
        US("https://us.mixtelematics.com","http://mailinator.com/"),
        OMAN("https://om.mixtelematics.com","http://mailinator.com/"),
        ENT("https://ent.mixtelematics.com/#/login","http://mailinator.com/"),
        AU("https://au.mixtelematics.com","http://mailinator.com/"),
        ALG("https://alg.mixtelematics.com/","http://mailinator.com/"), 
        ;
        
        
        // For each system (website1, database1, website2 etc.) within the defined environment (Dev, QA, Prod etc.)
        // you will have to declare the appropriate string to store its properties (URL or connection string etc.).
        public final String PageUrl;
        public final String PageMailinatorlUrl;
        
        
//        public final String ForgotPasswordURL;
        
        // This constructor defines and instantiates the parameters declared above. Parameter order is specified here and will 
        // define the order in which the enum types' properties are specified. 
        Environment(String pageUrl,String PageMailinatorlUrl)
        {
            this.PageUrl = pageUrl;
            
             this.PageMailinatorlUrl = PageMailinatorlUrl;
        }
                
    }
    
    public static Environment resolveTestEnvironment(String environment)
        {
            switch (environment.toUpperCase()) 
            {
                case "CONFIG":
                    return Environment.CONFIG;
                case "INT":
                    return Environment.INT;
                case "INTDP":
                    return Environment.INTDP;    
                case "UAT":
                    return Environment.UAT;
                case "UATDP":
                    return Environment.UATDP;
                case "USDP":
                    return Environment.USDP;
                case "UKDP":
                    return Environment.UKDP;
                case "AUDP":
                    return Environment.AUDP;
                case "ENTDP":
                    return Environment.ENTDP;
                case "CPTDP":
                    return Environment.CPTDP;
                case "CPT":
                    return Environment.CPT;
                case "UK":
                    return Environment.UK;
                case "US":
                    return Environment.US;
                case "OMAN":
                    return Environment.OMAN;
                case "ENT":
                    return Environment.ENT;
                case "AU":
                    return Environment.AU;
                case "ALG":
                    return Environment.ALG;
                case "EU":
                    return Environment.EU;
                default:
                    return Environment.INT;
            }
        }
}
