public class Main<makingPalindrome> {
    public static void main(String[] args) {


        int plusnumber = 0;


        int count = 0;
        for (int i = 11; i <= 100; i++) {
            count = 0;
            if (isPalindrom(i) == true) {
                System.out.println(i + " " + count);
            } else if (isPalindrom(i) == false) {
                plusnumber = i + reverseNumber(i);
                if (isPalindrom(plusnumber) == true) {
                    count = 1;
                    System.out.println(i + "  " + count);
                }
            }else if (isPalindrom(i) == false) {
                plusnumber = i + reverseNumber(i);
                if (isPalindrom(plusnumber) == true) {
                    count = 2;
                    System.out.println(i + "  " + count);
                }
            }else if (isPalindrom(i) == false) {
                plusnumber = i + reverseNumber(i);
                if (isPalindrom(plusnumber) == true) {
                    count = 3;
                    System.out.println(i + "  " + count);
                }
            }else if (isPalindrom(i) == false) {
                plusnumber = i + reverseNumber(i);
                if (isPalindrom(plusnumber) == true) {
                    count = 4;
                    System.out.println(i + "  " + count);
                }
            }else if (isPalindrom(i) == false) {
                plusnumber = i + reverseNumber(i);
                if (isPalindrom(plusnumber) == true){
                    count = 5;
                System.out.println(i + "  " + count);

            }
}

            System.out.println(count);
        }

    }

    static boolean isPalindrom(int number) {
        int temporarynumber = number;
        int reversenumber = 0, lastnumber;
        while (temporarynumber != 0) {
            lastnumber = temporarynumber % 10;
            reversenumber = (reversenumber * 10) + lastnumber;
            temporarynumber /= 10;

        }

        if (number == reversenumber)
            return true;
        else
            return false;

    }

    static int reverseNumber(int number) {
        int temporarynumber = number;
        int reversenumber = 0, lastnumber;
        while (temporarynumber != 0) {
            lastnumber = temporarynumber % 10;
            reversenumber = (reversenumber * 10) + lastnumber;
            temporarynumber /= 10;

        }


        return reversenumber;

    }


}