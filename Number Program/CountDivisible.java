class CountDivisible{
	public static void main(String[]args){
		int num=36439,count=0;
		while(num!=0){
			int dig=num%10;
			if(dig%3==0){
		count++;
	}
				num=num/10;
			}
	System.out.print(count);
	}
}

