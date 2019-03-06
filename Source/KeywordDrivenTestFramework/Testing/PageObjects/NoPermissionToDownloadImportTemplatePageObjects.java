/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author sscholtz
 */
public class NoPermissionToDownloadImportTemplatePageObjects {
    
    public static String DownloadImportTemplateButtonNotVisible()
    {
        return "//a[@fleet-tooltip='Download import template'][@style='display: none;']";
    }
    
}
