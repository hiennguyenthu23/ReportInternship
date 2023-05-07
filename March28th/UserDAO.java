package March28th;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<User>();
        //your code goes here...
        Connection con = null;
        try {
            con = DBConnection.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String query = "select * from  \"user\" ";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Long id = rs.getLong(1);
                String name = rs.getString(2);
                String contact_detail = rs.getString(3);
                String username = rs.getString(4);
                String password = rs.getString(5);
                User user = new User(id, name, contact_detail, username, password);
                userList.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }
}