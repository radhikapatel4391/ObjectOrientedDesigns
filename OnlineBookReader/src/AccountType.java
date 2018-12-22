
public enum AccountType {
	
		silver (0),
		Gold (1),
		Platinum (2);
		
		private int value;
		
		private AccountType(int v) {
			value = v;
		}
		
		public int getValue() {
			return value;
		}
	}


