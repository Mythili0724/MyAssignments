package week3.day1.ha;

public class APIClient {

	public void sendRequest(String Endpoint)
	{
		System.out.println("EndPoint of the APIClient:" + " " +Endpoint );
	}
	public void sendRequest(String Endpoint,String requestBody,boolean requestStatus)
	{
		System.out.println("EndPoint of the APIClient:" + " " +Endpoint );
		System.out.println("Request Body:" + requestBody);
		System.out.println("Request status is:" + requestStatus);
	}
	public static void main(String[] args) {
		APIClient api=new APIClient();
		api.sendRequest("Server");
		api.sendRequest("Server", "Message", true);

	}

}
