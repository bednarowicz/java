public class StudentChecker {
    public static void main(String[] args) {
        int iloscStudentow = 3;
        Student[] tablicaStudentow = new Student[iloscStudentow];
        System.out.println(Student.nazwaUczelni);

        Student.infoUczelnia();

        for (int i = 0; i< iloscStudentow;  i++ ){
            tablicaStudentow[i] = new Student();
            tablicaStudentow[i].imie = ("Imie nr " + i);
            tablicaStudentow[i].nazwisko = ("Nazwisko nr " + i);
            tablicaStudentow[i].nick = ("nick nr " + i);
            tablicaStudentow[i].email = ("email nr " + i);
            tablicaStudentow[i].numerIndeksu = 1424 + i;
            tablicaStudentow[i].nazwaUczelni = String.valueOf(i);

        }

        for (int i = 0; i<iloscStudentow; i++){
            tablicaStudentow[i].przedstawSie();
            tablicaStudentow[i].zalogujSie();
            tablicaStudentow[i].podajNrIndeksu();
            tablicaStudentow[i].podajEmail();
            System.out.println(tablicaStudentow[i].nazwaUczelni);
        }
    }

}
