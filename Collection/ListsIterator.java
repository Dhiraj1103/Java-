package Collection;
import java.util.ArrayList;
import java.util.ListIterator;
public class ListsIterator {
  
	//this is ListIterator which traverses in both the direction
		
	public static void main(String[] args) {
				// TODO Auto-generated method stub
		    
				ArrayList<Integer> a1=new ArrayList<Integer>();
				
				a1.add(10);
				a1.add(20);
				a1.add(30);
				a1.add(45);
				a1.add(50);
				a1.add(60);
				ListIterator<Integer> i=a1.listIterator();
				System.out.println("This is Ascending iteration");
				while(i.hasNext()) {
					System.out.println(i.next());
				}
				System.out.println();
				ListIterator<Integer> i2=a1.listIterator(a1.size()); // here we mentioned a1.size() because it should start from the last
				System.out.println("This is descending iteration");
				while (i2.hasPrevious()) {
		         System.out.println(i2.previous());			
				}
		
                
               while(i2.hasNext()) {
            	   int val=i2.next();
            	   if(val%2==0) i2.remove();
               }
         	  System.out.println(); 

               for (Integer integer : a1) {
				System.out.println(integer);
			}
               
				int sum=0;
				while(i.hasNext()) {
					int val=i.next();
					sum+=val;
				}
				System.out.println("Sum: "+sum);
			}

		}

