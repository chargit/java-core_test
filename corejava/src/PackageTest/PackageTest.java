package PackageTest;
import static java.lang.System.*;
/**
 * the Employee class is defined in that package
 * Created by ye on 2017/4/25.
 */
public class PackageTest {

    public static void main(String[] args){

        //because of the import statement, we don't have to use
        //Employee here
        Employeepackt harry = new Employeepackt("Harry Hacker",50000,1989,10,1);

        harry.raiseSalary(5);

        //because of the static import statement, we don't have to use System.out here
        out.println("name="+harry.getName()+",salary="+harry.getSalary());


    }
}
