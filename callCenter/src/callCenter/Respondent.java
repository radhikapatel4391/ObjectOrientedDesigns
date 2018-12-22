package callCenter;


class Respondent extends Employee {
    public Respondent(CallHandler callHandler,String name) {
    	super(callHandler,name);
    	rank = Rank.Responder;
    }
}
