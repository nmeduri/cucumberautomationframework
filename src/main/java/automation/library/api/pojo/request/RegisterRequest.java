package automation.library.api.pojo.request;

public class RegisterRequest {

	public String FirstName;
	public String LastName;
	public String UserName;
	public String Password;
	public String Email;

	public RegisterRequest(String FirstName, String LastName, String UserName, String Password, String Email) {

		this.FirstName = FirstName;
		this.LastName = LastName;
		this.UserName = UserName;
		this.Password = Password;
		this.Email = Email;
	}

}
