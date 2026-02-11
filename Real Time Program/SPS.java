import java.util.Scanner;
class SPS{
	pubic static void main(String[]args){
		
		int botRes=0;
		for(; ;){
			botRes=(int)(Math.random()*9);
			if(botRes>=1 && botRes<=3){
				break;
			}
		}
         Scanner sc= new Scanner(System.in);
         System.out.println("**********Welcome***********");
         System.out.println();
         System.out.println("1. Stone  2. Paper  3.Scissor");
         System.out.println();
         System.out.print("Enter your response: ");
         int userRes= sc.nextInt();
         if(userRes<=0 && userRes>=4){
         	System.out.println("Invalid response");
         	return;   //terminate
         }
         String botRes="";//intially empty
         String userRes="";// intially empty
          
          switch(botRes)
          {
          case 1: botResponse="Stone";break;
          	case 2: botResponse="Paper";break;
            case 3: botResponse="Scissor";break;
  }

  switch(userRes){
  case 1: userrResponse="Stone";break;
case 2: userResponse="Paper";break;
            case 3: userResponse="Scissor";break;
  }

  System.out.println("BOT"           "User");
  Systen.out.println(botResponse+"           "+userResponse);

  if(botResponse.equals("Stone"))


	}
}