package factory;

public class MailFactory implements Provider{

	public Sender produce() {
		return new MailSend();
	}

}
