import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class spamalot implements ActionListener {
	static final String FAKE_USERNAME = "bobthehacker98764321@hotmail.com";
	static final String FAKE_PASSWORD = "hacker987654321";

	public static void main(String[] args) {
		spamalot X = new spamalot();
		X.spam();

	}

	JButton B = new JButton();
	JButton B2 = new JButton();
	JTextField t = new JTextField(20);

	void spam() {
		JFrame f = new JFrame();
		JPanel p = new JPanel();

		t.setSize(20, 50);
		f.setVisible(true);
		f.add(p);
		f.setSize(500, 70);
		p.add(t);
		p.add(B);
		p.add(B2);
		B.setText("BAD");
		B2.setText("GOOD");
		B.addActionListener(this);
		B2.addActionListener(this);

	}

	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.live.com");
		props.put("mail.smtp.port", "465");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == B) {
			boolean x = sendSpam("leagueofamazing@gmail.com", "Important", ":)");
			if (x == false) {
				t.setBackground(Color.RED);
			}
			if (x == true) {
				t.setBackground(Color.green);
			}
		} else if (e.getSource() == B2) {

			boolean x2 = sendSpam("leagueofamazing@gmail.com", "Good Mail", "Open to see!");
			if (x2 == true) {
				t.setBackground(Color.green);
			}
			if (x2 == false) {
				t.setBackground(Color.red);
			}

		}
	}

}
