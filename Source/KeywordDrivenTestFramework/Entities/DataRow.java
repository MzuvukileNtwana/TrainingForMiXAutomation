/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Entities;


import java.util.LinkedList;


/**
 *
 * @author fnell
 */
public class DataRow 
{
    public LinkedList<DataColumn> DataColumns;
    
    public DataRow()
    {
        DataColumns = new LinkedList<>();
    }
    
    
//    public String getColumnValue(String columnHeader)
//    {
//        try
//        {
//            Predicate<DataColumn> predicate = c-> c.columnHeader.equals(columnHeader);
//            DataColumn  obj = DataColumns.stream().filter(predicate).findFirst().get();
//            return obj.columnValue;
//        }
//        catch(Exception ex)
//        {
//            err.println("[ERROR] Could not find column - " + columnHeader + " - in table row");
//            return "";
//        }
//        
//    }

}

