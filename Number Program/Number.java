class Number{
	public static void main(String[]args){
                
         int num=12345;
         while(num!=0){
         	int dig=num%10;
         	
         	System.out.println(dig);
             
         	num=num/10;
         }
	}
}