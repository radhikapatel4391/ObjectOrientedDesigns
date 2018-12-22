package callCenter;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CallHandler ch = new CallHandler();
		Caller c1 = new Caller(101, "caller1");
		Caller c2 = new Caller(101, "caller2");
		Caller c3 = new Caller(101, "caller3");
		Caller c4 = new Caller(101, "caller4");
		Caller c5 = new Caller(101, "caller5");
		Caller c6 = new Caller(101, "caller6");
		Call s1 = new Call(c1);
		ch.dispatchCall(s1);
		ch.endCall(s1);
		Call s2 = new Call(c2);
		ch.dispatchCall(s2);
		Call s3 = new Call(c3);
		ch.dispatchCall(s3);
		Call s4 = new Call(c4);
		ch.dispatchCall(s4);
		Call s5 = new Call(c5);
		ch.dispatchCall(s5);
		Call s6 = new Call(c1);
		ch.dispatchCall(s6);
		
		
		ch.endCall(s2);
		
		Call s7 = new Call(c1);
		s7.incrementRank();
		ch.dispatchCall(s7);
		
		ch.endCall(s3);
		ch.endCall(s4);
		
		
		ch.endCall(s5);
		ch.endCall(s6);
		
		
		
		
	}

}
