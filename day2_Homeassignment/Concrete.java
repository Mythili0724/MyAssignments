package week3.day2_Homeassignment;

public class Concrete implements DatabaseConnection {

	public static void main(String[] args) {
		Concrete con=new Concrete();
		con.connect();
		con.disconnect();
		con.executeUpdate();

	}

	@Override
	public void connect() {
		System.out.println("Connect to the database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("DisConnect from the database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Update the database");
		
	}

}
