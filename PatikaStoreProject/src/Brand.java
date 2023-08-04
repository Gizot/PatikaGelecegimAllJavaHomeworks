import java.util.TreeSet;

public class Brand {
    TreeSet<String> brand = new TreeSet<>();

    public  void BrandAdd(){
        brand.add("Samsung");
        brand.add("Lenovo");
        brand.add("Apple");
        brand.add("Huawei");
        brand.add("Casper");
        brand.add("Asus");
        brand.add("HP");
        brand.add("Xiaomi");
        brand.add("Monster");
    }

    public void BrandYazdır(){
        BrandAdd();
        System.out.println("Markalarımız");
        System.out.println("------------");
        for (String i : brand){
            System.out.println(i);
        }
    }
}
