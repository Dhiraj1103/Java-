class Range{
	public static void main(String[] args) {
		
		for(int i=1;i<=5000;i++){
        
         int num=i, sum=0;
          int sq=num*num;
          while(sq!=0){
            int dig=sq%10;
            sum+=dig;
            sq/=10;
          }
          if(sum==num)
            System.out.println(i);
     }

}
}