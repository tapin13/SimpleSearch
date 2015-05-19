
public class SimpleSearch {

	public static void main(String[] args) {
		int[] data = new int[5];
		data[0] = 10;
		data[1] = 1;
		data[2] = 8;
		data[3] = 5;
		data[4] = 13;
		
		System.out.println("" + search(data, 1));
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

}
