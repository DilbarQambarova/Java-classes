public class tasklar2 {
    public static void main(String[] args) {
        int a = 23;
        int cem = 0;
        int hasil = 1;


        while (a != 0) {
            int reqem = a % 10;
            cem += reqem;
            hasil *= reqem;
            a /= 10;
        }
        System.out.println("Cem" + cem + " " + "Hasil" + hasil);




    }
}