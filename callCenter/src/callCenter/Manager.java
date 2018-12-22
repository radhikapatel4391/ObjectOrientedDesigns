package callCenter;


class Manager extends Employee {
    public Manager(CallHandler callHandler,String name) {
    	super(callHandler,name);
    	rank = Rank.Manager;
    }
}
