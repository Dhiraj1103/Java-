class CheckDuck{
	public static void main(String[]args){
         int num=1123;
         boolean isDuck=false;

         while(num!=0){
         	int dig=num%10;
         	if(dig==0){
         		isDuck=true;
         break;
        } 
        num=num/10;
}
    if(isDuck==true){
          System.out.print("The number is Duck number");
         }
         else{
          System.out.println("The number is Non-Duck number");
         }
}
}