package factory;

public class SendFactory {
	
	/**
	 * 普通工厂
	 * @since 1.0 
	 * @param type
	 * @return
	 * <br><b>作者： @author huangjun</b>
	 * <br>创建时间：2016年9月2日 下午4:43:17
	 */
	public Sender produce(String type){
		if ("mail".equals(type)) {
			return new MailSend();
		}else if ("sms".equals(type)) {
			return new MobileSend();
		}
		return null;
	}
	
	/**
	 * 多个工厂模式
	 * @since 1.0 
	 * @return
	 * <br><b>作者： @author huangjun</b>
	 * <br>创建时间：2016年9月2日 下午4:43:41
	 */
	public Sender producrMail(){
		return new MailSend();
	}
	
	public Sender produceSms(){
		return new MobileSend();
	}
	
	/**
	 * 静态工厂
	 * @since 1.0 
	 * @return
	 * <br><b>作者： @author huangjun</b>
	 * <br>创建时间：2016年9月2日 下午4:44:45
	 */
	public static Sender producrMailStatic(){
		return new MailSend();
	}
	
	public static Sender produceSmsStatic(){
		return new MobileSend();
	}
	
	
	
}
