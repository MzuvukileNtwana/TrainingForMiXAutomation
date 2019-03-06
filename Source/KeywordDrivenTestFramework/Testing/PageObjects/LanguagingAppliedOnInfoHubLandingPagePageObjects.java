/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

/**
 *
 * @author apeter
 */
public class LanguagingAppliedOnInfoHubLandingPagePageObjects {
    public static String infoHubHeadingXpath(){
        return "//div[@class='page-header']/h5";
    }
    
    public static String refreshOptionXpath(){
        return "//a[@ng-click='refresh()']";
    }
    
    public static String filterXpath(){
        return "//div[@class='input-reset-wrapper']/input";
    }
    
    public static String settingsXpath(){
        return "//a[@ng-click='editStream()']";
    }
    
    public static String undockXpath(){
        return "//a[@ng-click='undock()']";
    }
    
    public static String actionsToolTipXpath(){
        return "//*[local-name()]/span[text()='Acções']";
    }
    
    public static String tooltipForActionXpath(){
        return "//span[text()='AcÃ§Ãµes']";
    }
    
    public static String actionsButtonXpath(){
        return "//a[@ng-hide=\"listMode.current == 'details'\"]/i";
    }
    
    public static String addStreamToolTipXpath(){
       return "//*[local-name()]/div[contains(@class,\"ng-scope tooltip left\")][1]";
    }
    
    public static String tooltipForAddStreamXpath(){
        return "//span[text()='Adicionar fluxo']";
    }
    
    public static String addButtonXpath(){
        return "//div[@class='selection-btn-right pull-right']/a/i";
    }
    
    public static String removeHeadingXpath(){
        return "//div[@class='alert alert-warning']/h5/span";
    }
    
    public static String removeQuestionXpath(){
        return "//div[@class='well no-margin']/p";
    }
    
    public static String cancelButtonOnWarningXpath(){
        return "//button[@class='btn ng-scope ng-binding btn-wide']";
    }
    
    public static String cancelButtonAfterEditingXpath(){
        return "//button[@class='btn-wide btn-small btn ng-scope ng-binding']";
    }
    
    public static String changesNotSavedXpath(){
        return "//div[@class='alert alert-warning']/h5";
    }
    
    public static String changesNotSavedQuestionXpath(){
        return "//div[@ng-bind-html-unsafe='$modal.message | translate:$modal.data']";
    }
    
    public static String noButtonXpath(){
        return "//button[@class='btn btn-wide ng-binding']";
    }
    
    public static String yesButtonXpath(){
        return "//button[@class='btn btn-wide btn-success ng-binding']";
    }
    
    public static String loadingItemsXpath(){
        return "//div[@ng-bind-html-unsafe=\"'Loading items'| translate\"]";
    }
    
    public static String jobStatusXpath(){
        return "//div[@ng-show='form.jobsEnabled']/label/input";
    }
    
    public static String textFieldXpath(){
        return "//input[@name='streamName']";
    }
}
