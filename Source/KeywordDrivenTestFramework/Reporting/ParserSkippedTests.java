package KeywordDrivenTestFramework.Reporting;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author RauvounW
 */
public class ParserSkippedTests {

    static Date d = new Date();
    public static void main(String[]args) throws IOException
    {
        Parser p=new Parser();
        p.TXTReader(args[0],args[1]);
    }
    /*    
    public static void XMLReader(String location) throws FileNotFoundException, IOException {
        BufferedReader b = new BufferedReader(new FileReader(location));
        BufferedWriter w = new BufferedWriter(new FileWriter("C://Users//RauvounW//Desktop//new.xml"));
        String line = "", test = "", name = "", l = "";
        int end, c = 0;
        
        while ((line = b.readLine()) != null) {
            
            if (line.startsWith("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>")) {
                c = 0;
            } else if (line.startsWith("  </properties>")) {
                w.write(line);
                w.newLine();
                c = 1;
            }
            if (c == 0) {
                w.write(line);
                w.newLine();
            }
            
            if (line.startsWith("Executing test")) {                
                test = line.substring(17);
                end = test.indexOf("|");
                name = test.substring(0, end);
                l = "<testcase classname=\"TestSuites.JenkinsSuite\" name=\"" + name.trim() + "\" time=\"insert time\">\n"
                        + "    <failure type=\"junit.framework.AssertionFailedError\">junit.framework.AssertionFailedError\n"
                        + "    at TestSuites.JenkinsSuite.executeJenkinsSuite(Unknown Source)\n"
                        + "    </failure>\n"
                        + "</testcase>";
                w.write(l);
                w.newLine();
            }
            
        }
        w.write("</testsuite>");
        w.close();
    }*/
    
