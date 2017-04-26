package abstractClasses;

/**
 * Created by ye on 2017/4/26.
 */
public abstract class Person {

    public abstract String getDescription();
    private String name;

    public Person(String name){

        this.name=name;
    }

    public String getName(){

        return name;
    }
}
