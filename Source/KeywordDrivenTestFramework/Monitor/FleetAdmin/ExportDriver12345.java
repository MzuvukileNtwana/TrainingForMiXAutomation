package KeywordDrivenTestFramework.Monitor.FleetAdmin;
import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.narrator;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author AnelisiweC
 */
public class ExportDriver12345 extends BaseClass{
    
    int counter = 1;
    String errorMsg;
    TestEntity testData;
    String file;
    String[]Fields =new String[11];
    
    public ExportDriver12345(TestEntity testData){
            
        this.testData = testData;
    }
    
  public TestResult executeTest() throws InterruptedException, IOException{
        
        this.setStartTime();
        if(!ClickMonitor()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", true);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
        pause(3000);
        
        
         if(!AddDriver()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", true);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
        pause(3000);
        
          if(!RemoveExcel()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", true);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
        pause(3000);
         if(!DownloadFile()) {
            
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Monitor Tab", true);
            counter++;
            narrator.failedMessage("Failed to click on Monitor Tab - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
        }
         pause(3000);
            if(!Checkfield()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on assets Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on assets Tab - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on assets Tab", this.getTotalExecutionTime());
        }
            pause(3000);
                if(!openExcel()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on assets Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on assets Tab - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on assets Tab", this.getTotalExecutionTime());
        }
                
        
        return new TestResult (testData, Enums.ResultStatus.PASS, "Successfully added my first asset", this.getTotalExecutionTime());
  }
  
  public boolean ClickMonitor(){
      
        if(!SeleniumDriverInstance.clickElementByXpath("(//A[@href='#'])[1]")) {
            errorMsg = "failed to click on monitor tab";
            return false;
        }
            SeleniumDriverInstance.takeScreenShot(counter+ "sucessfully cliked on monitor tab", false);
            counter++;
                  
            return true;
    }
public boolean AddDriver(){
      
        if(!SeleniumDriverInstance.clickElementByXpath("(//a[@class='ng-binding'])[7]")) {
            errorMsg = "failed to click on monitor tab";
            return false;
        }
            SeleniumDriverInstance.takeScreenShot(counter+ "sucessfully cliked on monitor tab", false);
            counter++;
                  
            return true;
    }

  public boolean DownloadFile(){
         
        
            if(!SeleniumDriverInstance.clickElementByXpath("//i[@class='icon-export']")) {
            errorMsg = "failed to click on assets tab";
            return false;
        }
            SeleniumDriverInstance.takeScreenShot(counter+ "sucessfully cliked on assets tab", false);
            counter++;
                  
            return true;
    }
//  Code to remove file from desktop
     public boolean RemoveExcel(){
      
          File folder = new File("C:/Users/"+System.getProperty("user.name")+".AFRICA/Downloads/");

        File[] files = folder.listFiles();
        
        for(File file: files){
            if(file.getName().endsWith(".xlsx")){
                file.delete();
            }
            
        }
    return true;
    
  }
//     Open the file on the browser
     public boolean Checkfield(){
      for(int i=0; i<11;i++)
      {
          Fields[i]=SeleniumDriverInstance.retrieveTextByXpath("(//span[@class = 'title'])["+(i+2)+"]");
      }
      pause(2000);
//       System.out.print( "site");
      for(String a: Fields){
          System.out.print(a+",");
      
      }
      SeleniumDriverInstance.takeScreenShot(counter + "- Clicked asset tab successfully -", false);
   counter++;
    return true;
}
     
        public boolean openExcel() throws IOException  {
//        Code to go to the folder on the Desktop      
                String FileName= "";
                File folder = new File("C:/Users/"+System.getProperty("user.name")+".AFRICA/Downloads/");
//                 File folder = new File("C:\\Users\\AnelisiweC.AFRICA\\Downloads\\");

                File[] files = folder.listFiles();
        
                for(File file: files){
                    if(file.getName().startsWith("Drivers")){
                        FileName= file.getName();
                    }
            
                }
                
//                Open the excel file by this code
                FileInputStream fsIP = new FileInputStream(new File("C:/Users/"+System.getProperty("user.name")+".AFRICA/Downloads/"+FileName));
//                 FileInputStream fsIP = new FileInputStream(new File("C:\\Users\\AnelisiweC.AFRICA\\Downloads\\"+FileName));
                //Read the spreadsheet that needs to be updated  
                XSSFWorkbook wb = new XSSFWorkbook(fsIP); //Access the workbook
                  
                XSSFSheet worksheet = wb.getSheetAt(0); //Access the worksheet, so that we can update / modify it.
                XSSFRow row = worksheet.getRow(0);
                System.out.println();
                String[]ExcelFields= new String[11];
                int k = 0;
                for(int i=0; i<11;i++){
                    if(row.getCell(i+k).toString().equals("Last trip Time zone") || row.getCell(i+k).toString().equals("MyMiX Temporary Password") || row.getCell(i+k).toString().equals("MyMiX Temporary Password Expiry Date")){
                        k++;
                    }
                    ExcelFields[i]=row.getCell(i+k).toString(); 
                }
//                 System.out.print( "execl");
                for(String a: ExcelFields){
                    System.out.print(a+",");
      
                }
                System.out.println();
                    if(!Arrays.equals(Fields,ExcelFields)){   
                    return false;
                }
                return true;   
        }
}