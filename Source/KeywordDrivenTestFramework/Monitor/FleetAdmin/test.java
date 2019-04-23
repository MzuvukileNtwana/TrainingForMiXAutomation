/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Monitor.FleetAdmin;

import java.io.File;

/**
 *
 * @author AnelisiweC
 */
public class test {
    public static boolean RemoveExcel(){
      
        File folder = new File("C:\\Users\\AnelisiweC.AFRICA\\Downloads");
        File[] files = folder.listFiles();
        
        for(File file: files){
            if(file.getName().endsWith(".xlsx")){
                file.delete();
            }
            
        }
    return true;    
  }
  
    public static void main(String[] args){
        System.out.println("before");
        System.out.println(System.getProperty("user.name"));
        System.out.println(RemoveExcel());
        System.out.println("after");
    }
    
}
