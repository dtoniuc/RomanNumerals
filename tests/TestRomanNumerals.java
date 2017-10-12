import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void convertToInteger_validNumeral_notThrowsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String validNumeral = "MMCMXXXIV";
		
		//Act
		int actual = converter.convertToInteger(validNumeral);
		
		//Assert
		int expected = 2934;
		assertEquals(expected, actual);
	}
	
	@Test
	public void convertToInteger_validNumera2_notThrowsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String validNumeral = "CDXLIV";
		
		//Act
		int actual = converter.convertToInteger(validNumeral);
		
		//Assert
		int expected = 444;
		assertEquals(expected, actual);
	}
	
	@Test
	public void convertToInteger_validNumera3_notThrowsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String validNumeral = "MMMCCCXXXIII";
		
		//Act
		int actual = converter.convertToInteger(validNumeral);
		
		//Assert
		int expected = 3333;
		assertEquals(expected, actual);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralEmptyString_notThrowsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	//More than one '5' characters
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralTwo_D_Chars_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "DD";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralTwo_L_Chars_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "LL";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralTwo_V_Chars_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "VV";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}

	//More than three '1' characters
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralFour_M_Chars_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "MMMM";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralFour_C_Chars_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "CCCC";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralFour_X_Chars_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "XXXX";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralFour_I_Chars_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "IIII";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	//Double subtraction
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralDouble_CCM_Subtraction_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "CCM";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralDouble_CCD_Subtraction_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "CCD";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralDouble_XXC_Subtraction_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "XXC";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralDouble_XXL_Subtraction_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "XXL";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralDouble_IIX_Subtraction_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "IIX";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralDouble_IIV_Subtraction_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "IIV";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}

	//Invalid '5' character subtraction
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralBad_DM_Subtraction_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "DM";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralBad_LM_Subtraction_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "LM";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralBad_VM_Subtraction_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "VM";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralBad_LC_Subtraction_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "LC";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralBad_VC_Subtraction_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "VC";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralBad_VX_Subtraction_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "VX";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	//Invalid '1' character subtraction
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralBad_XM_Subtraction_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "XM";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralBad_IM_Subtraction_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "IM";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralBad_XD_Subtraction_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "XD";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralBad_IC_Subtraction_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "IC";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralBad_IL_Subtraction_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "IL";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	//Invalid character sequence
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralBAD_CMC_Sequence_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "CMC";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralBAD_CDC_Sequence_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "CMC";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralBAD_XCX_Sequence_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "XCX";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralBAD_XLX_Sequence_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "XLX";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralBAD_IXI_Sequence_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "IXI";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
	
	@Test(expected = RomanNumeralsException.class)
	public void convertToInteger_invalidNumeralBAD_IVI_Sequence_throwsException() throws RomanNumeralsException {
		//Arrange
		RomanNumerals converter = new RomanNumerals();
		String invalidNumeral = "IVI";
		
		//Act
		converter.convertToInteger(invalidNumeral);
	}
}
