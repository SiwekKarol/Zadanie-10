public class Main {

    public static void main(String[] args) {
        System.out.println("Początek pętli while");
        double i = 0;
        while (i < 31) {
            System.out.println(i/10);
            i++;
        }

        System.out.println("Koniec pętli while");
        System.out.println("Początek pętli do while");
        double y = 0;
        do{
            System.out.println(y/10);
            y++;
        } while (y < 31);
        System.out.println("Koniec pętli do while");
    }
}
