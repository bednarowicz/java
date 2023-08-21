public class Tablice {
    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Bartek";
        imiona[1] = "Basia";
        imiona[2] = "Michał";
        for (int i = 0; i < imiona.length; i++) {
            System.out.println(imiona[i]);

        }

        int[] lottoNumbers = new int[]{1,2,3,4,5,6};
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.println(lottoNumbers[i]);
        }

    }
}
