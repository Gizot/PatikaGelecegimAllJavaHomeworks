public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes,Course c1,Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1,int note2,int note3){
        if(note1>=0 && note1<=100) {
            c1.note = note1;
        }
        if (note2>=0 && note2<=100) {
            c2.note=note2;
        }
        if(note3>=0 && note3<=100){
            c3.note=note3;
        }
    }

    //Ortalamaya etki edecek olan quiz notlarının 0 ile 100 aralığındaysa
    //hesaplara dahil edilmesi sağlandı.
    void addBulkQuizeNote(int quize1, int quize2, int quize3){
        if (quize1>=0 && quize1<=100) {
            c1.quize = quize1;
        }
        if (quize2>=0 && quize2<=100) {
            c2.quize = quize2;
        }
        if (quize3>=0 && quize3<=100) {
            c3.quize = quize3;
        }


    }

//İlgili derse ait ders notu ve quize (sözlü) puanlarının ortalamaya etkisi ve ortalama nu fonksiyonda hesaplandı.
    // Ortalama 55 puanın üzerindeyse sınıfı geçti değilse kaldı olacak şekilde hesaplama gerçekleştirildi.
    void isPass(){
        System.out.println("==========================================");
        this.average = (((this.c1.note*0.80)+(this.c1.quize*0.20)) + ((this.c2.note*0.80) +(this.c2.quize*0.20)) + ((this.c3.note*0.80) + (this.c3.quize * 0.20))) / 3.0;
        if (this.average > 55) {
            System.out.println("Hababam sınıfı uyanıyor!");
            this.isPass=true;
        }else {
            System.out.println("Hababam sınıfı sınıfta kaldı!");
            this.isPass=false;
        }
        printNote();
    }

    //Quize ve Note görüntülerinin konsola yansıtılması işlemi burada gerçekleştirildi.
    void printNote(){
        System.out.println(this.c1.name + "Notu\t:" + this.c1.note);
        System.out.println(this.c1.name + "Quize Notu\t:" + this.c1.quize);
        System.out.println(this.c2.name + "Notu\t:" + this.c2.note);
        System.out.println(this.c2.name + "Quize Notu\t:" + this.c2.quize);
        System.out.println(this.c3.name + "Notu:" + this.c3.note);
        System.out.println(this.c3.name + "Quize Notu:" + this.c3.quize);
        System.out.println("Ortalamanız :" + this.average);
    }

}
