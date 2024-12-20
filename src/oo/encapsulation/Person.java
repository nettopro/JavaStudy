package oo.encapsulation;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age){
        setName(name);
        setSurname(surname);
        setAge(age);
    }

    // Getter
    public int getAge() {
        return age;
    }
    // Setter
    public void setAge(int age) {
        age = Math.abs(age);

        if(age >= 0 && age<120){
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFullName(){
        return getName() + " " + getSurname();
    }

    @Override
    public String toString() {
        return "Hello I am " + getName() + " and I'm " + getAge() + " years old.";
    }

}
