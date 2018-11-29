import java.util.ArrayList;
public class gitHubArrayListPractice{
	public static void main(String[]args){
		int a = 8950;
		System.out.println(convertToArrayList(a));

	}
		public static ArrayList<Integer> convertToArrayList(int a){
			ArrayList<Integer> list = new ArrayList<>();
			while(a>0){
				list.add(a%10);
				a/=10;
			}
			ArrayList<Integer> list2 = new ArrayList<>();
			for(int i=list.size()-1; i>-1; i--){
				list2.add(list.get(i));
			}
			return list2;
	}
}