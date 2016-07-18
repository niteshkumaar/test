package java3.com.data.structure.sorting;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static List<Integer> quickSort(List<Integer> list, int pivot, String direction) {
		int index = 0;
		if (list.size() == 1) {
			return list;
		} else {
			if (direction.equals("left")) {
				List<Integer> leftList = new ArrayList<>();
				if (list.get(index) <= pivot) {
					leftList.add(list.get(index));
				}
			} else {

			}
		}
	}

}
