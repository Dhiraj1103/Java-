public class DiffeSOS{
	static int sumOfSquare() {
		int sum=0;
		for(int i=0;i<=10;i++){
			int pro=i*i;
			sum+=pro;
		}
		return sum;
	}

	static int squareOfSum(){
		int sum=0;
		for(int i=0;i<=10;i++){
			sum+=i;
		}
		int product=sum*sum;
		return product;

	}

	public static void main(String[] args) {
		int ans=squareOfSum()-sumOfSquare();
		System.out.println(ans);
	}
}