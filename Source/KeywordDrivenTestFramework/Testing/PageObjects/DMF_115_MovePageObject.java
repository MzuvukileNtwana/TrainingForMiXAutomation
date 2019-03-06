/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author smnisi
 */
public class DMF_115_MovePageObject {
    
    public static String DatabaseAdministrationHeader()
    {
        return "//h5/span[text()='Database administration']";
    }
    
     public static String ManageOrganisationStructureHeader()
    {
        return "//h5/span[text()='Manage organisation structure']";
    }
     
     public static String organisationExpandButton()
     {
         return "//strong[text()='Test RSO']/../../../../span";
     }
    
     
     public static String MoveNewDealer()
     {
         return "//a/strong[text()='ZMoveDealer']";
     }
     
     public static String XXXXOrganisationGroup()
     {
         return "//div/a/strong[text()='XXXX - DO NOT USE']";
     }
     
     public static String moveDealer()
     {
         return "//h5/span[text()='Move Dealer']";
     }
    
     public static String cancelButton()
     {
         return "//button[text()='Move']/../button[text()='Cancel']";
     }
     
     public static String moveButton()
     {
         return "//button[text()='Move']";
     }
     
     
     public static String addButton()
     {
         return "//a/i[@class='icon-plus icon-white']";
     }
     
     public static String DealerButton()
     {
         return "//li/a[text()='Dealer']";
     }
    
     
     public static String AddDealerHeading()
     {
         return "//h5/span[text()='Add dealer']";
     }
     
     public static String dealerNameTextbox()
     {
         return "//span[text()='Full legal entity name']/../../input";
     }
     
     public static String saveButton()
     {
         return "//button[text()='Save']";
     }
     
     public static String popMessage()
     {
         return "//span[text()='Dealer moved successfully']";
     }
     
     public static String XXXXdropDownButton()
     {
         return "//strong[text()='XXXX - DO NOT USE']/../../../../span";
     }
     
     public static String removeButtonIcon()
     {
         return "//strong[text()='ZMoveDealer']/../../a[2]/i";
     }
     
     
     public static String removeDealerHeader()
     {
         return "//span[text()='Remove Dealer']";
     }
     
     public static String removeButton()
     {
         return "//Button[text()='Remove']";
     }
     
     public static String removeMessagePop()
     {
         return "//span[text()='Dealer removed successfully']";
     }
     
     public static String RSO()
     {
         return "//strong[text()='Test RSO']/../../../div";
     }
     
     public static String newDealerPopMessage()
     {
         return "//span[text()='Dealer created successfully']";
     }
     
}
