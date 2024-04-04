package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user;

public class User {
    private String username;
    private Group group;
    private UserRole role;

    public User() {
    }

    public User(String username, Group group, UserRole role) {
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
        return "User{" +
                "username='" + username + '\'' +
                ", group=" + group +
                ", role=" + role +
                '}';
    }
}

