public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        boolean first = true;
        int[] arrOfInt = new int[]{1, 2, 3};
        float[] arrOfFloat = new float[]{1.57F, 7.654F, 9.986F};
        String[] arrOfString = new String[]{"Hello", "world", "!"};
        ////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nЗадача 2.");

        for (int i : arrOfInt) {
            if (!first) {
                System.out.print(", ");
            }
            first = false;
            System.out.print(i);
        }
        System.out.print("\n");
        first = true;
        for (float i : arrOfFloat) {
            if (!first) {
                System.out.print(", ");
            }
            first = false;
            System.out.print(i);
        }
        System.out.print("\n");
        first = true;
        for (String i : arrOfString) {
            if (!first) {
                System.out.print(", ");
            }
            first = false;
            System.out.print(i);
        }
        System.out.print("\n");
        ////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nЗадача 3.");
        first = true;
        for (int i = arrOfInt.length - 1; i >= 0; i--) {
            if (!first) {
                System.out.print(", ");
            }
            first = false;
            System.out.print(arrOfInt[i]);
        }
        System.out.print("\n");
        first = true;
        for (int i = arrOfFloat.length - 1; i >= 0; i--) {
            if (!first) {
                System.out.print(", ");
            }
            first = false;
            System.out.print(arrOfFloat[i]);
        }
        System.out.print("\n");
        first = true;
        for (int i = arrOfString.length - 1; i >= 0; i--) {
            if (!first) {
                System.out.print(", ");
            }
            first = false;
            System.out.print(arrOfString[i]);
        }
        System.out.print("\n");
        ////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nЗадача 4.");
        first = true;
        for (int i = 0; i < arrOfInt.length; i++) {
            if (!first) {
                System.out.print(", ");
            }
            first = false;
            if ((arrOfInt[i] & 1) != 0) {
                arrOfInt[i]++;
            }
            System.out.print(arrOfInt[i]);
        }
        System.out.print("\n");
    }
}