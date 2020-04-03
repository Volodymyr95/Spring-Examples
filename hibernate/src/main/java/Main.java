import entity.Teacher;
import service.TeacherService;

public class Main {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();

        teacherService.add(new Teacher("John","Doe"));
    }
}
