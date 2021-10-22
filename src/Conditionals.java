public class Conditionals {

    private static boolean chimpTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile || !aSmile && !bSmile) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean negPos(int num1, int num2, boolean negative) {
        if (negative) {
            if (num1 < 0 && num2 < 0) {
                return true;
            } else {
                return false;
            }
        } else if (num1 > 0 && num2 < 0 || num1 < 0 && num2 > 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(!isAsleep) {
            if (isMorning) {
                if (isMom) {
                    return  true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        else {
            return false;
        }
    }

    private static String setAlarm(int day, boolean onVacation) {
            if(day > 0 && day < 6) {
                if (!onVacation) { return "7:00"; }
                else { return "10:00"; }
            } else {
                if (!onVacation) { return "10:00"; }
                else { return "off"; }
            }
    }

    private static boolean onesDigitSame(int a, int b, int c) {
        if (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10) {
            return true;
        } else {
            return false;
        }
    }

    private static int blackjack(int card1, int card2) {
        int dist1 = 21 - card1; //3
        int dist2 = 21 - card2; //-1
        if (!(dist1 < 0 && dist2 < 0)) {
            if (dist1 < dist2 || dist2 < 0) { return card1; }
            else if (dist2 < dist1 || dist1 < 0) { return card2; }
            else {
                //Returns card1 since they are equal anyway in this case
                return card1;
            }
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(chimpTrouble(true, true));
        System.out.println(chimpTrouble(true, false));
        System.out.println(chimpTrouble(false, true));
        System.out.println(chimpTrouble(false, false));

        System.out.println(" ");

        System.out.println(negPos(1, -1, false));
        System.out.println(negPos(-1, 1, false));
        System.out.println(negPos(1, 1, false));
        System.out.println(negPos(-1, -1, false));
        System.out.println(negPos(-4, -5, true));
        System.out.println(negPos(-4, 5, true));
        System.out.println(negPos(4, 5, true));
        System.out.println(negPos(4, -5, true));

        System.out.println(" ");

        System.out.println(pickUpPhone (false, false, true));
        System.out.println(pickUpPhone (true, true, true));
        System.out.println(pickUpPhone (true, true, false));
        System.out.println(pickUpPhone (false, true, false));
        System.out.println(pickUpPhone (true, false, false));
        System.out.println(pickUpPhone (false, false, false));

        System.out.println(" ");

        System.out.println(setAlarm(1, false));
        System.out.println(setAlarm(5, false));
        System.out.println(setAlarm(0, false));
        System.out.println(setAlarm(2, true));
        System.out.println(setAlarm(4, true));
        System.out.println(setAlarm(6, true));

        System.out.println(" ");

        System.out.println(onesDigitSame(23, 19, 13));
        System.out.println(onesDigitSame(23, 19, 12));
        System.out.println(onesDigitSame(23, 19, 3));
        System.out.println(onesDigitSame(423, 13, 3));
        System.out.println(onesDigitSame(23, 29, 25));

        System.out.println(" ");

        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
        System.out.println(blackjack(8, 8));
        System.out.println(blackjack(25, 24));
    }
}
