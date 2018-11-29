import java.util.ArrayList;
public class SharingLists{

   public static ArrayList <Integer> convertToArrayList(int x){
      ArrayList<Integer> abcd = new ArrayList<>();
		for(int z = 0; z<4; z++){
			abcd.add(0,x%10);
			x/=10;
			}
		    return abcd;
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

		int x = 8950;

		System.out.println(reconstructInteger(list));
		System.out.println(convertToArrayList(x));

 }
}