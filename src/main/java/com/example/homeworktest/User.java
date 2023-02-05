package com.example.homeworktest;

import java.util.Objects;

public class User {
    private String mail;
    private String login;

    public User(String mail, String login) {
        this.mail = mail;
        this.login = login;
    }

    public User() {

    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(mail, user.mail) && Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mail, login);
    }
}
