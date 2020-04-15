import com.lits.entity.Teacher;
import service.TeacherService;

public class HibernateMain {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();

        teacherService.add(new Teacher("John","Doe"));
    }
}
