package by.yakovtsev.aleksandr;

import by.yakovtsev.aleksandr.model.Auto;
import by.yakovtsev.aleksandr.model.User;
import by.yakovtsev.aleksandr.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("Masha",26);
        userService.saveUser(user);
        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(user);
        user.addAuto(ferrari);
//        user.setName("Misha");
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);
    }

}
