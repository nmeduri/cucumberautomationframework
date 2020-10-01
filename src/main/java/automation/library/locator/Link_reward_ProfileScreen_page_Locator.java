package automation.library.locator;

import automation.library.common.Property;
import automation.library.cucumber.Constant;
import automation.library.logdetail.Log;

public class Link_reward_ProfileScreen_page_Locator {


	String getTriangleReward=Property.getProperty(Constant.OR_FILE, "getTriangleReward");
	String firstName=Property.getProperty(Constant.OR_FILE, "firstName");
	String lastName=Property.getProperty(Constant.OR_FILE, "lastName");
	String address=Property.getProperty(Constant.OR_FILE, "address");
	String city=Property.getProperty(Constant.OR_FILE, "city");
	String province=Property.getProperty(Constant.OR_FILE, "province");
	String postalCode=Property.getProperty(Constant.OR_FILE, "postalCode");
	String phnNumber=Property.getProperty(Constant.OR_FILE, "phnNumber");
	String Birth=Property.getProperty(Constant.OR_FILE, "Birth");
	String continuebtn= Property.getProperty(Constant.OR_FILE, "continue");
	String cancel=Property.getProperty(Constant.OR_FILE, "cancel");

	String YOBerror=Property.getProperty(Constant.OR_FILE, "YOBerror");
	String FNError=Property.getProperty(Constant.OR_FILE, "FNError");
	String LNError=Property.getProperty(Constant.OR_FILE, "LNError");
	String addressError=Property.getProperty(Constant.OR_FILE, "addressError");
	String cityError=Property.getProperty(Constant.OR_FILE, "cityError");
	String PinError=Property.getProperty(Constant.OR_FILE, "PinError");
	String provinceErr=Property.getProperty(Constant.OR_FILE, "provinceErr");
	String phnError=Property.getProperty(Constant.OR_FILE, "phnError");
	String provinceValue=Property.getProperty(Constant.OR_FILE, "provinceValue");
	String yearOfBirthValue=Property.getProperty(Constant.OR_FILE, "yearOfBirthValue");
	String monthOfBirth=Property.getProperty(Constant.OR_FILE, "monthOfBirth");
	String DOB=Property.getProperty(Constant.OR_FILE, "DOB");
	String monthValue=Property.getProperty(Constant.OR_FILE, "monthValue");
	String DOBValue=Property.getProperty(Constant.OR_FILE, "DOBValue");
    String InvalidLastnameError=Property.getProperty(Constant.OR_FILE, "InvalidLastnameError");
    String InvalidFirstnameError=Property.getProperty(Constant.OR_FILE, "InvalidFirstnameError");

	public String getTriangleReward() {

		return getTriangleReward;
	}
	public String get_FirstName() {

		return firstName;
	}
	public String get_LastName() {

		return lastName;
	}
	public String get_address() {

		return address;
	}
	public String get_city() {

		return city;
	}
	public String get_province() {

		return province;
	}
	public String get_PostalCode() {

		return postalCode;
	}
	public String get_phnNumber() {

		return phnNumber;
	}
	public String get_Birth() {

		return Birth;
	}
	public String get_continuebtn() {

		return continuebtn;
	}
	public String Get_cancel() {

		return cancel;
	}
	public String get_YOBerror() {

		return YOBerror;
	}
	public String get_FNError() {

		return FNError;
	}
	public String get_LNError() {

		return LNError;
	}
	public String get_addressError() {

		return addressError;
	}
	public String get_cityError() {

		return cityError;
	}
	public String get_PinError() {

		return PinError;
	}
	public String get_provinceErr() {

		return provinceErr;
	}
	public String get_phnError() {

		return phnError;
	}
	public String set_Province() {

		return provinceValue;
	}
	public String set_Year() {

		return yearOfBirthValue;
	}
	public String get_MonthOfBirth() {

		return monthOfBirth;
	}
	public String get_MOBValue() {

		return monthValue;
	}
	public String get_DateOfBirth() {

		return DOB;
	}
	public String get_DOBValue() {

		return DOBValue;
	}
	public String get_InvalidFN() {

		return InvalidFirstnameError;
	}
	public String get_InvalidLN() {

		return InvalidLastnameError;
	}
	


}
