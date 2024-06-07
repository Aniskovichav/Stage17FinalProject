package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user;

import java.io.Serializable;

public abstract class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String username;
    private Group group;
    private UserRole role;

    public User(int id, String username) {
        this.id = 0;
        this.username = "noname";
        group = null;
        role = UserRole.USER;
    }

    public User(int id, String username, UserRole role) {
        this.id = id;
        this.username = username;
        this.group = group;
        this.role = role;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String toString() {
        return username + ", group = " + group + ", role = " + role;
    }
}

