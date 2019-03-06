/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Utilities;

import com.sun.mail.imap.IMAPFolder;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Flags;
import javax.mail.Flags.Flag;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.FlagTerm;


/**
 *
 * @author Omega
 */
public class EmailUtility 
{
    public Boolean validateEmail(String sender, String subject, String message)
    {
        Folder folder;
        Properties props;
        Session session;
        Store store;
        int c;
        
        try
        {
            props = System.getProperties();
            props.setProperty("mail.store.protocol", "imaps");
            session = Session.getDefaultInstance(props, null);
            store = session.getStore("imaps");
            store.connect("imap.gmail.com", "automationdvt@gmail.com","Automation123");
            
            folder = (IMAPFolder) store.getFolder("INBOX");
            folder.open(Folder.READ_WRITE);
        
            System.out.println("Total Message:" + folder.getMessageCount());
            System.out.println("Unread Message:" + folder.getUnreadMessageCount());

            Message[] messages = null;
//            boolean isMailFound = false;
            Message mailStream= null;

            //Search for mail with specified subject
            for (int i = 0; i <= 5; i++)
            {
//                messages = folder.search(new SubjectTerm(subject),folder.getMessages());
                messages = folder.search(new FlagTerm(new Flags(Flag.SEEN), false),folder.getMessages());
                //Wait for 10 seconds
                if (messages.length == 0) 
                {           
                    Thread.sleep(10000);
                }
            }

            //Search for unread mail
            c = 0;
            
            for (Message mail : messages)
            {
                if (mail.getFrom()[0].toString().equalsIgnoreCase(sender) && mail.getSubject().equalsIgnoreCase(subject))
                {
                    mail.setFlag(Flags.Flag.SEEN, true);
                    
                    if (mail.getContent().toString().contains(message))
                    {
                        c++;
                    }
                }
            }
            
            messages = folder.getMessages();
            
            for (Message mail : messages)
            {
                mail.setFlag(Flags.Flag.SEEN, true);
            }
        }
        
        catch(Exception e)
        {
            System.err.println("[Error]Failed to validate the email - " + e.getMessage());
            return false;
        }        
        
        if (c > 0)
        {
            System.out.println("[Info]Successfully found " + c + " email(s) with message : '" + message + "'");
            return true;
        }
        else               
        {
            System.err.println("[Error]Could not find new mail from '" + sender + "'");
            return false;
        }
    }
    
    public String retrieveEmail(String sender, String subject)
    {
        Folder folder;
        Properties props;
        Session session;
        Store store;
        int c;
        
        try
        {
            props = System.getProperties();
            props.setProperty("mail.store.protocol", "imaps");
            session = Session.getDefaultInstance(props, null);
            store = session.getStore("imaps");
            store.connect("imap.gmail.com", "automationdvt@gmail.com","Automation123");
            
            folder = (IMAPFolder) store.getFolder("INBOX");
            folder.open(Folder.READ_WRITE);
        
            System.out.println("Total Message:" + folder.getMessageCount());
            System.out.println("Unread Message:" + folder.getUnreadMessageCount());

            Message[] messages = null;
//            boolean isMailFound = false;
            Message mailStream= null;

            //Search for mail with specified subject
            for (int i = 0; i <= 5; i++)
            {
//                messages = folder.search(new SubjectTerm(subject),folder.getMessages());
                messages = folder.search(new FlagTerm(new Flags(Flag.SEEN), false),folder.getMessages());
                //Wait for 10 seconds
                if (messages.length == 0) 
                {           
                    Thread.sleep(10000);
                }
            }

            //Search for unread mail
            c = 0;
            
            for (Message mail : messages)
            {
                if (mail.getFrom()[0].toString().equalsIgnoreCase(sender) && mail.getSubject().equalsIgnoreCase(subject))
                {
                    mail.setFlag(Flags.Flag.SEEN, true);

                    if (mail.getContent().toString() != null)
                    {
                        String message = getText(mail);
                        return message;
                    }
                }
            }
            
            messages = folder.getMessages();
            
            for (Message mail : messages)
            {
                mail.setFlag(Flags.Flag.SEEN, true);
            }
        }
        
        catch(Exception e)
        {
            System.err.println("[Error]Failed to validate the email - " + e.getMessage());
            return "";
        }        
        
        if (c > 0)
        {
            System.out.println("[Info]Successfully found " + c + " email(s)");
            return "";
        }
        else               
        {
            System.err.println("[Error]Could not find new mail from '" + sender + "'");
            return "";
        }
    }
    
    private String getText(Part p) throws
               MessagingException, IOException {
       if (p.isMimeType("text/*")) {
           String s = (String)p.getContent();
           boolean textIsHtml = p.isMimeType("text/html");
           return s;
       }
 
       if (p.isMimeType("multipart/alternative")) {
           // prefer html text over plain text
           Multipart mp = (Multipart)p.getContent();
           String text = null;
           for (int i = 0; i < mp.getCount(); i++) {
               Part bp = mp.getBodyPart(i);
               if (bp.isMimeType("text/plain")) {
                   if (text == null)
                       text = getText(bp);
                   continue;
               } else if (bp.isMimeType("text/html")) {
                   String s = getText(bp);
                   if (s != null)
                       return s;
               } else {
                   return getText(bp);
               }
           }
           return text;
       } else if (p.isMimeType("multipart/*")) {
           Multipart mp = (Multipart)p.getContent();
           for (int i = 0; i < mp.getCount(); i++) {
               String s = getText(mp.getBodyPart(i));
               if (s != null)
                   return s;
           }
       }
 
       return null;
   }
}
