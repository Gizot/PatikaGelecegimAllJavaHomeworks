public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mahmut Hoca", "01111110980","TRH");
        Teacher teacher2 = new Teacher("Graham Bell", "05555","FZK");
        Teacher teacher3 = new Teacher("Külyutmaz", "11111","BIO");

        Course tarih = new Course("Tarih", "101", "TRH" );
        tarih.addTeacher(teacher1);

        Course fizik = new Course("Fizik", "102","FZK");
        fizik.addTeacher(teacher2);

        Course biyo = new Course("Biyoloji", "101","BIO");
        biyo.addTeacher(teacher3);

        Student s1 = new Student("İnek Şaban", "123", "4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,100,50);
        s1.addBulkQuizeNote(80,80,80);
        s1.isPass();


        Student s2 = new Student("Güdük Necmi", "789", "4",tarih,fizik,biyo);
        s2.addBulkExamNote(80,80,80);
        s2.addBulkQuizeNote(80,80,80);
        s1.isPass();

    }
}