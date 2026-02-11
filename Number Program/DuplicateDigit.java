class DuplicateDigit{
	public static void main(String[] args) {
		int num=1112334;
		for(int i=0;i<=9;i++){
			int count=0;
			int temp=num;
			while(temp!=0){
				if(temp%10==i){
					count++;
				}
				temp/=10;
			}
			if(count>1){
				System.out.println(i+" : "+count);
			}
		}
	}
}