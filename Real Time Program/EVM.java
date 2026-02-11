import java.util.Scanner;
class EVM{
       static int bjp, mns, ncp, con, ss, nota;

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("*************WELCOME****************");
            System.out.println();
            System.out.print("Enter the population: ");

            int pop=sc.nextInt();
            System.out.println();
            
           for(int i=1;i<=pop;i++){
            System.out.println();
            System.out.println("LIST OF PARTIES");
            System.out.println("1. BJP");
            System.out.println("2. MNS");
            System.out.println("3. NCP");
            System.out.println("4. CON");
            System.out.println("6. SHIV SENA");
            System.out.println("7. NOTA");
            
             System.out.print("Enter you party vote: ");
             String res=sc.next().toUpperCase();
             switch(res){
             case  "BJP":{
                     bjp++;
                     System.out.println("You Have given the vote to BJP");
                     break;
             }
               case  "MNS":{
                     mns++;
                     System.out.println("You Have given the vote to MNS");
                     break;
             }
               case  "NCP":{
                     ncp++;
                     System.out.println("You Have given the vote to NCP");
                     break;
             }
               case  "CON":{
                     con++;
                     System.out.println("You Have given the vote to CON");
                     break;
             }
               case  "SHIVSENA":{
                     ss++;
                     System.out.println("You Have given the vote to SHIVSENA");
                     break;
             }
               case  "NOTA":{
                     nota++;
                     System.out.println("You Have given the vote to NOTA");
                     break;
             }
         default :{
            System.out.println("Invalid Party Name");
            i--;
            break;
         }
                           }

}

     if(bjp>=mns && bjp>=ss && bjp>=nota && bjp>=con && bjp>=ncp){
        System.out.println("BJP won by "+bjp+" votes.");
     }
     else if(mns>=bjp && mns>=ss && mns>=nota && mns>=con && mns>=ncp){
        System.out.println("MNS won by "+mns+" votes.");
     }
         else if(ncp>=mns && ncp>=ss && ncp>=nota && ncp>=con && ncp>=bjp){
        System.out.println("NCP won by "+ncp+" votes.");
     }
      else if(con>=mns && con>=ss && con>=nota && con>=bjp && con>=ncp){
        System.out.println("CON won by "+con+" votes.");
     }
    else if(ss>=mns && ss>=bjp && ss>=nota && ss>=con && ss>=ncp){
        System.out.println("SS won by "+ss+" votes.");
    }
    //else if(nota>=mns && nota>=ss && nota>=bjp && nota>=con && nota>=ncp){
      else{
        System.out.println("NOTA "+nota);
}
}
}