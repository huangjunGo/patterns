package factory;

public class FactoryTest {
	public static void main(String[] args) {
		/*SendFactory factory = new SendFactory();
		Sender sender = factory.produce("mail");
		sender.send();*/
		/*
		 * Sender sender = new MailSend(); sender.send();
		 */
		Provider provider = new MailFactory();
		Sender sender = provider.produce();
		sender.send();
	}
}
