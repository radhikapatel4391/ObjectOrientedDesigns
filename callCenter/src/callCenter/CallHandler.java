package callCenter;

import java.util.ArrayList;
import java.util.List;

/* CallHandler represents the body of the program,
 * and all calls are funneled first through it. 
 */
public class CallHandler {
	/* We have 3 levels of employees: respondents, managers, directors. */
	private final int LEVELS = 3;

	/* Initialize with 10 respondents, 4 managers, and 2 directors. */
	private final int NUM_RESPONDENTS = 3;
	private final int NUM_MANAGERS = 1;
	private final int NUM_DIRECTORS = 1;

	/*
	 * List of employees, by level. employeeLevels[0] = respondents
	 * employeeLevels[1] = managers employeeLevels[2] = directors
	 */
	List<List<Employee>> employeeLevels;
	List<List<Employee>> availableEmployee;

	/* queues for each call�s rank */
	List<List<Call>> callQueues;

	public CallHandler() {
		employeeLevels = new ArrayList<List<Employee>>(LEVELS);
		availableEmployee = new ArrayList<List<Employee>>(LEVELS);
		callQueues = new ArrayList<List<Call>>(LEVELS);
		ArrayList<Call> Rc = new ArrayList<Call>();
		ArrayList<Call> Mc = new ArrayList<Call>();
		ArrayList<Call> Dc = new ArrayList<Call>();
		callQueues.add(Rc);
		callQueues.add(Mc);
		callQueues.add(Dc);

		// Create respondents.
		ArrayList<Employee> respondents = new ArrayList<Employee>(NUM_RESPONDENTS);
		for (int k = 0; k < NUM_RESPONDENTS - 1; k++) {
			respondents.add(new Respondent(this, "R" + k));
		}

		employeeLevels.add(respondents);
		availableEmployee.add(respondents);

		// Create managers.
		ArrayList<Employee> managers = new ArrayList<Employee>(NUM_MANAGERS);
		managers.add(new Manager(this, "M1"));
		employeeLevels.add(managers);
		availableEmployee.add(managers);

		// Create directors.
		ArrayList<Employee> directors = new ArrayList<Employee>(NUM_DIRECTORS);
		directors.add(new Director(this, "D1"));
		employeeLevels.add(directors);
		availableEmployee.add(directors);
	}

	/* Gets the first available employee who can handle this call. */
	public Employee getHandlerForCall(Call call) {

		for (int level = call.getRank().getValue(); level < LEVELS; level++) {
			List<Employee> employeeLevel = employeeLevels.get(level);
			List<Employee> employeeLevel2 = availableEmployee.get(level);
			if (employeeLevel2.size() > 0) {
				Employee emp = employeeLevel2.get(0);
				employeeLevel2.remove(emp);
				return emp;
			}

			/*
			 * for (Employee emp : employeeLevel) { if (emp.isFree()) { return emp; } }
			 */
		}
		return null;
	}

	/*
	 * Routes the call to an available employee, or saves in a queue if no employee
	 * available.
	 */
	public void dispatchCall(Caller caller) {
		Call call = new Call(caller);
		dispatchCall(call);
	}

	/*
	 * Routes the call to an available employee, or saves in a queue if no employee
	 * available.
	 */
	public void dispatchCall(Call call) {
		/* Try to route the call to an employee with minimal rank. */
		Employee emp = getHandlerForCall(call);
		if (emp != null) {
			emp.receiveCall(call);
			call.setHandler(emp);
		} else {
			/* Place the call into corresponding call queue according to its rank. */
			call.reply("wait for : "+call.getRank()+" call: "+call.getID()+" caller: "+call.getCaller().getName());
			callQueues.get(call.getRank().getValue()).add(call);
		}
	}

	public void endCall(Call call) {
		Employee e = call.getHandler();
		if (e != null) {
			e.callCompleted();

		} else {
			callQueues.get(call.getRank().getValue()).remove(call);
			System.out.println("Call remove from waiting list " + call.getID() + " , " + call.getCaller().getName());
		}

	}

	/*
	 * An employee got free. Look for a waiting call that he/she can serve. Return
	 * true if we were able to assign a call, false otherwise.
	 */
	public boolean assignCall(Employee emp) {
		/* Check the queues, starting from the highest rank this employee can serve. */
		for (int rank = emp.getRank().getValue(); rank >= 0; rank--) {
			//List<Call> que = callQueues.get(rank);

			/* Remove the first call, if any */
			if (callQueues.get(rank).size() > 0) {
				Call call = callQueues.get(rank).remove(0);
				if (call != null) {
					emp.receiveCall(call);
					call.setHandler(emp);
					return true;
				}
			} else {
				availableEmployee.get(emp.getRank().getValue()).add(emp);
			}
		}
		return false;
	}
}
