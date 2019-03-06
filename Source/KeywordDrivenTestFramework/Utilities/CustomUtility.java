/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Utilities;

import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import KeywordDrivenTestFramework.Testing.PageObjects.HOSListDriversPageObject;
import KeywordDrivenTestFramework.Testing.PageObjects.UsabilityOfManageLocationsPageObject;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 * @author lmgulwa
 */
public class CustomUtility {
    public static String reportDirectory;
    
    public CustomUtility()
    {
        
    }
    
    //Read export file for validation
    public ArrayList<String> readFileCellsInColumn(String filePath, int limit, int columnNum)
    {

        ArrayList<String> rec = new ArrayList<>();
        try
        {

            FileInputStream file = new FileInputStream(new File(filePath));

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            int count = 0;
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
            String strDate;
          
            //Retrieve the entire column
            for(Row _row : sheet)
            {
                count++;
                
                //Cell Text in a specific column
                Cell _cell = _row.getCell(columnNum);
                
                try
                {     
                    if(_cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
                    {
                        if (DateUtil.isCellDateFormatted(_cell))
                        {
                            strDate = dateFormat.format(_cell.getDateCellValue());                            
                            rec.add(strDate);
                        }
                    } 
                    else if(_cell.getCellType() == Cell.CELL_TYPE_ERROR)
                    {
                        strDate = "";
                        rec.add(strDate);
                    }
                    else if(_cell.getCellType() == Cell.CELL_TYPE_FORMULA)
                    {
                        if (DateUtil.isCellDateFormatted(_cell))
                        {
                            strDate = dateFormat.format(_cell.getDateCellValue());
                            rec.add(strDate);
                        }
                    }
                    else if(_cell.getCellType() == Cell.CELL_TYPE_STRING)
                    {
                        rec.add(_cell.toString());
                    }
                    else
                    {
                        rec.add(_cell.toString());
                    }
                    
                    if(count >= limit)
                        break;
                }
                catch(Exception ex)
                {
                    rec.add("");
                }
            }

            file.close();

        }
        catch (Exception e)
        {
          System.err.println("[ERROR] Failed to read file - " + e.getMessage());                        
        }
        
        return rec;
    }
    
    //Read export file for validation
    public ArrayList<String> readFileCellsInColumnAndRemoveDoubleWhiteSpace(String filePath, int limit, int columnNum)
    {

        ArrayList<String> rec = new ArrayList<>();
        try
        {

            FileInputStream file = new FileInputStream(new File(filePath));

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            int count = 0;
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
            DataFormatter fmt = new DataFormatter();
            String strDate;
            String text;
          
            //Retrieve the entire column
            for(Row _row : sheet)
            {
                count++;
                
                //Cell Text in a specific column
                Cell _cell = _row.getCell(columnNum);
                
                try
                {     
                    if(_cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
                    {
                        if (DateUtil.isCellDateFormatted(_cell))
                        {
                            strDate = dateFormat.format(_cell.getDateCellValue());                            
                            rec.add(strDate);
                        }
                        else
                        {
                            strDate = fmt.formatCellValue(_cell); 
                            rec.add(strDate);
                        }
                    } 
                    else if(_cell.getCellType() == Cell.CELL_TYPE_ERROR)
                    {
                        strDate = "";
                        rec.add(strDate);
                    }
                    else if(_cell.getCellType() == Cell.CELL_TYPE_FORMULA)
                    {
                        if (DateUtil.isCellDateFormatted(_cell))
                        {
                            strDate = dateFormat.format(_cell.getDateCellValue());
                            rec.add(strDate);
                        }
                    }
                    else if(_cell.getCellType() == Cell.CELL_TYPE_STRING)
                    {
                        rec.add(_cell.toString().replaceAll("\\s+", " "));
                    }
                    else
                    {
                        rec.add(_cell.toString().replaceAll("\\s+", " "));
                    }
                    
                    if(count >= limit)
                        break;
                }
                catch(Exception ex)
                {
                    rec.add("");
                }
            }

            file.close();

        }
        catch (Exception e)
        {
          System.err.println("[ERROR] Failed to read file - " + e.getMessage());                        
        }
        
        return rec;
    }
    //Read export file for validation
    public ArrayList<String> readFileCellsInColumnAndRemoveDoubleWhiteSpaceAndDecimalPoint(String filePath, int limit, int columnNum)
    {

        ArrayList<String> rec = new ArrayList<>();
        try
        {

            FileInputStream file = new FileInputStream(new File(filePath));

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            int count = 0;
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
            DataFormatter fmt = new DataFormatter();
            String strDate;
            String text;
          
            //Retrieve the entire column
            for(Row _row : sheet)
            {
                count++;
                
                //Cell Text in a specific column
                Cell _cell = _row.getCell(columnNum);
                
                try
                {     
                    if(_cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
                    {
                        if (DateUtil.isCellDateFormatted(_cell))
                        {
                            strDate = dateFormat.format(_cell.getDateCellValue());                            
                            rec.add(strDate);
                        }
                        else
                        {
                            strDate = fmt.formatCellValue(_cell); 
                            if(strDate.startsWith("+"))
                            {
                                rec.add(strDate);
                            }
                            else
                            {
                                int temp = Integer.parseInt(strDate);
                                rec.add(String.valueOf(temp));
                            }
                        }
                    } 
                    else if(_cell.getCellType() == Cell.CELL_TYPE_ERROR)
                    {
                        strDate = "";
                        rec.add(strDate);
                    }
                    else if(_cell.getCellType() == Cell.CELL_TYPE_FORMULA)
                    {
                        if (DateUtil.isCellDateFormatted(_cell))
                        {
                            strDate = dateFormat.format(_cell.getDateCellValue());
                            rec.add(strDate);
                        }
                    }
                    else if(_cell.getCellType() == Cell.CELL_TYPE_STRING)
                    {
                        rec.add(_cell.toString().replaceAll("\\s+", " "));
                    }
                    else
                    {
                        rec.add(_cell.toString().replaceAll("\\s+", " "));
                    }
                    
                    if(count >= limit)
                        break;
                }
                catch(Exception ex)
                {
                    rec.add("");
                }
            }

            file.close();

        }
        catch (Exception e)
        {
          System.err.println("[ERROR] Failed to read file - " + e.getMessage());                        
        }
        
        return rec;
    }
    
    //Get the file that just got saved
    public File getTheNewestFile(String ext)
    {
        SeleniumDriverInstance.pause(10000);
        String file = new File("C:/Users/" + System.getProperty("user.name") + "/Downloads/").toString();

        File theNewestFile = null;
        File dir = new File(file);
        FileFilter fileFilter = new WildcardFileFilter("*." + ext);
        File[] files = dir.listFiles(fileFilter);

        if (files.length > 0) {
            /** The newest file comes first **/
            Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
            theNewestFile = files[0];
        }

        return theNewestFile;
    }//end
    
    //Read only the first row
    public ArrayList<String> readFirstRow(String filePath)
    {

        ArrayList<String> rec = new ArrayList<>();
          try
          {

            FileInputStream file = new FileInputStream(new File(filePath));

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext())
            {

                Row row = rowIterator.next();
                //For each row, iterate through all the gridColumns
                Iterator<Cell> cellIterator = row.cellIterator();
                String tempData = "";

                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();

                    //adding header cell text to string
                    tempData = cell.toString();
                    rec.add(tempData);
                    
                }

                //rec.add(tempData);
                //System.out.println("");

                break;
            }
            file.close();

          }
          catch (Exception e)
          {
              e.printStackTrace();
          }
        return rec;
    }
    
    public ArrayList<String> readFileByRow(String filePath)
    {
           
           ArrayList<String> rec = new ArrayList<>();
            try
            {
                FileInputStream file = new FileInputStream(new File(filePath));

                //Create Workbook instance holding reference to .xlsx file
                XSSFWorkbook workbook = new XSSFWorkbook(file);

                //Get first/desired sheet from the workbook
                XSSFSheet sheet = workbook.getSheetAt(0);
				
                int count = 0;
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
                DataFormatter fmt = new DataFormatter();
                String strDate;  
                int maxNumOfCells = sheet.getRow(0).getLastCellNum();
				
                //Iterate through each rows one by one
                Iterator<Row> rowIterator = sheet.iterator();

                for(Row _row : sheet)
                {
                    count++;
					
                    //Row row = rowIterator.next();
					
                    //For each row, iterate through all the columns
                    //Iterator<Cell> cellIterator = row.cellIterator();
                    String tempData = "";
                    
                    for(int cellCounter = 0; cellCounter < maxNumOfCells; cellCounter ++)
                    {
                        //Cell Text in a specific column
                        Cell _cell = _row.getCell(cellCounter);
                        
                        //Check the cell type and format accordingly		
                        try
                        {     
                            if(_cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
                            {
                                if (DateUtil.isCellDateFormatted(_cell))
                                {
                                    strDate = dateFormat.format(_cell.getDateCellValue());                            
                                    tempData += strDate+"#";
                                }
                                else
                                {
                                    strDate = fmt.formatCellValue(_cell);                            
                                    tempData += strDate+"#";
                                }
                            } 
                            else if(_cell.getCellType() == Cell.CELL_TYPE_ERROR)
                            {
                                strDate = "";
                                tempData += strDate+"#";
                            }
                            else if(_cell.getCellType() == Cell.CELL_TYPE_FORMULA)
                            {
                                if (DateUtil.isCellDateFormatted(_cell))
                                {
                                    strDate = dateFormat.format(_cell.getDateCellValue());
                                    tempData += strDate+"#";
                                }
                            }
                            else if(_cell.getCellType() == Cell.CELL_TYPE_STRING)
                            {
                                tempData += _cell.toString()+"#";
                            }
                            else
                            {
                                tempData += _cell.toString()+"#";
                            }
                        }
                        catch(Exception ex)
                        {
                            tempData += " " + "#";
                        }
				
                        //tempData += cell.toString()+"#";
                    }
                    rec.add(tempData.substring(0,tempData.length()-1));
                }
                file.close();

            }
            catch (Exception e)
            {
               System.out.println("Error: Failed to read excel file - "+e.getMessage());
            }
            return rec;
       }
    
    //Move file to reports directory
    public boolean MoveTemplateToReportsDirrectoryAsset()
    {
        try
        {
            String tachoFile = getTheNewestFile("xlsx").toString();
            File efile = new File(tachoFile);
            
            if(!efile.renameTo(new File(this.reportDirectory + "\\"+ efile.getName())))
                return false;
        }
        catch(Exception e)
        {
            System.err.println("[ERROR] Failed to move file - " + e.getMessage());
            return false;
        }
        
        return true;
    }
    
    
     //gets the string date from the tooltip and convert it to a date object  
    public Date getToolTipDateTimePicker(String date,String StartorEndDate)
     {
        Date redate = null;  
       try
       {
         //splits the date string from the tooltip using spaces
         String [] k = date.split(" ");
         //
         //
         //substrings the seconds from the date string from the tooltip
         k[1] = k[1].substring(0, 5);
         DateFormat  dtf = new SimpleDateFormat("yyyy-MM-dd hh:mm a",Locale.ENGLISH);
         
        
          if(StartorEndDate.equals("Start"))
           {
               String date1 = k[0]+" "+k[1]+" "+k[2];//date
               Date DateTime1 = dtf.parse(date1);
               redate = DateTime1;
           } 
                  
       }
       catch(Exception ex)
       {
           
       }
       return redate;
    }
    
     //gets the string date from the tooltip and convert it to a date object  
    public Date IegetToolTipDateTimePicker(String date,String StartorEndDate)
     {
        Date redate = null;  
       try
       {
        //splits the date string from the tooltip using spaces   
         String [] k = date.split(" ");
         //
          //substrings the seconds from the date string from the tooltip
         k[0] = k[0].substring(0, 3);
         DateFormat  dtf = new SimpleDateFormat("yyyy-MM-dd hh:mm a",Locale.ENGLISH);
         
          if(StartorEndDate.equals("Start"))
           {
               String date1 = k[6]+" "+k[7]+k[0]+" "+k[1];//date
               Date DateTime1 = dtf.parse(date1);
               redate = DateTime1;
           } 
                  
       }
       catch(Exception ex)
       {
           System.err.print("Fail: "+ex.getMessage());
       }
       return redate;
    }
    
    
     //gets the string date from the tooltip and and return the date format eg(ART)  
    public String getToolTipDateTimeZone(String date)
     {
        String timeZone="";  
       try
       {
         //splits the date string from the tooltip using spaces
         String [] k = date.split(" ");
         //
         //
          timeZone = k[3];        
       }
       catch(Exception ex)
       {
           
       }
       return timeZone;
    }
    
     //gets the string date from the tooltip and convert it to a date object  
     public Date IeredLinegetToolTipDateTimePicker(String date,String StartorEndDate)
     {
        Date redate = null;  
       try
       {
        //splits the date string from the tooltip using spaces   
         String [] k = date.split(" ");
         //
          //substrings the seconds from the date string from the tooltip
         k[1] = k[1].substring(0, 5);
         DateFormat  dtf = new SimpleDateFormat("yyyy-MM-dd hh:mm a",Locale.ENGLISH);
         
          if(StartorEndDate.equals("Start"))
           {
               String date1 = k[0]+" "+k[1]+" "+k[2];//date
               Date DateTime1 = dtf.parse(date1);
               redate = DateTime1;
           } 
                  
       }
       catch(Exception ex)
       {
           System.err.print("Fail: "+ex.getMessage());
       }
       return redate;
    }
     
     //gets the string date from the datepicker and convert it to a date object  
    public Date getDateTimePicker(String date,String StartorEndDate)
     {
        Date redate = null;  
       try
       {
         //splits the date string from the tooltip using spaces   
         String [] k = date.split(" ");
         //
         //
         
         DateFormat  dtf = new SimpleDateFormat("yyyy-MM-dd hh:mm a",Locale.ENGLISH);
         
        
          if(StartorEndDate.equals("Start"))
           {
               String date1 = k[0]+" "+k[1]+" "+k[2];//date
               Date DateTime1 = dtf.parse(date1);
               redate = DateTime1;
           }
          else  if(StartorEndDate.equals("End"))
          { 
            String date2 = k[6]+" "+k[7]+" "+k[8]; 
            Date DateTime2 = dtf.parse(date2);
            redate = DateTime2;
          }
                  
       }
       catch(Exception ex)
       {
           
       }
       return redate;
    }
    
    //validates the difference between the start and end date using zoomlevel
    public String validateDate(Date DateTime1,Date DateTime2,String timeZoomLevel)
     {
       String zoomLevel="";
       String time="";
       try
       {
         Calendar cal = Calendar.getInstance(); // creates calendar
        // cal.set();
         cal.setTime(DateTime2); // sets calendar time/date
        
         //checks if the zoom level is in hours
         //converts the the hours zoom level to minutes
         //substring the character from the number
         if(timeZoomLevel.contains("h"))
         {
            timeZoomLevel = timeZoomLevel.substring(0,(timeZoomLevel.length()-1));
            timeZoomLevel = String.valueOf((Integer.parseInt(timeZoomLevel)*60));
            time = "h";
         }
         else  if(timeZoomLevel.contains("m"))
         {
            time = "m";
             //substring the character from the number
            timeZoomLevel = timeZoomLevel.substring(0,(timeZoomLevel.length()-1));
         }
         
         if(!timeZoomLevel.equals(""))
         {
            //substracts the minutes from the calender object
            cal.add(Calendar.MINUTE, -Integer.parseInt(timeZoomLevel)); // subtracts minutes
            DateTime2 = cal.getTime();
        
            if(DateTime2.toString().equals(DateTime1.toString()))
            {
              if(time.equals("h")) 
              {
                 // converts the zoom level back to hours
                 timeZoomLevel = String.valueOf((Integer.parseInt(timeZoomLevel)/60));
              }
              zoomLevel="Time Difference is equal to the selected Zoom time : "+timeZoomLevel+time;
            }
            else
            {
             zoomLevel ="";
            }
         }
       
        
       }
       catch(Exception ex)
       {
           
       }
        
        return zoomLevel;
    }
    
    //gets all the works states, adds them together and validate if they are equal to the zoom level
    public int getWorkStateTotal(int numberOfWorkStates,String zoomTime)
     {
        String SelectedZoomTime ="";
        int minutes=0;
        int hours =0;
        int count=0;
    
        for(int i = 1; i <= numberOfWorkStates;i++)
        {
            //gets the work states from the website
           SelectedZoomTime = SeleniumDriverInstance.getElementTextByXpath(HOSListDriversPageObject.workstateValueXpath(i)); 
          //seperate the hours and minutes
           String [] k = SelectedZoomTime.split(":");
           minutes = minutes + Integer.parseInt(k[1]);
           hours = hours + Integer.parseInt(k[0]);
        }
       
        while(minutes >= 60)
        {
            //subtracts hours from the minutes
            minutes = minutes - 60;
            count++;
        }
        
        hours = hours + count;
        
       
        if(zoomTime.contains("h"))
        { 
           //rounds the hours and minutes to get only hours 
          String newTime = hours+"."+minutes;
          numberOfWorkStates = (int) Math.round(Double.parseDouble(newTime));
        }
        else
        {
          numberOfWorkStates = minutes;
        }
        
        return numberOfWorkStates;
    }
    
    //known total list number
    public int scrollDownApage(int TotalListNumber)
    {
        List <WebElement> itemList = null;

        boolean continueOn = false;
        
        try
        {
            while(!continueOn)
            {
                itemList = SeleniumDriverInstance.Driver.findElements(By.xpath(UsabilityOfManageLocationsPageObject.tableBodyColumn4Xpath()));
                int itemsListTemp = itemList.size();

                if (itemList.size() != TotalListNumber) 
                {
                    itemList.get(itemList.size() - 1).click();
                    Robot robot = new Robot();
                    robot.keyPress(KeyEvent.VK_PAGE_DOWN);
                    robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
                }
                else if (itemsListTemp == itemList.size()) 
                {
                    continueOn = true;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("[Error] " + e.getMessage());
        }
        
        return itemList.size();
    
    }
    
    //unknown total list number
    //get an xpath that point to the table rows. each time it runs it gets the number of rows
    //e.g --- //div/table[@class]/tbody/tr
    public int scrollDownApageWithUnknownListTotal(String Tablexpath)
    {
       int itemsListTemp =0;
       int TotalListNumber=1;
        List <WebElement> itemList = null;

        boolean continueOn = false;
        
        try
        {
            while(!continueOn)
            { 
                itemList = SeleniumDriverInstance.Driver.findElements(By.xpath(Tablexpath));
                if (itemsListTemp != TotalListNumber) 
                {
                    itemList.get(itemList.size() - 1).click();
                    Robot robot = new Robot();
                    robot.keyPress(KeyEvent.VK_PAGE_DOWN);
                    robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
                }
                else if (itemsListTemp == itemList.size()) 
                {
                    continueOn = true;
                }
                TotalListNumber = itemsListTemp;
                itemList = SeleniumDriverInstance.Driver.findElements(By.xpath(UsabilityOfManageLocationsPageObject.tableBodyColumnXpath()));
                itemsListTemp = itemList.size();
               
            }
        }
        catch(Exception e)
        {
            System.out.println("[Error] " + e.getMessage());
        }
        
        return itemList.size();
    
    }
    
    
    //get an xpath that point to the table rows. each time it runs it gets the number of rows
    //e.g --- //div/table[@class]/tbody/tr
    public int scrollDownApageOneTimeWithUnknownListTotal(String Tablexpath)
    {
        List <WebElement> itemList = null;

        
        try
        {
            itemList = SeleniumDriverInstance.Driver.findElements(By.xpath(Tablexpath));
            itemList.get(itemList.size() - 1).click();
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
               
          
        }
        catch(Exception e)
        {
            System.out.println("[Error] " + e.getMessage());
        }
        
        return itemList.size();
    
    }
    
    //Write to a text file 
    public void writeToFile(List<String> value, String fileName)
    {    
        File fileWriter;

        try
        {
            fileWriter = new File(fileName);
            
            //Convert file to UTF-8 inorder to accept foreign characters
            PrintWriter p = new PrintWriter(new OutputStreamWriter(new FileOutputStream(fileWriter), "UTF8"));
            
            for(String strings : value)
            {
                p.println(strings);
            }
           
            p.close();
        } 
        catch (IOException ex) 
        {
            System.err.println("Error writing to file '" + fileName + "'");
        }        
    }
    
    //Read from a text file
    public List readFromFile(String fileName)
    {
        String line = "";
        List<String> items = new ArrayList<>();
        
        try
        {
            FileReader reader = new FileReader(fileName);
            
            BufferedReader bufferReader = new BufferedReader(reader);
            
            while((line = bufferReader.readLine())!= null)
            {
                items.add(line);
            }
            
            bufferReader.close();
        }
        catch (IOException ex) 
        {
            System.err.println("Error reading from file '" + fileName + "'");
        }
        
        return items;
    }  
}
