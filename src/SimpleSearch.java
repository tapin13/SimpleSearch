
public class SimpleSearch {

	public static void main(String[] args) {
		int[] data = new int[5];
		data[0] = 10;
		data[1] = 87;
		data[2] = 8;
		data[3] = 5;
		data[4] = 13;
		
		System.out.println("search 5: " + search(data, 5));
		System.out.println("search 13: " + search(data, 13));
		System.out.println("search 22: " + search(data, 22));
		System.out.println("-----");
		System.out.println("state Oriented Search 5: " + stateOrientedSearch(data, 5));
		System.out.println("state Oriented Search 13: " + stateOrientedSearch(data, 13));
		System.out.println("state Oriented Search 22: " + stateOrientedSearch(data, 22));
	}
	
	public static int search(int[] data, int num) {
		int pos = 0;
		
		while( (data[pos] != num) && (pos < (data.length - 1))) {
			pos++;
		}
		
		if(data[pos] == num) {
			return pos;
		} else {
			return -1;
		}
	}
	
	public static int stateOrientedSearch(int[] data, int num) {
		final int FOUND = 0, ABSENT = 1, SEARCHING = 2;
		int pos = 0, state = SEARCHING;
		
		do {
			if(pos >= data.length) {
				state = ABSENT;
			} else if (data[pos] == num) {
				state = FOUND;
			} else {
				pos++;
			}
		} while (state == SEARCHING);
		
		switch (state) {
			case FOUND:
				return pos;
			case ABSENT:
				return -1;
		}
		
		return -1;
	}

}