    public static void TXTReader(String location,String to) throws FileNotFoundException, IOException {
        BufferedReader b = new BufferedReader(new FileReader(location));
        BufferedWriter w = new BufferedWriter(new FileWriter(to+"\\Report2.xml"));
        String line = "";
        int testnum = 0;
        
        String header = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"
                + "<testsuite errors=\"0\" failures=\"1\" hostname=\"DVTAUTOMATION\" name=\"TestSuites.JenkinsSuite\" skipped=\"0\" tests=\"1\" time=\""+d+"\" timestamp=\"" + d + "\">\n"
                + "  <properties>\n"
                + "    <property name=\"java.vendor\" value=\"Oracle Corporation\" />\n"
                + "    <property name=\"home\" value=\".\" />\n"
                + "    <property name=\"sun.java.launcher\" value=\"SUN_STANDARD\" />\n"
                + "    <property name=\"sun.management.compiler\" value=\"HotSpot 64-Bit Tiered Compilers\" />\n"
                + "    <property name=\"os.name\" value=\"Windows 10\" />\n"
                + "    <property name=\"sun.boot.class.path\" value=\"C:\\Program Files\\Java\\jdk1.8.0_91\\jre\\lib\\resources.jar;C:\\Program Files\\Java\\jdk1.8.0_91\\jre\\lib\\rt.jar;C:\\Program Files\\Java\\jdk1.8.0_91\\jre\\lib\\sunrsasign.jar;C:\\Program Files\\Java\\jdk1.8.0_91\\jre\\lib\\jsse.jar;C:\\Program Files\\Java\\jdk1.8.0_91\\jre\\lib\\jce.jar;C:\\Program Files\\Java\\jdk1.8.0_91\\jre\\lib\\charsets.jar;C:\\Program Files\\Java\\jdk1.8.0_91\\jre\\lib\\jfr.jar;C:\\Program Files\\Java\\jdk1.8.0_91\\jre\\classes\" />\n"
                + "    <property name=\"sun.desktop\" value=\"windows\" />\n"
                + "    <property name=\"java.vm.specification.vendor\" value=\"Oracle Corporation\" />\n"
                + "    <property name=\"ant.home\" value=\"C:\\ANT\" />\n"
                + "    <property name=\"java.runtime.version\" value=\"1.8.0_91-b14\" />\n"
                + "    <property name=\"dest.dir\" value=\"build\" />\n"
                + "    <property name=\"user.name\" value=\"Admin\" />\n"
                + "    <property name=\"Environment\" value=\"Integration\" />\n"
                + "    <property name=\"user.language\" value=\"en\" />\n"
                + "    <property name=\"sun.boot.library.path\" value=\"C:\\Program Files\\Java\\jdk1.8.0_91\\jre\\bin\" />\n"
                + "    <property name=\"ant.project.default-target\" value=\"test\" />\n"
                + "    <property name=\"ant.project.name\" value=\"KissatExecuteTest\" />\n"
                + "    <property name=\"java.version\" value=\"1.8.0_91\" />\n"
                + "    <property name=\"user.timezone\" value=\"\" />\n"
                + "    <property name=\"sun.arch.data.model\" value=\"64\" />\n"
                + "    <property name=\"java.endorsed.dirs\" value=\"C:\\Program Files\\Java\\jdk1.8.0_91\\jre\\lib\\endorsed\" />\n"
                + "    <property name=\"sun.cpu.isalist\" value=\"amd64\" />\n"
                + "    <property name=\"sun.jnu.encoding\" value=\"Cp1252\" />\n"
                + "    <property name=\"file.encoding.pkg\" value=\"sun.io\" />\n"
                + "    <property name=\"file.separator\" value=\"\\\" />\n"
                + "    <property name=\"java.specification.name\" value=\"Java Platform API Specification\" />\n"
                + "    <property name=\"java.class.version\" value=\"52.0\" />\n"
                + "    <property name=\"user.country\" value=\"US\" />\n"
                + "    <property name=\"java.home\" value=\"C:\\Program Files\\Java\\jdk1.8.0_91\\jre\" />\n"
                + "    <property name=\"java.vm.info\" value=\"mixed mode\" />\n"
                + "    <property name=\"ant.file\" value=\"D:\\LocalSlave\\workspace\\RegressionPack\\ANTBUILD.xml\" />\n"
                + "    <property name=\"os.version\" value=\"10.0\" />\n"
                + "    <property name=\"path.separator\" value=\";\" />\n"
                + "    <property name=\"java.vm.version\" value=\"25.91-b14\" />\n"
                + "    <property name=\"user.variant\" value=\"\" />\n"
                + "    <property name=\"ant.library.dir\" value=\"C:\\ANT\\lib\" />\n"
                + "    <property name=\"ant.file.type.KissatExecuteTest\" value=\"file\" />\n"
                + "    <property name=\"ant.file.KissatExecuteTest\" value=\"D:\\LocalSlave\\workspace\\RegressionPack\\ANTBUILD.xml\" />\n"
                + "    <property name=\"java.awt.printerjob\" value=\"sun.awt.windows.WPrinterJob\" />\n"
                + "    <property name=\"sun.io.unicode.encoding\" value=\"UnicodeLittle\" />\n"
                + "    <property name=\"awt.toolkit\" value=\"sun.awt.windows.WToolkit\" />\n"
                + "    <property name=\"user.script\" value=\"\" />\n"
                + "    <property name=\"user.home\" value=\"C:\\Users\\Admin\" />\n"
                + "    <property name=\"java.specification.vendor\" value=\"Oracle Corporation\" />\n"
                + "    <property name=\"java.library.path\" value=\"C:\\Program Files\\Java\\jdk1.8.0_91\\bin;C:\\WINDOWS\\Sun\\Java\\bin;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\Program Files\\Java\\jdk1.8.0_91/bin;C:\\Program Files\\Java\\jdk1.8.0_91/bin;C:\\Program Files\\Java\\jre1.8.0_91\\bin;C:\\ProgramData\\Oracle\\Java\\javapath;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\WINDOWS\\System32\\Wbem;C:\\WINDOWS\\System32\\WindowsPowerShell\\v1.0\\;C:\\Program Files\\Git\\cmd;C:\\SikuliX\\;C:\\SikuliX\\libs;C:\\SikuliX\\libs;&quot;C:\\Program Files\\Java\\jre1.8.0_91\\bin&quot;;.\" />\n"
                + "    <property name=\"java.vendor.url\" value=\"http://java.oracle.com/\" />\n"
                + "    <property name=\"Browser\" value=\"Chrome\" />\n"
                + "    <property name=\"java.vm.vendor\" value=\"Oracle Corporation\" />\n"
                + "    <property name=\"java.runtime.name\" value=\"Java(TM) SE Runtime Environment\" />\n"
                + "    <property name=\"sun.java.command\" value=\"org.apache.tools.ant.launch.Launcher -file ANTBUILD.xml -DTestPack SmokeTests\\NavigationalSmokeTest.xlsx -DEnvironment Integration -DBrowser Chrome -DmyTest TestSuites.JenkinsSuite\" />\n"
                + "    <property name=\"java.class.path\" value=\"C:\\ANT\\lib\\ant-launcher.jar;C:\\ANT\\lib\\ant-antlr.jar;C:\\ANT\\lib\\ant-apache-bcel.jar;C:\\ANT\\lib\\ant-apache-bsf.jar;C:\\ANT\\lib\\ant-apache-log4j.jar;C:\\ANT\\lib\\ant-apache-oro.jar;C:\\ANT\\lib\\ant-apache-regexp.jar;C:\\ANT\\lib\\ant-apache-resolver.jar;C:\\ANT\\lib\\ant-apache-xalan2.jar;C:\\ANT\\lib\\ant-commons-logging.jar;C:\\ANT\\lib\\ant-commons-net.jar;C:\\ANT\\lib\\ant-jai.jar;C:\\ANT\\lib\\ant-javamail.jar;C:\\ANT\\lib\\ant-jdepend.jar;C:\\ANT\\lib\\ant-jmf.jar;C:\\ANT\\lib\\ant-jsch.jar;C:\\ANT\\lib\\ant-junit.jar;C:\\ANT\\lib\\ant-junit4.jar;C:\\ANT\\lib\\ant-launcher.jar;C:\\ANT\\lib\\ant-netrexx.jar;C:\\ANT\\lib\\ant-swing.jar;C:\\ANT\\lib\\ant-testutil.jar;C:\\ANT\\lib\\ant.jar;C:\\Program Files\\Java\\jdk1.8.0_91\\lib\\tools.jar\" />\n"
                + "    <property name=\"ant.version\" value=\"Apache Ant(TM) version 1.9.7 compiled on April 9 2016\" />\n"
                + "    <property name=\"TestPack\" value=\"SmokeTests\\NavigationalSmokeTest.xlsx\" />\n"
                + "    <property name=\"java.vm.specification.name\" value=\"Java Virtual Machine Specification\" />\n"
                + "    <property name=\"ant.file.type\" value=\"file\" />\n"
                + "    <property name=\"java.vm.specification.version\" value=\"1.8\" />\n"
                + "    <property name=\"sun.cpu.endian\" value=\"little\" />\n"
                + "    <property name=\"sun.os.patch.level\" value=\"\" />\n"
                + "    <property name=\"java.io.tmpdir\" value=\"C:\\Users\\Admin\\AppData\\Local\\Temp\\\" />\n"
                + "    <property name=\"dest.dir.lib\" value=\"build/lib\" />\n"
                + "    <property name=\"java.vendor.url.bug\" value=\"http://bugreport.sun.com/bugreport/\" />\n"
                + "    <property name=\"dest.dir.classes\" value=\"build/classes\" />\n"
                + "    <property name=\"os.arch\" value=\"amd64\" />\n"
                + "    <property name=\"java.awt.graphicsenv\" value=\"sun.awt.Win32GraphicsEnvironment\" />\n"
                + "    <property name=\"java.ext.dirs\" value=\"C:\\Program Files\\Java\\jdk1.8.0_91\\jre\\lib\\ext;C:\\WINDOWS\\Sun\\Java\\lib\\ext\" />\n"
                + "    <property name=\"user.dir\" value=\"D:\\LocalSlave\\workspace\\RegressionPack\" />\n"
                + "    <property name=\"line.separator\" value=\"&#xd;&#xa;\" />\n"
                + "    <property name=\"java.vm.name\" value=\"Java HotSpot(TM) 64-Bit Server VM\" />\n"
                + "    <property name=\"basedir\" value=\"D:\\LocalSlave\\workspace\\RegressionPack\" />\n"
                + "    <property name=\"ant.java.version\" value=\"1.8\" />\n"
                + "    <property name=\"ant.core.lib\" value=\"C:\\ANT\\lib\\ant.jar\" />\n"
                + "    <property name=\"file.encoding\" value=\"Cp1252\" />\n"
                + "    <property name=\"myTest\" value=\"TestSuites.JenkinsSuite\" />\n"
                + "    <property name=\"java.specification.version\" value=\"1.8\" />\n"
                + "    <property name=\"ant.project.invoked-targets\" value=\"test\" />\n"
                + "  </properties>";
        
        w.write(header);
        while ((line = b.readLine()) != null) {
            
            if (line.contains("[KEYS]")) {
                
                testnum++;
                
                w.write(getResult(testnum, location));
                w.newLine();
            }
            
        }
        
        w.write("</testsuite>");
        w.close();
    }
    
