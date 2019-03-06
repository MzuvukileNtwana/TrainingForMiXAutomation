/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import static KeywordDrivenTestFramework.Core.BaseClass.currentEnvironment;

/**
 *
 * @author lmgulwa
 */
public class LanguageAppliedJobStatusStreamPageObject
{

    //  <editor-fold defaultstate="collapsed" desc="Login Page">
    public static String MixTelematicsURL()
    {
        return currentEnvironment.PageUrl;
    }

    public static String selectLanguageXPath()
    {
        return "//select[@ng-model='selectedLanguage']//option";
    }

    public static String selectLanguageFirefoxXPath()
    {
        return "//option[text()='Igpay Atinlay']";
    }
    
    public static String languageOptionXpath()
    {
        return "//select[@ng-model = 'selectedLanguage']//option[@value = 'PigLatin']";
    }

    public static String chosenLanguageOptionXPath(String language)
    {
        return "//select[@ng-model='selectedLanguage']/option[text()='" + language + "']";
    }

    public static String usernameXPath(String usernameLabelText)
    {
        return "//label/strong[text()='" + usernameLabelText + "']//.././../div/input";
    }

    public static String passwordXPath(String passwordLabelText)
    {
        return "//label/strong[text()='" + passwordLabelText + "']/../../div/input";
    }
    

    public static String loginButtonXPath(String loginButtonText)
    {
        return "//button[text()='" + loginButtonText + "']";
    }
    

    public static String welcomeXPath()
    {
        return "//div/strong";
    }

    //  </editor-fold>
    //  <editor-fold defaultstate="collapsed" desc="Navigate to Info Hub">
    public static String monitorXPath()
    {
        return "//a[text()='Onitormay ']";
    }

    public static String streamsXPath()
    {
        return "//a[text()='Eamsstray']";
    }

    public static String infoHubPageHeaderXPath()
    {
        return "//h5[text()='Infoway Ubhay']";
    }

    public static String refreshLinkXPath()
    {
        return "//a[text()='Efreshray']";
    }

    //  </editor-fold>
    //  <editor-fold defaultstate="collapsed" desc="Add Stream">
    public static String addStreamButtonXPath()
    {
//        return "//a[@ng-click='addStream()']";
//        return "//i[contains(@class, 'icon-plus')]/../../a";
        return "//div/div/a[@ng-click='addStream()']";
    }

    public static String textNameXPath()
    {
        return "//label/span[text()='Amenay']/../../input";
    }

    public static String jobStatusCheckBoxXPath()
    {
        return "//span[text()='Objay atusesstay']/../input";
    }

    public static String nextButtonXPath()
    {
        return "//button[text()='Extnay']";
    }

    public static String openFirstAssetTreeXPath()
    {
        return "//li[@class='ng-scope first-item']/span[contains(@class, 'daredevel-tree-anchor')]";
    }

    public static String openSecondAssetTreeXPath()
    {
        return "//div[contains(@class, 'tree-sub-items')]/ul/li[1]/span";
    }

    public static String selectRelevantAssetXPath()
    {
        return "//span[text()='DVT Live Tracking Unit']";
    }

    public static String buttonSaveXPath()
    {
        return "//button[text()='Avesay']";
    }

    public static String readStreamNameXPath(String name)
    {
        return "//span[text()='" + name + "']";
    }

    //  </editor-fold>
    //  <editor-fold defaultstate="collapsed" desc="Validate Stream">
    public static String hoursStringXPath()
    {
        return "//span[contains(text(), 'horas')]";
    }

    public static String minutesStringXPath()
    {
        return "//span[contains(text(), 'minutos')]";
    }

    public static String dayStringXPath(String streamName)
    {
        return "//h5/span[text()='" + streamName + "']/../../../..//table//tr//td//span[contains(text(), 'aysday')]";
    }

    public static String jobStringXPath(String streamName)
    {
        return "//h5/span[text()='" + streamName + "']//..//../..//..//table//span[text()='Objay']";
    }

    public static String receivedStringXPath()
    {
        return "//span[text()='Recibido']";
    }

    public static String whenToStringXPath(String streamName)
    {
        return "//h5/span[text()='" + streamName + "']/../../../..//table//strong[text()='Enwhay']";
    }

    public static String whereStringXPath()
    {
        return "//strong[text()='Donde']";
    }

    public static String subjectStringXPath(String streamName)
    {
        return "//h5/span[text()='" + streamName + "']/../../../..//table//strong[text()='Ubjectsay']";
    }

    public static String detailsOptionStringXPath(String streamName)
    {
        return "//h5/span[text()='" + streamName + "']/../../../..//table//a[text()='Etailsday']";
    }

