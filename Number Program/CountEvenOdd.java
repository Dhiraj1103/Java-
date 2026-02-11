class CountEvenOdd{
	public static void main(String[]args){
      int num=12345;
      int evenCount=0,oddCount=0;
      while(num!=0){
      	int dig=num%10;
    if(dig%2==0){
    	evenCount++;
    }
    else{
    	oddCount++;
    		
    }
    num=num/10;
      }
      System.out.println(evenCount);
      System.out.println(oddCount);
	}
}