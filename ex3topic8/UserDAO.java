package ex3topic8;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    public List<User> getAllUser() {
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
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return userList;

    }

    public void insertDetails(User user) {
        //fill your code here
        Connection con = null;
        try {
            con = DBConnection.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String query = "INSERT INTO \"user\" (name, contact_detail, username, password) VALUES(?,?,?,?) ";
        try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1,user.getName());
            pst.setString(2, user.getContactDetail());
            pst.setString(3, user.getUsername());
            pst.setString(4, user.getPassword());
            int count = pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
