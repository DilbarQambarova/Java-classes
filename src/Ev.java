public class Ev {
    static int otaqSayi;
    int mertebeSayi;
    public Ev(int otaqSayi, int mertebeSayi) {
        this.mertebeSayi = mertebeSayi;
        this.otaqSayi = otaqSayi;
    }
    public Ev() {
    }
    public void print(){
        System.out.println("Evin otaqlarının sayı:"  + " " + this.otaqSayi + " " +
                            "Evin mərtəbə sayı:" + " " + this.mertebeSayi);

        }
            }

