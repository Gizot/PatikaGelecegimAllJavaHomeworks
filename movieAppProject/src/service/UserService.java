package service;
import model.Category;
import model.Film;
import model.Platform;
import model.DurationTime;
import java.util.List;
import java.util.Scanner;
public class UserService {

        public void asUser(List<Category> categoryList, List<Film> filmList, Scanner input) {

            System.out.println("\nSelect the category you want to view: ");
            for (int i = 0; i < categoryList.size(); i++) {
                System.out.println((i + 1) + ". " + categoryList.get(i).getCategoryName() + " (" + categoryList.get(i).getFilmCount() + " film)");
            }
            int categoryNum = Integer.parseInt(input.nextLine());
            Category category = categoryList.get(categoryNum - 1);
            System.out.println("\n" + "In the category of \" " +category.getCategoryName() + " \"" + category.getFilmCount() + " film bulunmaktadır.");

            for (Film film : filmList) {

                for (Category filmCategory : film.getCategoryList()) {

                    if (filmCategory.getCategoryName().equals(category.getCategoryName())) {

                        System.out.println("\nFilm Name: " + film.getFilmName());
                        System.out.println("Director Name: " + film.getDirectorName());
                        System.out.println("Production Year: " + film.getPublishYear());
                        System.out.print("Categories: ");

                        for (Category filmCategory1 : film.getCategoryList()) {
                            System.out.print(filmCategory1.getCategoryName() + ", ");
                        }
                        System.out.print("\n");
                        System.out.print("Platforms: ");

                        for (Platform filmPlatform : film.getPlatformList()) {
                            System.out.print(filmPlatform.getPlatformName() + ", ");
                        }

                        System.out.print("\n");
                        System.out.print("Running Hours: ");
                        for (DurationTime filmShowTime : film.getShowHours()) {
                            System.out.print(filmShowTime.getHour() + ", ");
                        }
                        System.out.print("\n");
                    }
                }
            }
            System.out.print("\n");
        }
}

