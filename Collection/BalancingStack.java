package Collection;
import java.util.Stack;

public class BalancingStack {
	
	public static boolean isBalanced(String s) {
		if(s.length()!=0 && s.length()%2==0) {
			Stack<Character> st=new Stack<>();
          for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch=='{'|| ch=='['||ch=='(') {
				st.push(ch);
			}
			else if(!st.empty() && (st.peek()=='[' && ch==']'||st.peek()=='(' && ch==')'||st.peek()=='{' && ch=='}')) {
				st.pop();
			}
			else return false;
		}
          return st.isEmpty();
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="{()[]{}}";
    System.out.println(isBalanced(s));
	}

}
