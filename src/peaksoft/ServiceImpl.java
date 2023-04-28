package peaksoft;

public class ServiceImpl implements Service {
    private Student[] students = new Student[10];

    public ServiceImpl(Student[] students) {
        this.students = students;
    }

    @Override
    public void updateStudent(Long id, String name, String lastName) {

    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }

    @Override
    public Boolean getName(String name) {
        return null;
    }

    @Override
    public int getCountAge(int age) {
        return 0;
    }

    @Override
    public Student[] getAllStudents() {
        return new Student[0];
    }
}
