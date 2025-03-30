package exceptions;

public class Student {
    public final String name;
    public final double grade;
    
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public double getGrade() {
        return grade;
    }

    public String toString(){
        return name + " has grade " + grade;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(grade);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(grade) != Double.doubleToLongBits(other.grade))
            return false;
        return true;
    }
}