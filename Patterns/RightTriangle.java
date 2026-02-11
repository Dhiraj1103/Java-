class RightTriangle{
	public static void main(String[] args) {
		int n =4;
		for(int i=1;i<=n;i++){
			for(int spaces=n;spaces>i;spaces--){
				System.out.print(" "+" ");
			}
			for(int star=0;star<i;star++){
				System.out.print("*"+" ");
			}

		System.out.println();	
		}

	}
}