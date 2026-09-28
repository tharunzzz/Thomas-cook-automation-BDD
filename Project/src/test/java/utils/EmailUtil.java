package utils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


import javax.mail.Session;
public class EmailUtil {


	    public static void sendEmail(Session session, String fromEmail, String toEmail, String subject, String messageBody) {
	        try {
	            SimpleEmail email = new SimpleEmail();
	            email.setHostName("smtp.gmail.com");
	            email.setSmtpPort(465);
	            email.setAuthenticator(new DefaultAuthenticator("tharunsrinivas18@gmail.com", "Pra@vek997"));
	            email.setSSLOnConnect(true);
	            email.setFrom(fromEmail);
	            email.addTo(toEmail);
	            email.setSubject(subject);
	            email.setMsg(messageBody);

	            email.send();
	            System.out.println("Email sent successfully.");
	        } catch (EmailException e) {
	            e.printStackTrace();
	        }
	    }
	}


