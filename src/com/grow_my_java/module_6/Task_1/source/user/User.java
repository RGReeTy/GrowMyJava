package com.grow_my_java.module_6.Task_1.source.user;

import com.grow_my_java.module_6.Task_1.source.CatalogObserver;
import com.grow_my_java.module_6.Task_1.source.Content;
import com.grow_my_java.module_6.Task_1.source.book.Book;
import com.grow_my_java.module_6.Task_1.utils.Operation;

public class User implements CatalogObserver {
    private static int genID = 1;
    private int id;
    private String name;
    private String lastname;
    private SEX sex;
    private String username;
    private char[] password;
    private String salt;
    private Email email;
    private Role role;

    public User() {
        this.id = genID++;
    }

    public User(String username, String password) {
        this();
        if (username.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException("Username or password cannot be empty!");
        }
        this.name = "";
        this.lastname = "";
        this.sex = SEX.MALE;
        this.username = username;
        this.password = password.toCharArray();
        this.email = new Email("");
        this.role = Role.USER;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public SEX getSex() {
        return sex;
    }

    public void setSex(SEX sex) {
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void update(Operation operation, Book book, Email email) {
        Letter letter;
        switch (operation) {
            case ADDED:
                letter = new Letter(email, this.email, "Catalog Update!",
                        "The next book was added in catalog: " + book.toString(), (Content) book);
                email.getOutbox().add(letter);
                this.email.getInbox().add(letter);
                break;
            case REMOVED:
                letter = new Letter(email, this.email, "Catalog Update!",
                        "The next book was removed from catalog: " + book.toString(), (Content) book);
                email.getOutbox().add(letter);
                this.email.getInbox().add(letter);
                break;
            default:
                throw new EnumConstantNotPresentException(Operation.class, operation.name());
        }
    }

    @Override
    public String toString() {
        return String.format("ID: %d,\t name: %s,\t lastname: %s,\t sex: %s,\t username: %s,\t email: %s,\t role: %s",
                id, name, lastname, sex.name().toLowerCase(), username, email, role.name().toLowerCase());
    }
}
