package practice01.prob5;

public class Prob5 {
	public static void main (String args[]) {
		for (int i = 1; i <= 99; i++) {
			String s = Integer.toString(i);
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if((s.charAt(j)-'0')%3==0 && (s.charAt(j)-'0')>=3) count++;
			}
			if(count>0) {
				System.out.print(s+" ");
				for (int j = 0; j < count; j++) {
					System.out.print("짝");
				}
				System.out.println();
			}
		}
	}
}
