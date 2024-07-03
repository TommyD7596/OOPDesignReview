public class Student {
	// ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create a setter and a getter
	
	// ToDo 4: Add comments to your code
    private String name;
    private int id;
    private double grade;
    private String major;

    // Constructor
    public Student(String name, int id, double grade, String major) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.major = major;
    }

    // Getters and setters for the fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Override the toString method
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                ", major='" + major + '\'' +
                '}';
 }
}
public class Senior extends Student {
    
    // Constructor
    public Senior(String name, int id, double grade, String major, int credits) {
        super(name, id, grade, major, credits);
        if (credits < 85) {
            throw new IllegalArgumentException("A senior student must have at least 85 credits.");
        }
    }

    // Override the toString method
    @Override
    public String toString() {
        return "Senior{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", grade=" + getGrade() +
                ", major='" + getMajor() + '\'' +
                ", credits=" + getCredits() +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Senior senior = new Senior("Jane Doe", 54321, 3.85, "Engineering", 90);
            System.out.println(senior);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            Senior invalidSenior = new Senior("John Smith", 67890, 3.95, "Mathematics", 80);
            System.out.println(invalidSenior);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
