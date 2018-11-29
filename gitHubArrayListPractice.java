import java.util.ArrayList;
public class gitHubArrayListPractice{

	public static int constructInt(ArrayList<Integer> list){
		int [] number = new int[list.size()];
		int num = 0;
		for(int i=0; i<list.size(); i++){
			number[i] = list.get(i);
		}
		for(int i=0; i<list.size(); i++){
			num += number[i];
			num*=10;
		if(i==list.size()-1)
			num/=10;
		}
		return num;
	}


	public static void main(String[]args){
		System.out.println(convertToArrayList(123));
		System.out.println(constructInt(convertToArrayList(123)));

	}
}