package dbproject;
import java.sql.*;
import java.util.Scanner;
public class dbcon {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		Connection c=DriverManager.getConnection("jdbc:mariadb://localhost:3325/car?user=root&password=emin2001");
		Statement st=c.createStatement();
		Scanner scan=new Scanner(System.in);
		System.out.println("araba adi: ");
		String name=scan.nextLine();
		System.out.println("araba hizi: ");
		int speed=scan.nextInt();
		/*String query="INSERT INTO cars(car_name,cars_speed) VALUES('" +name+"',"+speed+")";
		int sonuc=st.executeUpdate(query);
		System.out.println(sonuc);
		st.close();*/
		
		/*String q="INSERT INTO cars(car_name,cars_speed) VALUES(?,?)";
		PreparedStatement pt=c.prepareStatement(q);
		pt.setString(1, name);
		pt.setInt(2,speed);
		pt.executeUpdate();*/
		
		
		
		
	}

}
