public class Array {
    public void tekEdedlerinSayi() {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int say = 0;
        for(int eded:array){
            if (eded % 2!=0){
                say++;
            }
        }
        System.out.println("Tək ədədlərin sayı:" + say);
    }

}
