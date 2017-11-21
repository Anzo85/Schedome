package System;

import System.Model.DAO;
import System.Model.User;
import System.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

/**
 * Created by anzo0316 on 11/21/2017.
 */
public class sas {



    public static void main(String[] args) {

        DAO d = new DAO();

        d.setUsers();

        System.out.println(d);

    }
}
