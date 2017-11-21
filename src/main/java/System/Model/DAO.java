package System.Model;

import org.springframework.stereotype.Repository;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class DAO {

         // private List<User> users  = Arrays.asList(new User("Ad", "z", new BigInteger("0987118624")),
         // new User("BB", "D", new BigInteger("0987118633")));

    private List<User> users = new ArrayList<User>();


    public List<User> getUsers() {
        return users;
    }

    public void setUsers() {
        users.add(new User("SET", "SET", new BigInteger("0987118624")));
    }


}
