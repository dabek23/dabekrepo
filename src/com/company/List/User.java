package com.company.List;

import java.util.List;
import java.util.Map;

public class User {

    private String email;

    public User(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return email != null ? email.equals(user.email) : user.email == null;
    }

    @Override
    public int hashCode() {
        return email != null ? email.hashCode() : 0;
    }

    }
//    public boolean equals(Object o) {
//        if (o == null) return false;
//        User u = (User) o;
//        return email.equals(u.email);
//    }
//
//    public int hashCode () {
//        int hash = 31;
//        return email.hashCode() + hash;
//    }