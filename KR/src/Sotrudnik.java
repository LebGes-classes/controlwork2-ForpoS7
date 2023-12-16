import java.util.Scanner;

public class Sotrudnik extends Human {
    private String dolzhnost;
    public String getDolzhnost() {
        return dolzhnost;
    }
    public void setDolzhnost(String dolzhnost) {
        this.dolzhnost = dolzhnost;
    }
    public void setInfo () {
        super.setInfo();
        System.out.println("Задайте должность сотрудника: ");
        setDolzhnost(scan.nextLine());
    }
    public void getInfo () {
        super.getInfo();
        System.out.println("Должность: " + getDolzhnost());
    }
}
