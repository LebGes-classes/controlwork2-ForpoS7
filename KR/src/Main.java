public class Main {
    public static void main(String[] args) {
        Shop myShop = new Shop();

        for (int i = 0; i < myShop.getKolvoStr(); i++) {
            myShop.getSotrudniks()[i] = new Sotrudnik();
            myShop.getSotrudniks()[i].setInfo();
            myShop.getSotrudniks()[i].getInfo();
        }
        for (int i = 0; i < myShop.getKolvoPos(); i++) {
            myShop.getPosetitels()[i] = new Posetitel();
            myShop.getPosetitels()[i].setInfo();
            myShop.getPosetitels()[i].getInfo();
        }
    }
}
