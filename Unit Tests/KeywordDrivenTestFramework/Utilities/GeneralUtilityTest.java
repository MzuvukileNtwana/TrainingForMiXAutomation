/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Utilities;
import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.junit.Test;

/**
 *
 * @author szeuch
 */
public class GeneralUtilityTest extends BaseClass
{
    
    EmailUtility emailUtil = new EmailUtility();

    public GeneralUtilityTest() 
    {
        browserType = ApplicationConfig.SelectedBrowser();
        SeleniumDriverInstance = new SeleniumDriverUtility(browserType);
        
    }
    
    @Test
    public void runComandLineStatement() throws IOException
    {
        System.out.println("Running Comand Line Statment");
        //Process process = Runtime.getRuntime().exec("javaws http://dvt-jenkins:8080/computer/RemoteSlave_2/slave-agent.jnlp");
        System.out.println("Comand Line Statment Executed Successfully");
    }
    
    @Test
    public void dateConstructor()
    {
        String effectiveDate = "";
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -1);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date result = cal.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        effectiveDate = dateFormat.format(result);
        
        int year = Integer.parseInt(effectiveDate.substring(0, 4));
        int month = Integer.parseInt(effectiveDate.substring(5, 7));
        int day = Integer.parseInt(effectiveDate.substring(8, 10));
        
        System.out.println(year + " " + month + " " + day);
    }
    
    @Test
    public void mailAccessor()
    {
        String message = emailUtil.retrieveEmail("no_reply@mixtelematics.com", "Verify username");
        
        String[] split = message.split("<a href=\"");
        
        String[] split2 = split[1].split("style");
        
        String finalUrl = split2[0].replaceAll("\"", "");
        
        SeleniumDriverInstance.navigateTo(finalUrl);
        
        System.out.println(finalUrl);
    }
    
    @Test
    public void Today()
    {
        //Today
        String startDate = "2016-02-02 11:22:51 AM".trim();
        String minTime = "00:00:00";
        String maxTime = "23:59:59";
        
        startDate = startDate.replace(" AM", "");
        startDate = startDate.replace(" PM", "");
        
        String [] split = startDate.split(" ");
        
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
        
        SimpleDateFormat sdfTime = new SimpleDateFormat("hh:mm:ss");
        
        Date dateStr;
        Date timeStr;
        Date minDateTime;
        Date maxDateTime;
        Date now = new Date();
        now.getTime();
        
        try
        {
            dateStr = sdfDate.parse(split[0]);
            
            timeStr = sdfTime.parse(split[1]);
            minDateTime = sdfTime.parse(minTime);
            maxDateTime = sdfTime.parse(maxTime);
            
            Date retrievedDate = combine(dateStr, timeStr);
            Date minToday = combine(dateStr, minDateTime);
            Date maxToday = combine(dateStr, maxDateTime);
            
            if (retrievedDate.before(now) && retrievedDate.after(minToday)) 
            {
                System.out.println(true);
            }
            else
            {
                System.out.println(false);
            }
            
            System.out.println("Process Complete");
        }
        catch(Exception e)
        {
            System.err.println("[Error] - " + e.getMessage());
        }
    }
    
    private Date combine(Date date, Date time)
    {
        LocalDate datePart = new LocalDate(date);
        LocalTime timePart = new LocalTime(time);
        LocalDateTime dateTime = datePart.toLocalDateTime(timePart);
        Date result = dateTime.toDate();
        return result;
    }
}