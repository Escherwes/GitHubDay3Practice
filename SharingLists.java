import java.util.ArrayList;
public class SharingLists{

	public static ArrayList <Integer> convertToArrayList(int num){

		ArrayList<Integer> abcd = new ArrayList<>();

	}

	public static int reconstructInteger(ArrayList<Integer> list){

		int multiply = 1;

		int addList = 0;

		int temp = 0;

		for(int i = list.size()-1; i>=0; i--){

			temp = list.remove(i);

			addList += temp*multiply;

			multiply *= 10;
		}

		return addList;

	}

	public static void main(String[]args){

		ArrayList<Integer> list = new ArrayList<>();

		list.add(8);
		list.add(9);
		list.add(5);
		list.add(0);

		System.out.println(reconstructInteger(list));

		int test = 9999;

		System.out.println(convertToArrayList(test));

	}
}