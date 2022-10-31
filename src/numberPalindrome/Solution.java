package numberPalindrome;

public class Solution {

	public static void main(String[] args) {//q13
		// TODO Auto-generated method stub
		System.out.println(romanToInt("LVIII"));
		

	}
	   public static int romanToInt(String s) {
			int i=s.length(); int ans=0;
			while(i>0) {
				if(s.charAt(i-1)=='I') {
					ans+=1;
				}
				else if(s.charAt(i-1)=='V') {
					ans+=5;
					if(i>1&&s.charAt(i-2)=='I') {
						ans-=1;
						i--;
					}
				}
				else if(s.charAt(i-1)=='X') {
					ans+=10;
					if(i>1&&s.charAt(i-2)=='I') {
						ans-=1;
						i--;
					}
				}
				else if(s.charAt(i-1)=='L') {
					ans+=50;
					if(i>1&&s.charAt(i-2)=='X') {
						ans-=10;
						i--;
					}
				}
				else if(s.charAt(i-1)=='C') {
					ans+=100;
					if(i>1&&s.charAt(i-2)=='X') {
						ans-=10;
						i--;
					}
				}
				else if(s.charAt(i-1)=='D') {
					ans+=500;
					if(i>1&&s.charAt(i-2)=='C') {
						ans-=100;
						i--;
					}
				}
				else if(s.charAt(i-1)=='M') {
					ans+=1000;
					if(i>1&&s.charAt(i-2)=='C') {
						ans-=100;
						i--;
					}
				}
				i--;
			}
			return ans;
	    }

}
