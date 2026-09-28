//package utils;
//
//import java.util.Properties;
//import javax.mail.Authenticator;
//import javax.mail.BodyPart;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Multipart;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
//public class EmailGen {
//
//	    public static void main(String[] args) {
//	        Properties props = new Properties();
//	        props.put("mail.smtp.auth", "true");
//	        props.put("mail.smtp.starttls.enable", "true");
//	        props.put("mail.smtp.host", "smtp.office365.com");
//	        props.put("mail.smtp.port", "587");
//
//	        Session session = Session.getInstance(props, new Authenticator() {
//	            protected PasswordAuthentication getPasswordAuthentication() {
//	                return new PasswordAuthentication("your-email@example.com", "your-password");
//	            }
//	        });
//
//	        try {
//	            MimeMessage message = new MimeMessage(session);
//	            message.setFrom(new InternetAddress("your-email@example.com"));
//	            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("recipient@example.com"));
//	            message.setSubject("Test Case Execution Report");
//	            message.setText("The test case execution was successful.");
//
//	            MimeBodyPart attachmentPart = new MimeBodyPart();
//	            attachmentPart.attachFile("path/to/your/report/file");
//
//	            Multipart multipart = new MimeMultipart();
//	            multipart.addBodyPart(attachmentPart);
//
//	            message.setContent(multipart);
//
//	            Transport.send(message);
//	            System.out.println("Email sent successfully.");
//	        } catch (MessagingException e) {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//
//}
