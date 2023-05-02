package peaksoft;

public interface Service {
    boolean updateStudent(Long id, String name, String lastName);
    Student getStudentById(Long id);

   boolean getName(String name);

    int getCountAge(int age);

    Student [] getAllStudents();
}