    //  </editor-fold>
    //  <editor-fold defaultstate="collapsed" desc="Process Stream">
    public static String backButtonStringXPath(String streamName)
    {
        return "//h5/span[text()='" + streamName + "']/../../../..//span[text()='Ackbay otay eamstray']/..";
    }

    public static String statusChangedToStringXPath(String streamName)
    {
        return "//h5/span[text()='" + streamName + "']/../../../..//h6[text()='Atusstay ashay angedchay otay']";
    }

    public static String loadingMoreButtonStringXPath(String streamName)
    {
        return "//h5/span[text()='" + streamName + "']/../../../..//div[text()='Oadinglay oremay etailsday']";

    }

    public static String atStringXPath(String streamName)
    {
        return "//h5/span[text()='" + streamName + "']/../../../..//strong[text()=' atway ']";
    }

    public static String pendingStringXPath(String streamName)
    {
        return "//h5/span[text()='" + streamName + "']/../../../..//p[contains(@class, 'no-margins')][contains(text(), 'Endingpay')]";
    }

    public static String queuedStringXPath(String streamName)
    {
        return "//h5/span[text()='" + streamName + "']/../../../..//p[contains(@class, 'no-margins')][contains(text(), 'Ueuedqay')]";
    }

    public static String sentStringXPath(String streamName)
    {
        return "//h5/span[text()='" + streamName + "']/../../../..//p[contains(@class, 'no-margins')][contains(text(), 'Entsay')]";
    }

    public static String newStringXPath(String streamName)
    {
        return "//h5/span[text()='" + streamName + "']/../../../..//p[contains(@class, 'no-margins')][contains(text(), 'Ewnay')]";
    }

    public static String completedtringXPath()
    {
        return "//strong[text()='Completado']";
    }

    public static String hideButtonXPath(String streamName)
    {
        return "//h5/span[text()='" + streamName + "']/../../../..//a[@ng-click='hide()']//i";
    }

    public static String tooltipHideStringXPath()
    {
        return "//body//div[@class='ng-scope tooltip left in']//span/..";

    }

    public static String assetCurrentPositionButtonXPath(String streamName)
    {
        return "//h5/span[text()='" + streamName + "']/../../../..//a[@ng-click='viewAsset()']//i";
    }

    public static String tooltipViewCurrentPositionStringXPath()
    {
        return "//body//div[@class=\"ng-scope tooltip left in\"]//span";
    }

    public static String sendMessageButtonXPath(String streamName)
    {
        return "//h5/span[text()='" + streamName + "']/../../../..//a[@ng-click='message()']//i";

    }

    public static String tooltipSendMessageStringXPath()
    {
        return "//body//div[@class=\"ng-scope tooltip left in\"]//span";
    }

    public static String createNewMessageStringXPath()
    {
        return "//div[@class='page-header']/h5[text()='Eatecray ewnay essagemay']";
    }

    public static String toStringXPath()
    {
        return "//label[text()='Otay']";
    }

    public static String messageExpiryStringXPath()
    {
        return "//span[contains(text(), 'Essagemay expiresway onway')]";
    }

    public static String predefinedStringXPath()
    {
        return "//label[text()='Electsay epray-efinedday essagemay']";
    }

    public static String messageSubjectStringXPath()
    {
        return "//label[text()='Ubjectsay']";
    }

    public static String messageStringXPath()
    {
        return "//label[text()='Essagemay']";
    }

    public static String selectAssetStringXPath()
    {
        return "//button[text()='Electsay assetsway']";
    }

    public static String yesStringXPath()
    {
        return "//span[text()='Yes']";
    }

    public static String noStringXPath()
    {
        return "//span[text()='No']";
    }

    //  </editor-fold>
    //  <editor-fold defaultstate="collapsed" desc="Validate Asset's Current Position">
    public static String startActiveTrackingStringXPath()
    {
        //return "//a[text()='Artstay activeway ackingtray']";
        return "//a[@ng-click=\"startActiveTracking(0)\"]";
    }

    public static String startSatelliteTrackingStringXPath()
    {
        //return "//a[text()='Artstay atellitesay ackingtray']";
        return "//a[@ng-click=\"startActiveTracking(1)\"]";
    }

    public static String frequencyDurationSecStringXPath()
    {
        return "//span[contains(text(), 'Equencyfray')]";
    }

    //  </editor-fold>
    //  <editor-fold defaultstate="collapsed" desc="Remove Stream">
    public static String toggleDownButtonXPath()
    {
        return "//i[@class='icon-chevron-down']/..";
    }

    public static String removeStreamButtonXPath()
    {
        return "//span[text()='Emoveray']/..";
    }

    public static String confirmRemoveStreamButtonXPath()
    {
        return "//button[text()='Emoveray']";
    }

    public static String streamsImgRelativeXpath()
    {
        return "//img[@src='img/feed-draghandle.png']";
    }

    //  </editor-fold>
}
