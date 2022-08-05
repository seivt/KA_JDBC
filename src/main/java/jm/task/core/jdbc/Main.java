package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Al", "Pacino", (byte) 82);
        userService.saveUser("Meryl", "Streep", (byte) 73);
        userService.saveUser("Christian", "Bale", (byte) 48);
        userService.saveUser("Olivia", "Wilde", (byte) 38);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();




    }
}
