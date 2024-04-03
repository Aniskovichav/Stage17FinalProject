package by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user;

public class Group {
    private String name;
    private boolean isAdmin;
    private User groupAdmin;

    // Конструкторы, геттеры, сеттеры

    public Group() {
    }

    public Group(String name, boolean isAdmin, User groupAdmin) {
        this.name = name;
        this.isAdmin = isAdmin;
        this.groupAdmin = groupAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public User getGroupAdmin() {
        return groupAdmin;
    }

    public void setGroupAdmin(User groupAdmin) {
        this.groupAdmin = groupAdmin;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", isAdmin=" + isAdmin +
                ", groupAdmin=" + groupAdmin +
                '}';
    }
}
