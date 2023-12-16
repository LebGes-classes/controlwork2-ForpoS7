import java.util.Scanner;

public class Shop {
    Scanner scan = new Scanner(System.in);
    private int kolvoStr = 1;
    private int kolvoPos = 2;

    public int getKolvoStr() {
        return kolvoStr;
    }

    public void setKolvoStr(int kolvoStr) {
        this.kolvoStr = kolvoStr;
    }

    public int getKolvoPos() {
        return kolvoPos;
    }

    public void setKolvoPos(int kolvoPos) {
        this.kolvoPos = kolvoPos;
    }

    private Sotrudnik [] sotrudniks = new Sotrudnik[kolvoStr];
    private Posetitel [] posetitels = new Posetitel[kolvoPos];
    public Sotrudnik[] getSotrudniks() {
        return sotrudniks;
    }
    public void setSotrudniks(Sotrudnik[] sotrudniks) {
        this.sotrudniks = sotrudniks;
    }
    public Posetitel[] getPosetitels() {
        return posetitels;
    }
    public void setPosetitels(Posetitel[] posetitels) {
        this.posetitels = posetitels;
    }
}
