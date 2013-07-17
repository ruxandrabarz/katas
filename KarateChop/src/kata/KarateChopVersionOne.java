package kata;

public class KarateChopVersionOne {

	public int chop(int searchFor, int[] array) {

		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int index = ((high - low) / 2) + low;
			if (array[index] == searchFor)
				return index;
			else if (array[index] < searchFor) {
				low = index + 1;
			} else if (array[index] > searchFor) {
				high = index - 1;
			}

		}
		return -1; 
	}
}
