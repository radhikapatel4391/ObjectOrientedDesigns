import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
	        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
	        EagerInitializedSingleton instanceTwo = EagerInitializedSingleton.getInstance();	        
	        System.out.println("EagerInitializedSingleton one: "+instanceOne.hashCode());
	        System.out.println("EagerInitializedSingleton two: "+instanceTwo.hashCode());
	        
	        BillPughSingleton BillPughSingletonOne = BillPughSingleton.getInstance();
	        BillPughSingleton BillPughSingletonTwo = BillPughSingleton.getInstance();	        
	        System.out.println("EagerInitializedSingleton one: "+BillPughSingletonOne.hashCode());
	        System.out.println("EagerInitializedSingleton two: "+BillPughSingletonTwo.hashCode());

	        
	        LazyInitializedSingleton LazyInitializedSingletonOne = LazyInitializedSingleton.getInstance();
	        LazyInitializedSingleton LazyInitializedSingletonTwo = LazyInitializedSingleton.getInstance();	        
	        System.out.println("LazyInitializedSingleton one: "+LazyInitializedSingletonOne.hashCode());
	        System.out.println("LazyInitializedSingleton two: "+LazyInitializedSingletonTwo.hashCode());
	        
	        StaticBlockSingleton StaticBlockSingletonOne = StaticBlockSingleton.getInstance();
	        StaticBlockSingleton StaticBlockSingletonTwo = StaticBlockSingleton.getInstance();	        
	        System.out.println("StaticBlockSingleton one: "+StaticBlockSingletonOne.hashCode());
	        System.out.println("StaticBlockSingleton two: "+StaticBlockSingletonTwo.hashCode());
	        
	        ThreadSafeSingleton ThreadSafeSingletonOne = ThreadSafeSingleton.getInstance();
	        ThreadSafeSingleton ThreadSafeSingletonTwo = ThreadSafeSingleton.getInstance();	        
	        System.out.println("ThreadSafeSingleton one: "+ThreadSafeSingletonOne.hashCode());
	        System.out.println("ThreadSafeSingleton two: "+ThreadSafeSingletonTwo.hashCode());
	        
	        SerializedSingleton SerializedSingletonOne = SerializedSingleton.getInstance();
	        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
	        out.writeObject(SerializedSingletonOne);
	        out.close();
	        
	        //deserailize from file to object
	        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
	        SerializedSingleton SerializedSingletonTwo = (SerializedSingleton) in.readObject();
	        in.close();
	        
	        System.out.println("SerializedSingletonOne hashCode="+SerializedSingletonOne.hashCode());
	        System.out.println("SerializedSingletonTwo  hashCode="+SerializedSingletonTwo.hashCode());
	}

}
