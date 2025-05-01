//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Service.UserService;
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        /**
         * Example with throw username
         */
        try {
            userService.ValidateUser("Jesus", "donchuy@gmail.com", 19);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}