package by.itstep.aniskovich.java.stage17.lunchdelivery.model.logic;

import by.itstep.aniskovich.java.stage17.lunchdelivery.old.ProductOld;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user.User;
import by.itstep.aniskovich.java.stage17.lunchdelivery.model.entity.user.UserRole;

import java.util.List;

public class MenuService {
    public void createMenu(User admin, List<ProductOld> products) {
        if (admin.getRole() == UserRole.ADMIN) {
            // Логика создания меню
        } else {
            throw new IllegalStateException("Only admins can create menus");
        }
    }

}

