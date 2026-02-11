class Pyramid{
     public static void main(String[] args) {
     	int n=6;

     	for(int i=1;i<=n;i++){
     		for(int spaces=n;spaces>i;spaces--){
     			System.out.print(" "+" ");
     		}
     		for(int star=0;star<i;star++){
     			System.out.print("*"+" ");
     		}
     		//System.out.println();
     	
     	for(int k=1;k<i;k++){
     		System.out.print("*"+" ");
     	}
     	System.out.println();
     }
     }
}