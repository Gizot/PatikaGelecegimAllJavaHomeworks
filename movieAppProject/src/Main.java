import model.Category;
import model.Film;
import service.AdminService;
import service.UserService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Film> filmList = new ArrayList<>();
        List<Category> categoryList = new ArrayList<>();
        AdminService admin = new AdminService();
        UserService userService = new UserService();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("***** SELECT USER OR ADMIN *****" +
                    "\nFor Admin: 1\nFor User: 2\nFor EXIT: 3 \n Press one of the keys");
            int inputNum = Integer.parseInt(input.nextLine());

            switch (inputNum) {
                case 1 -> admin.asAdmin(filmList, categoryList, input);
                case 2 -> userService.asUser(categoryList, filmList, input);
                case 3 -> System.exit(0);
                default -> System.out.println("You have entered incorrectly, please be more careful!");
            }
        }
    }
}