class MissingDigit2{
	public static int minMax(int num){
		int temp=num;
		int min=9,max=0;
		while(temp!=0){
			int dig=temp%10
			if(dig>max){
				max=dig;
			}
			if(dig<min){
				min=dig;
			}
			temp/=10;
		}
		return max;
	}
	public static int findMissing(int num){
		for(int i=1;i<=minMax(num);i++)
		int demo=num;
		int count=0;
	}


}