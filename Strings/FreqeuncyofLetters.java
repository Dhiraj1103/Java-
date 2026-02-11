package Strings;





public class FreqeuncyofLetters {
	public static void frequency(String s) {
		char ch[]=s.toCharArray();
		int ct[]=new int[ch.length];
		for (int i = 0; i < ch.length; i++) {
			if(ct[i]!=-1) {
				int count=1;
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
					ct[j]=-1;
				}
			}
			ct[i]=count;
			System.out.println(ch[i]+":"+count);
			}
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="Dheeraj";
       frequency(s);
	}

}
