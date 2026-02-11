class Practice {
	public static void main(String[] args) {
		int n=8;
		for(int i=1;i<=n;i++){
			for(int spaces=n;spaces>=i;spaces--){
				System.out.print(" ");
                }
				for(int j=1;j<=i;j++){
					System.out.print("*"+" ");
				
			}
			System.out.println();
		}

		for(int i=2;i<=n;i++){
			for(int spaces=1;spaces<=i;spaces++){
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}