package model;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import static jdk.internal.joptsimple.internal.Messages.message;

public class EmailUtil {

    public static void sendActivationEmail(String toEmail, String activationCode) {
        final String username = "panhquang93@gmail.com"; // Thay thế bằng địa chỉ email của bạn
        final String password = "dnyq dzwx zogm jcun"; // Thay thế bằng mật khẩu của bạn

        // Cấu hình thông tin máy chủ email
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com"); // Thay thế bằng máy chủ SMTP của bạn
        props.put("mail.smtp.port", "587"); // Thay thế bằng cổng SMTP của bạn

        // Tạo phiên làm việc với máy chủ email
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        // tin nhắn
        try {
            // Tạo tin nhắn email
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(username));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            msg.setSubject("Activation Email");
            msg.setText("Your activation code is: " + activationCode);

            // Gửi email
            Transport.send(msg);

            System.out.println("Email sent successfully");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
