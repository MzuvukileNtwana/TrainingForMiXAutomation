package KeywordDrivenTestFramework.Monitor.FleetAdmin;
import java.io.File;
import KeywordDrivenTestFramework.Core.BaseClass;

import static KeywordDrivenTestFramework.Core.BaseClass.narrator;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import static org.apache.poi.hssf.usermodel.HeaderFooter.file;
import org.apache.poi.ss.usermodel.Cell;
import java.io.*;
import java.util.Arrays;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



/**
 *
 * @author AnelisiweC
 */
public class AssetsExport12345 extends BaseClass{
 String[]Fields =new String[11];   
 int counter= 1;
 String errorMsg;
 TestEntity testData;
 //String file;
// String[]Fields =new String[11];
    public AssetsExport12345(TestEntity testData){
            
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
        
         if(!ClickAsset()) {
            
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
        
           if(!Checkfield()){
            SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on assets Tab", false);
            counter++;
            narrator.failedMessage("Failed to click on assets Tab - "+errorMsg);
            return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on assets Tab", this.getTotalExecutionTime());
        }
         pause(5000);
        
 
         pause(5000);
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
        
     public boolean ClickAsset(){
         
        
            if(!SeleniumDriverInstance.clickElementByXpath("//A[@ng-href='#/fleet-admin/assets'][text()='Assets']")) {
            errorMsg = "failed to click on assets tab";
            return false;
        }
            SeleniumDriverInstance.takeScreenShot(counter+ "sucessfully cliked on assets tab", false);
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
   
   public boolean Checkfield(){
      for(int i=0; i<11;i++)
      {
          Fields[i]=SeleniumDriverInstance.retrieveTextByXpath("(//span[@class = 'title'])["+(i+2)+"]");
      }
      pause(2000);
      for(String a: Fields){
          System.out.print(a+",");
      
      }
      
      SeleniumDriverInstance.takeScreenShot(counter + "- Clicked asset tab successfully -", false);
   counter++;
    return true;
}
   public boolean openExcel() throws IOException  {
      
                String FileName= "";
                File folder = new File("C:/Users/"+System.getProperty("user.name")+".AFRICA/Downloads/");
                File[] files = folder.listFiles();
        
                for(File file: files){
                    if(file.getName().startsWith("Assets")){
                        FileName= file.getName();
                    }
            
                }
                FileInputStream fsIP = new FileInputStream(new File("C:/Users/"+System.getProperty("user.name")+".AFRICA/Downloads/"+FileName)); //Read the spreadsheet that needs to be updated  
                XSSFWorkbook wb = new XSSFWorkbook(fsIP); //Access the workbook
                  
                XSSFSheet worksheet = wb.getSheetAt(0); //Access the worksheet, so that we can update / modify it.
                XSSFRow row = worksheet.getRow(0);
                System.out.println();
                String[]ExcelFields= new String[11];
                int k = 0;
                for(int i=0; i<11;i++){
                    if(row.getCell(i+k).toString().equals("Last trip Time zone") || row.getCell(i+k).toString().equals("Last position Time zone")){
                        k++;
                    }
                    ExcelFields[i]=row.getCell(i+k).toString(); 
                }
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