package student;
public class Q31b {
    String name;
    String matricNo;
    double score;

    // Constructor
    public Q31b(String name, String matricNo, double score) {
        this.name = name;
        this.matricNo = matricNo;
        this.score = score;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Matric Number: " + matricNo);
        System.out.println("Score: " + score);
    }
}
