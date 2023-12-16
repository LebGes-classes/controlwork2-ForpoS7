public class Posetitel extends Human {
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setInfo () {
        super.setInfo();
        System.out.println("Задайте возраст покупателя: ");
        setAge(scan.nextInt());
    }
    public void getInfo () {
        super.getInfo();
        System.out.println("Возраст: " + getAge());
    }
}
