package March28th;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        UserDAO userDao = new UserDAO();
        List<User> userList = new ArrayList<>();
        userList = userDao.getAllUsers();
        System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");        for(int i = 0; i < userList.size(); i++){
            User user = userList.get(i);
            Long id = user.getId();
            String name = user.getName();
            String contact_detail = user.getContactDetail();
            String username = user.getUsername();
            String password = user.getPassword();
            System.out.format("%-5s %-5s %-15s %-10s %s\n",id,name,contact_detail,username,password);
        }

    }
}
