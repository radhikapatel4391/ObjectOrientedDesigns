
public class Composite implements Component{
	private Component[] children = new Component[9];
    private int total = 0;
    private int value;
    public Composite(int val) {
        value = val;
    }

    // 3. Couple to interface
    public void add(Component c) {
        children[total++] = c;
    }

    public void traverse() {
    	
        System.out.println(value + "  ");
        for (int i=0; i < total; i++) {
            // 4. Delegation and polymorphism
            children[i].traverse();
        }
    }
}
