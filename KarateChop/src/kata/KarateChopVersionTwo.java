package kata;

public class KarateChopVersionTwo {

	public int chop(int searchFor, int[] array) {
		int arrayLength = array.length;
		if (arrayLength == 1 && array[0] == searchFor) {
			return 0;
		} else if (arrayLength > 1) {
			return subChop(searchFor, array, 0, array.length);
		}
		return -1;
	}

	private int subChop(int searchFor, int[] array, int start, int stop) {
		int middle = (start+stop)/2;
		if(array[middle] == searchFor)
		{
			return middle;
		}
		if(searchFor<=array[middle])
		{
			return subChop(searchFor, array, 0, middle);
		}else{
			return subChop(searchFor, array, middle+1, stop);
		}
	}

}
