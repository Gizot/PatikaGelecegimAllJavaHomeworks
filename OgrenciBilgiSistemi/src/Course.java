public class Course {
    Teacher teacher;
     String name;
     String code;
     String prefix;
     int note;
     int quize;

     Course(String name, String code, String prefix){
         this.name = name;
         this.code = code;
         this.prefix = prefix;
         this.teacher = teacher;
         int note = 0;
         int quiz =0;
     }

     void addTeacher(Teacher teacher){
         if(teacher.branch.equals(this.prefix)){
             this.teacher = teacher;
         } else{
             System.out.println("Öğretmen branşı ile ders bölümleri uyuşmuyor!");
         }
     }

     void printTeacher(){

         this.teacher.print();
     }




}
