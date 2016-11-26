package NullCity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class NullCity {
	public static void main(String[] args) {
		int[] myArray = new int[6];
		// myArray[7]= 10; // ArraysOutOfBoundException

		// Declaration of ArrayList. Add and Remove of elements is easy.
		ArrayList<Integer> myArrayList = new ArrayList<>();
		myArrayList.add(1);
		myArrayList.add(2);
		myArrayList.add(3);
		myArrayList.add(4);
		myArrayList.add(5);
		myArrayList.remove(0);
		System.out.println(myArrayList.size());
		Iterator<Integer> aa = myArrayList.iterator();
		while (aa.hasNext()) {
			Object element = aa.next();
			System.out.print(element + " ");
		}

		ListIterator list = myArrayList.listIterator();
		while (list.hasNext()) {
			Object element = list.next();
			list.set(element + "+");
			System.out.print(element + " ");
		}
		System.out.print("Modified contents of al: ");
		list = (ListIterator) myArrayList.iterator();

		while (list.hasNext()) {
			Object element = list.next();
			System.out.print(element + " ");
		}

	}
}
