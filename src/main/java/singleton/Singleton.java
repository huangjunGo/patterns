package singleton;

public class Singleton {
	private static Singleton singleton = null;
	
	/**
	 * 私有化防止 实例化
	 */
	private Singleton(){
		
	}
	
/*	public static Singleton getSingleton(){
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}*/
	
	/**
	 * 多线程下
	 * @since 1.0 
	 * @return
	 * <br><b>作者： @author huangjun</b>
	 * <br>创建时间：2016年9月2日 下午5:04:51
	 */
	/*public static synchronized Singleton getSingleton(){
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}*/
	
	/**
	 * 多线程下  优化
	 * @since 1.0 
	 * @return
	 * <br><b>作者： @author huangjun</b>
	 * <br>创建时间：2016年9月2日 下午5:04:51
	 */
	public static  Singleton getSingleton(){
		if (singleton == null) {
			synchronized (singleton) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	
	public static void main(String[] args) {
		Long aa = 12l;
		Long bb = 12l;
		System.out.println(aa ==bb);
	}
}
