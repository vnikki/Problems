package strings;

public class IsPalindrome {

	public boolean isPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return false;
		}
		char[] carr = s.toCharArray();
		for (int i = 0, j = carr.length-1; i <= carr.length/2; i++, j--) {
			if (carr[i] != carr[j]) {
				return false;
			}
		}
		return true;
	}
	
	public boolean alphaNumericCaseInsensitive(String s) {
		if (s == null || s.length() == 0) {
			return false;
		}
		
		for (int i = 0, j = s.length()-1; i < j;i++, j--) {
			while (!Character.isLetter(s.charAt(i)) && i < j) {
				i++;
			}
			while (!Character.isLetter(s.charAt(j)) && i < j) {
				j--;
			}
			if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
				return false;
			}
		}
		return true;
	}
}
