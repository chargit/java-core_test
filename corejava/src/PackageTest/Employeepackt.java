package PackageTest;

import java.time.*;
//import statements come after the package statement

/**
 * the classes in this file are part of this package
 * Created by ye on 2017/4/25.
 */
public class Employeepackt {

    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employeepackt(String name, double salary, int year, int month, int day){

        this.name=name;
        this.salary=salary;
        hireDay=LocalDate.of(year,month,day);
    }

    public String getName(){

        return name;
    }

    public double getSalary(){

        return salary;
    }

    public LocalDate getHireDay(){

        return hireDay;
    }

    public void raiseSalary(double byPercent){

        double raise = salary*byPercent/100;
        salary += raise;

    }

}
