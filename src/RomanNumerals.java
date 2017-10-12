public class RomanNumerals {
	
	private String romanNumerals;
	private String romanFiveNumerals;
	private int[] romanNumeralLevels;
	private int[] romanNumeralValues;
	
	public RomanNumerals() {
		romanNumerals = "MDCLXVI";
		romanFiveNumerals = "DLV";
		romanNumeralLevels = new int [] {4, 4, 3, 3, 2, 2, 1};
		romanNumeralValues = new int [] {1000, 500, 100, 50, 10, 5, 1};
	}
	
	public int convertToInteger(String romanNum) throws RomanNumeralsException  {
		
		if(!isValidRomanNumerals(romanNum)) {
			throw new RomanNumeralsException();
		}

		return computeValue(romanNum);
	}
	
	private boolean isValidRomanNumerals(String romanNum) {
		if(romanNum.isEmpty()) return false;
		if(hasInvalidRomanCharacters(romanNum)) return false;
		if(hasTooManySeqCharacters(romanNum)) return false;
		if(hasInvalidSubtracations(romanNum)) return false;
		
		return true;
	}
	
	private boolean hasInvalidRomanCharacters(String str) {
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(romanNumerals.indexOf(ch) == -1)
				return true;
		}
		
		return false;
	}
	
	private boolean hasTooManySeqCharacters(String str) {
		char prev = str.charAt(0); 
		int count = 1;
		
		for(int i = 1; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch != prev) {
				count = 0;
			}
			
			if((count == 3) || (count == 1 && isFiveNumeral(ch))) {
				return true;
			}
			
			prev = ch;
			count++;
		}
		
		return false;
	}
	
	private boolean hasInvalidSubtracations(String str) {
		char[] charList = reverseString(str).toCharArray();
		
		int twoPrevLevel = 0;
		int onePrevLevel = 0;
		
		for(char x : charList) {
			int alphabetIndex = romanNumerals.indexOf(x);
			int level = romanNumeralLevels[alphabetIndex];
			
			if(level < onePrevLevel - 1) return true;
			if(level <= onePrevLevel && isFiveNumeral(x)) return true;
			if(level == onePrevLevel && level == (twoPrevLevel - 1)) return true;
			if(level == (onePrevLevel - 1) && twoPrevLevel == (onePrevLevel - 1)) return true;
			
			twoPrevLevel = onePrevLevel;
			onePrevLevel = level;
		}
		
		return false;
	}
	
	private boolean isFiveNumeral(char ch) {
		return (romanFiveNumerals.indexOf(ch) != -1);
	}
	
	private int computeValue(String romanNum) {
		String tmp = reverseString(romanNum);
		int sum = 0;
		int prevValue = 0;
		
		for(int i = 0; i < tmp.length(); i++) {
			char ch = tmp.charAt(i);
			int index = romanNumerals.indexOf(ch);
			int value = romanNumeralValues[index];
		
			if(value < prevValue) {
				sum -= value;
			}
			else {
				sum += value;
			}
			
			prevValue = value;
		}
		
		return sum;
	}
	
	private String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}
}
