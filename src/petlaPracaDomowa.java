public class petlaPracaDomowa {
    public static void main(String[] args) {
        System.out.println("Wypiszmy liczby podzielne przez 3 mniejsze niż 100");
        for(int i = 1; i < 100; i++){
            if(i%3==0) {
                System.out.println(i);
            }
        }
        System.out.println("Przejdźmy to odwracania kolejności tablicy za pomocą pętli");
        System.out.println("Weźmy tablicę: ");
        int[] tablica = new int[]{1,2,3};
        for(int i = 0; i < (tablica.length/2); i++) {
            int wartoscPomocnicza = tablica[i];
            tablica[i] = tablica[2-i];
            tablica[2-i] = wartoscPomocnicza;
        }
        for(int i = 0; i < tablica.length; i++){
            System.out.println(tablica[i]);
        }

    }
}
