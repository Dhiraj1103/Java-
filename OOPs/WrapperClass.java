package OOPs;

public class WrapperClass {
	public static void AutoBoxingUnboxing() {
		Integer i=10;    //auto boxing
		int a=i;         // auto unboxing
		System.out.println(i);
		System.out.println(a);
	}
	
	public static void withoutUsingDataType() {
		Object i=100;
	     Object j=100;
	     Object ans=(int)i+(int)j;
	     System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=100;
		Integer i1=new Integer(i);
		System.out.println(i);
		System.out.println(i1);  //here it overrides object class methods
		System.out.println(i1.toString());
		
       AutoBoxingUnboxing();
       withoutUsingDataType();
	}

}
