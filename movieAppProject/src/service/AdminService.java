package service;
import model.Category;
import model.Film;
import model.Platform;
import model.DurationTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AdminService {
        public void asAdmin(List<Film> filmList, List<Category> categoryList, Scanner input){
            CategoryService categoryService = new CategoryService();
            List<Category> filmCategoryList = new ArrayList<>();
            List<Platform> filmPlatformList = new ArrayList<>();
            List<DurationTime> filmShowTimeList = new ArrayList<>();

            while(true) { // Kategori döngüsü
                System.out.println("Enter a category name: ");
                String categoryName = input.nextLine();
                Category category;

                if(categoryService.findCategory(categoryList, categoryName)) {
                    category = categoryService.returnCategory(categoryList, categoryName);

                    if(!filmCategoryList.contains(category)) {
                        filmCategoryList.add(category);
                    }
                } else {
                    category = new Category(categoryName);
                    categoryList.add(category);
                    filmCategoryList.add(category);
                }

                System.out.println("Do you want to add another category? (Y/N)");
                String answer = input.nextLine();
                if(answer.equalsIgnoreCase("N")) {
                    break;
                } else if(!answer.equalsIgnoreCase("Y")) {
                    System.out.println("You have entered incorrectly!");
                    break;
                }
                break;

            }

            while (true) {
                System.out.println("Enter the Platform Name");
                String platformName = input.nextLine();
                Platform platform = new Platform(platformName);
                filmPlatformList.add(platform);

                System.out.println("Do you want to add another category? (Y/N)");
                String answer = input.nextLine();

                if(answer.equalsIgnoreCase("Y")) {
                    break;
                } else if(!answer.equalsIgnoreCase("N")) {
                    System.out.println("You have entered incorrectly!");
                    break;
                }
            }

            // Filmin geri kalan bilgilerini al
            System.out.println("Enter the Film Name: ");
            String filmName = input.nextLine();
            System.out.println("Enter the Director Name: ");
            String directorName = input.nextLine();
            System.out.println("Enter the Product Year: ");
            int productionYear = Integer.parseInt(input.nextLine());

            // Seans döngüsü
            while (true) {
                System.out.println("Enter the Session Time");
                String showTime = input.nextLine();
                DurationTime showTimeObj = new DurationTime(showTime);
                filmShowTimeList.add(showTimeObj);

                System.out.println("Do you want to another session time? (Y/N)");
                String answer = input.nextLine();

                if(answer.equalsIgnoreCase("N")) {
                    break;
                } else if(!answer.equalsIgnoreCase("Y")) {
                    System.out.println("You have entered incorrectly!");
                    break;
                }
            }


            Film film = new Film(filmCategoryList, filmPlatformList, filmName, directorName, productionYear, filmShowTimeList);
            filmList.add(film);
            categoryService.updateCategoryFilmCount(filmList, filmCategoryList);
            System.out.print("\n");
        }
    }

