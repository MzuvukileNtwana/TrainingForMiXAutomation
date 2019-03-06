/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KeywordDrivenTestFramework.Entities;

/**
 *
 * @author ferdinandN
 */
public class DataColumn 
  {
    public String columnHeader;
    public String columnValue;
    public Object objectValue;
    public Enums.ResultStatus resultStatus;
    
    
    public DataColumn(){};
    
    public DataColumn(String header, String value, Enums.ResultStatus result)
    {
        this.columnHeader = header;
        this.columnValue = value;
        
        this.resultStatus = result;
        
    }
    
    public DataColumn(String header, String value)
    {
        this.columnHeader = header;
        this.columnValue = value;
        
    }
    
    public DataColumn(String header, Object value, Enums.ResultStatus result)
    {
        this.columnHeader = header;
        this.objectValue = value;
        this.resultStatus = result;
        
    }
}  

