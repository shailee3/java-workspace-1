public class PhoneValidator {

	public boolean validatePhoneNumber(String phoneNo) {
		if (phoneNo == null) return false;
		return phoneNo.matches("^([+]\\([9][1]\\)){1}([7-9]{1})([0-9]{9})$");
	}
}
