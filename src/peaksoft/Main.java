package peaksoft;

import java.security.Provider;
import java.util.Arrays;

public class Main {
    /**
     * Задача ServiceImpl'дын ичиндеги методтоду ишке ашыруу керек
     * <p>
     * 1 - метод бул студенти id полясы менен табып и ошол студентин атын и фамилиясын озгортуу
     * 2 - метод бул студенти id полясы менен табып консолго чыгаруу
     * 3 - метод boolean кайтарат эгер биз издеген ат болсо
     * 4 - метод биз берген жаштын санын чыгарат
     * 5 - бул баардык студенттерди чыгаруу
     * <p>
     * Баардык методторду Майн класстан чыкырып иштетуу керек
     * <p>
     * Cтуденттердин обьектилерин Майн класстан тузуп SerivceImpl классынын ичиндеги поляга конструктор аркылуу салсаныз болот
     * <p>
     * 1 - жана 2 методтто Id полясы менен таппай калса анда анда - мындай студент жок деп чыгуусу керек
     * <p>
     * Методтордун атын кайтаруу тибин параметрин озгортууго болбойт
     * <p>
     * *
     */
    public static void main(String[] args) {
        Student student = new Student(1l, "Nurchik", "Akbaraliev", 2005);

        Student[] students = new Student[]{student};
        Servicimple service = new Servicimple(students);


        System.out.println(service.updateStudent(student.getId(), student.getName(), student.getLastName()));
        System.out.println(service.getStudentById(student.getId()));
        System.out.println(service.getName(student.getName()));
        System.out.println(service.getCountAge(student.getAge()));
        System.out.println(Arrays.toString(service.getAllStudents()));

    }

}