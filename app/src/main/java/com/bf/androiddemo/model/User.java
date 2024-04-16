package com.bf.androiddemo.model;

public class User {

    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    static class MockUser {
        static User getMockUser() {
            return new User("Zac");
        }
    }
}
