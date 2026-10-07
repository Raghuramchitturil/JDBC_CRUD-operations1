import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createTable {
    static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "svist@123");
            System.out.println("dbConnected");
            Statement st=con.createStatement();
            st.executeQuery("create table csex(id int,name varchar,marks int)");
            System.out.println("Table Created");
        con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
