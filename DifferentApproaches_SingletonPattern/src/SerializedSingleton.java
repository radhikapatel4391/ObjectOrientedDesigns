import java.io.Serializable;

public class SerializedSingleton implements Serializable {
	private static final long serialVersionUID = -7604766932017737115L;

	
	private SerializedSingleton() {}
		
	private static class helperSinglton{
		private static final SerializedSingleton instance = new SerializedSingleton();
	}
	
	public static SerializedSingleton getInstance() {
		return helperSinglton.instance;
	}
	protected Object readResolve() {
	    return getInstance();
	}
}
