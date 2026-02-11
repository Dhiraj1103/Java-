package Collection;

import java.util.ArrayList;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(102);
		a.add(102);
		a.add(101);
		a.add(101);
		a.add(101);
		a.add(101);
		a.add(130);
		a.add(109);
		a.add(109);
		a.add(109);
      int max=a.get(0);
      int min=a.get(0);

	       for (int i = 0; i < a.size(); i++) {
			int num=a.get(i);
           if(max<num) max=num;
           else if(min>num) min=num;
	       }
	       System.out.println(max);
	       System.out.println(min);
		
	}

}
