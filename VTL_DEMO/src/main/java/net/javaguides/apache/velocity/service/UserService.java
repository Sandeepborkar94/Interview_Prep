package net.javaguides.apache.velocity.service;

import java.util.Arrays;
import java.util.List;

import net.javaguides.apache.velocity.model.User;

public class UserService {

    public List < User > getUsers()
    {
        System.out.println("User service returning list of Users");

        return Arrays.asList(new User("Ramesh", "Fadatare"),
            new User("Tony", "Stark"),
            new User("Tom", "Cruise"));
    }
}