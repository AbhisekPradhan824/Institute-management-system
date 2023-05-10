import java.sql.*;

public class Connect{
    Connection con;
    Statement st;
    public Connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Institute", "root", "Abhinandan@824");

            st =con.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
