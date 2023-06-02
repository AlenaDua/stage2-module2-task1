package com.example;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {

    private static Warehouse instance;
    private static final Set<User> users = new HashSet<>();

    public Warehouse() {}

    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }

    public static void addUser(User user) {
        users.add(user);
    }

    public Set<User> getUsers() {
        return users;
    }
}
