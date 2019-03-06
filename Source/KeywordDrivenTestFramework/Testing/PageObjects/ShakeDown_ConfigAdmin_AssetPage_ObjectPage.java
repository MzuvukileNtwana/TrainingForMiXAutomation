/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author smarenene
 */
public class ShakeDown_ConfigAdmin_AssetPage_ObjectPage
{

    public static String SikuliImageFolderPath()
    {
        return "\\SikuliImages\\";
    }

    public static String CongigGroup()
    {

        return "//a[text()='Configuration groups']";
    }

    public static String Manage()
    {

        return "//a[contains(text(),'MANAGE')]";
    }

    //Search filters
    public static String SearchConfigGRoup()
    {
        return "//input[@class='filter-search-input input-medium span12 ng-pristine ng-valid']";
    }

    public static String SearchAsset()
    {
        return "//div[@class='text-filter empty']//input[@class='ng-pristine ng-valid']";
    }

    //check boxes
    public static String CheckAsset()
    {
        return "//input[@type='checkbox'][@row-index='0']";
    }

    //dragging 
    public static String DragAssetToConfigGroup()
    {
        return "//div[@class='drag-handle-grid grabbable ui-draggable fleet-draggable-item']";
    }

    //Editing asset Xpaths
    public static String SearchButton()
    {
        return "//a[@class='btn btn-small']//i[@class='icon-search']";
    }

    public static String ActionButton()
    {
        return "//a[@class='row-action']";
    }

    public static String Edit()
    {
        return "//a[@event='Edit']";
    }

    public static String Compile()
    {
        return "//a[@event='CompileAndUpload']";
    }

    public static String MobileDevices()
    {
        return "//a[text()='Mobile device templates']";
    }

    public static String MobileDevicesType()
    {
        return "//span[text()='Mobile device type:']";
    }

    public static String DropDownSelection(String Text)
    {
        return "//select//option[text()='" + Text + "']";
    }

    public static String ClickEngineHourCheckBox()
    {
        return "//table[@class='table table-condensed table-striped']//strong[text()='Engine hours']//..//input";
    }

    //compile leftSide
    public static String CompileL()
    {
        return "//ul[@class='dropdown-menu pull-right'][1]//span[text()='Compile']";

    }

    public static String EditL()
    {
        return "//ul[@class='dropdown-menu pull-right'][1]//span[text()='Edit']";

    }

    public static String checkAll()
    {
        return "//tbody//tr[2]//input[2]";

    }

    public static String ConfigStatus()
    {
        return "//a[text()='Mobiletemplate1000']//..//../..//div[5]//div[@class='cell alt']";

    }

    public static String SpanWithTxt(String Text)
    {
        return "//span[text()='" + Text + "']";

    }

    public static String MoveButton()
    {
        return "//button[text()='Move']";

    }

    //navigating to assets 
    public static String Assets()
    {
        return "//a[text()='Assets']";

    }

    public static String Save()
    {
        return "//button[text()='Save']";

    }

    public static String Save2()
    {
        return "//div[@class='modal-footer']//button[text()='Save']";

    }

    public static String Cancel()
    {
        return "//div[@class='selection-btn-right pull-right']//button[text()='Cancel']";

    }

    
    public static String IESpImage()
    {
        
        return "SikuliImages//2016-10-24_09h27_47.png";
    }
    //div[@class='modal-footer']//button[text()='Save']
}
