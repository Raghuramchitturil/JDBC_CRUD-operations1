import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class updateData {
    static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "svist@123");
            String sql="Update csex set marks=? where id=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,101);
            ps.setInt(2,98);
            int rows=ps.executeUpdate();
            if(rows>0){
                System.out.println("row's updated");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