    private static String getResult(int t, String loc) throws FileNotFoundException, IOException {
        BufferedReader b = new BufferedReader(new FileReader(loc));
        String l = "", mess = "", name = "", err = "", time = "";        
        
        int count = 0;
        while ((l = b.readLine()) != null && count <= t + 1) {
            
            if (l.contains("[KEYS]")) {
                count++;
                
            }
            if (count == t) {
                if (l.contains("[KEYS]")) {
                    name = l.substring(l.lastIndexOf("#") + 1);
                }
                
                if (l.contains("[FAIL]")) {
                    mess = "fail";
                    time = l.substring(10, 24);
                    err = l;
                    break;
                }
                if (l.contains("[PASS]")) {
                    mess = "Pass";
                    time = l.substring(10, 24);
                    break;
                    
                }
                if (l.contains("[SKIP]")) {
                    mess = "Skip";
                    time = l.substring(10, 24);
                    break;
                    
                }
                if (l.contains("                               ")) {
                    time = l.substring(10, 24);
                }                
                
            }
            
        }
        
        if (mess.equals("Pass")) {
            
            return "<testcase classname=\"TestSuites.JenkinsSuite\" name=\"" + name.trim() + "\" time=\"" + time.trim() + "\">\n"
                    + "</testcase>";
        }
        if (mess.equals("fail")) {
            return "<testcase classname=\"TestSuites.JenkinsSuite\" name=\"" + name.trim() + "\" time=\"" + time.trim() + "\">\n"
                    + "    <failure type=\"junit.framework.AssertionFailedError\">" + err.trim()
                    + "    </failure>\n"
                    + "</testcase>";
        } 
        if (mess.equals("Skip")) {
            return "";
        }
        else {
            return "<testcase classname=\"TestSuites.JenkinsSuite\" name=\"" + name.trim() + "\" time=\"" + time.trim() + "\">\n"
                    + "    <failure type=\"junit.framework.AssertionFailedError\">Unable to complete test"
                    + "    </failure>\n"
                    + "</testcase>";
        }
        
    }
    
}
