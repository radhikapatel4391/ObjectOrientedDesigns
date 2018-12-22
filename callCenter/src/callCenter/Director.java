package callCenter;


class Director extends Employee {
    public Director(CallHandler callHandler,String name) {
    	super(callHandler,name);
    	rank = Rank.Director;
    }
}
