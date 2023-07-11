package firstJavaHomework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> classes = new HashMap<>(); 

        addStudentsToClasses(classes, "9/F", "Gizem Kısa");
        addStudentsToClasses(classes, "12/A", "Korhan Zehmeri");
        addStudentsToClasses(classes, "11/B", "Nalan Beşbacak");
        addStudentsToClasses(classes, "10/E", "Ayla Karagül");
        addStudentsToClasses(classes, "12/A", "Fatma Şen");
        addStudentsToClasses(classes, "9/D", "Pakize Toy");
        addStudentsToClasses(classes, "11/K", "Adnan Ziyagil ");
        addStudentsToClasses(classes, "12/F", "Nuran Tatlı");
        addStudentsToClasses(classes, "9/E", "İlkkan Gibi");
        addStudentsToClasses(classes, "12/C", "Siyan Sayan");

        List<String> finishWithAn = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry : classes.entrySet()) {
            String clas = entry.getKey();
            List<String> students = entry.getValue();

            for (String student : students) {
                String[] studentParts = student.split(" ");
                String endWord = studentParts[studentParts.length - 2];
                if (endWord.toLowerCase().endsWith("an")) {
                    finishWithAn.add(student + " (" + clas + ")");
                }
            }
        }

        System.out.println("Sonu 'an' ile biten öğrenciler ve sınıf bilgileri:");
        for (String student : finishWithAn) {
            System.out.println(student);
        }
    }

    public static void addStudentsToClasses(Map<String, List<String>> classes, String clas, String student) {
        List<String> students = classes.getOrDefault(clas, new ArrayList<>());
        students.add(student);
        classes.put(clas, students);
    }
}
