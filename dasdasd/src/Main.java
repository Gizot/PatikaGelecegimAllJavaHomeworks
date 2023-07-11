import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static AdminService adminService = new AdminService();
    private static CategoryService categoryService = new CategoryService();
    private static CustomerService customerService = new CustomerService();

    public static void main(String[] args) {
        System.out.println("Sinema Salonu Yönetim Sistemine Hoş Geldiniz!");
        System.out.println("Lütfen giriş yapmak istediğiniz kullanıcı tipini seçin: (admin/user/exit)");
        String userType = scanner.nextLine();

        if (userType.equalsIgnoreCase("admin")) {
            adminMenu();
        } else if (userType.equalsIgnoreCase("user")) {
            userMenu();
        } else if (userType.equalsIgnoreCase("exit")) {
            System.out.println("Programdan çıkılıyor...");
            return;
        } else {
            System.out.println("Geçersiz kullanıcı tipi! Programdan çıkılıyor...");
            return;
        }
    }

    private static void adminMenu() {
        while (true) {
            System.out.println("\nADMIN MENÜ");
            System.out.println("1. Kategori Ekle");
            System.out.println("2. Platform Bilgisi Ekle");
            System.out.println("3. Film Bilgisi Ekle");
            System.out.println("4. Çıkış");

            System.out.print("Seçiminizi yapın: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Önceki satırın boşluğunu temizle

            switch (choice) {
                case 1:
                    addCategory();
                    break;
                case 2:
                    addPlatform();
                    break;
                case 3:
                    addFilm();
                    break;
                case 4:
                    System.out.println("Admin menüsünden çıkılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız!");
            }
        }
    }

    private static void addCategory() {
        System.out.print("Kategori Adı: ");
        String categoryName = scanner.nextLine();

        Category category = new Category(categoryName);
        categoryService.addCategory(category);

        System.out.println("Kategori başarıyla eklendi!");
    }

    private static void addPlatform() {
        System.out.print("Platform Adı: ");
        String platformName = scanner.nextLine();

        Platform platform = new Platform(platformName);
        adminService.addPlatform(platform);

        System.out.println("Platform bilgisi başarıyla eklendi!");
    }

    private static void addFilm() {
        System.out.print("Film Adı: ");
        String filmName = scanner.nextLine();

        System.out.print("Yönetmen: ");
        String director = scanner.nextLine();

        System.out.print("Vizyon Tarihi: ");
        String releaseDate = scanner.nextLine();

        Film film = new Film(filmName, director, releaseDate);

        List<Category> categories = categoryService.getCategories();
        System.out.println("Kategoriler:");
        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i+1) + ". " + categories.get(i).getCategoryName());
        }
        System.out.print("Film Kategorisi (1-" + categories.size() + "): ");
        int categoryIndex = scanner.nextInt();
        scanner.nextLine(); // Önceki satırın boşluğunu temizle

        if (categoryIndex >= 1 && categoryIndex <= categories.size()) {
            Category selectedCategory = categories.get(categoryIndex - 1);
            film.setCategory(selectedCategory);
            selectedCategory.incrementMovieCount();

            List<Platform> platforms = adminService.getPlatforms();
            System.out.println("Platformlar:");
            for (int i = 0; i < platforms.size(); i++) {
                System.out.println((i+1) + ". " + platforms.get(i).getPlatformName());
            }
            System.out.print("Film Platformu (1-" + platforms.size() + "): ");
            int platformIndex = scanner.nextInt();
            scanner.nextLine(); // Önceki satırın boşluğunu temizle

            if (platformIndex >= 1 && platformIndex <= platforms.size()) {
                Platform selectedPlatform = platforms.get(platformIndex - 1);
                film.setPlatform(selectedPlatform);
                selectedPlatform.incrementFilmCount();

                System.out.println("Film başarıyla eklendi!");

                // Session bilgilerini eklemek için kodu buraya ekleyebilirsiniz.
                // film.addSession(...);
            } else {
                System.out.println("Geçersiz platform seçimi!");
            }
        } else {
            System.out.println("Geçersiz kategori seçimi!");
        }
    }

    private static void userMenu() {
        // Kullanıcı menüsünü burada oluşturabilirsiniz.
    }
}