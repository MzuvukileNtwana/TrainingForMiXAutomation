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
public class RemoveContractsPageObjects {
    
    
    public static String IridiumAirtimeContract1()
    {
        return "//strong[text()='1']/../../a[1]";
    }
    
    public static String Paragraph()
    {
        return "//p[text()='The airtime contract '][text()=' is currently in use by:']/strong";
    }
    
    public static String Assets()
    {
        return "//a[contains(text(), 'assets')]";
    }
    
    public static String XButton()
    {
        return "//div[@header-title=\"Airtime contract in use\"]/div[@class='modal-body']/div/div/div/button";
    }
    
    public static String CloseButton()
    {
        return "//button[text()='Close']";
    }
    
    public static String IridiumHeader()
    {
        return "//h5[text()='Iridium airtime contracts']";
    }
    
    public static String SelectContract()
    {
        return "//a[text()='Click to select contract']";
    }
    
    public static String SelectContractHeading()
    {
        return "//span[text()='Select contract']";
    }
    
    
    public static String ContractType()
    {
        return "//select[@ng-options=\"contractType.id as contractType.title for contractType in contractModalTemplate.contractTypes\"]";
    }
    
    public static String Contract()
    {
        return "//select[@ng-options=\"contract.id as contract.title for contract in contractModalTemplate.filteredContracts\"]";
    }
    
    public static String Spinner()
    {
        return "//div[@class=\"modal-body\"]/div/div/div/div[@class=\"loading-overlay ng-scope\"][@style=\"display: none;\"]";
    }
    
    public static String SelectContractButton()
    {
        return "//button[text()='Select']";
    }
    
    public static String AddedContractValidation(String contract)
    {
        return "//a[text()='"+contract+"']";
    }
    
    public static String RemoveContract(String contract)
    {
        return "//a[text()='"+contract+"']/../a[@ng-click=\"removeContract(contract)\"]/i";
    }
    
    public static String ConfirmationText()
    {
        return "//p[text()='This action will remove this contract from the available contract list. Are you sure you would like to continue?']";
    }
    
    public static String CancelButtonRemove()
    {
        return "//div[@class='modal hide fade modal-mini in']/div/button[text()='Cancel']";
    }
    
    public static String IridiumSpinner()
    {
        return "//div[@class=\"tab-pane active ng-scope\"]/div[@class=\"loading-overlay ng-scope\"][@style=\"display: none;\"]";
    }
    
    public static String RemoveButton()
    {
        return "//div[@class='modal hide fade modal-mini in']/div/button[text()='Remove']";
    }
    
}
