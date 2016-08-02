public class RomanNumerals {

    public static String inputFromTest (int Number) {

        String RN = "";
        System.out.println(RN);

    while  (Number > 0 ) {
        if (Number >= 1000) {
            RN = RN + "M";
            Number -= 1000;
        } else if(Number == 900) {
            RN = RN + "CM";
            Number -= 900;
        } else if(Number >= 500) {
            RN = RN + "D";
            Number -= 500;
        } else if(Number == 400) {
            RN = RN + "XL";
            Number -= 400;
        } else if(Number >= 100) {
            RN = RN + "C";
            Number -= 100;
        } else if(Number == 90) {
            RN = RN + "XC";
            Number -= 90;
        } else if(Number >= 50) {
            RN = RN + "L";
            Number -= 50;
        } else if(Number >= 10) {
            RN = RN + "X";
            Number -= 10;
        } else if (Number == 9) {
            RN = RN + "IX";
            Number -= 9;
        } else if (Number >= 5) {
            RN = RN + "V";
            Number -= 5;
        } else if (Number == 4) {
            RN = RN + "IV";
            Number -= 4;
        } else if (Number >= 1) {
            RN = RN + "I";
            Number -= 1;
        }
    }
        return RN;
    }
}