package model;

public class Student {
    private String name;
    private int age;
    private String gender;
    private int id;

    public Student(String name, int age, String gender, int id){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Student st = new Student("Alice", 22, "female", 1);
        System.out.println("Name:" + st.getName());
        System.out.println("Age:" + st.getAge());
        System.out.println("Gender:" + st.getGender());
        System.out.println("ID:" + st.getId());
    }

}
