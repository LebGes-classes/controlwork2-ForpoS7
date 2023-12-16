import java.util.Scanner;

public abstract class Human{
    Scanner scan = new Scanner(System.in);
    private String fullName;
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setInfo () {
        System.out.println("Задайте полное имя: ");
        setFullName(scan.nextLine());
    }
    public void getInfo () {
        System.out.println("Имя: " + getFullName());
    }
}
