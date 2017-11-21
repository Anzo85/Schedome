package System.Services;


import System.Model.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private DAO listUsers;

    public List getUsers() {
        return listUsers.getUsers();
    }

    public void setUser() {

        listUsers.setUsers();
    }

}
