package work_shop_01;

public class Student {

    private String name;
    private String className;
    private Integer id;
    private Integer age;

    public Student() {
    }

    public Student(String name, String className, Integer id, Integer age) {
        this.name = name;
        this.className = className;
        this.id = id;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

}
