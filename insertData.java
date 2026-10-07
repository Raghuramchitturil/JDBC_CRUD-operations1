import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class insertData {
    static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "svist@123");
            String sql="INSERT INTO csex(id int,name varchar(20),marks int)values(?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,101);
            ps.setString(2,"laxmi");
            ps.setInt(3,60);
            ps.addBatch();
            ps.setInt(1,102);
            ps.setString(2,"naveen");
            ps.setInt(3,90);
            ps.addBatch();
            int rows[]=ps.executeBatch();
            if(rows.length>0){
                System.out.println(rows.length+ " rows Inserted");
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
