package automation.library.api.cucumber;

import io.restassured.response.Response;

public interface IRestResponse<T> {
	
	public T getbody();
	
	public String getContent();
	
	public int getStatusCode();
	
	public boolean isSuccessfull();
	
	public String getStatusDescription();
	
	public Response getResponse();
	
	public Exception getException();
	
	

}
