public class DualSpinner {

    private int turn = 0;
    /** Precondition: min < max
     */
    /*The spin method simulates a spin of a fair spinner.
     * The method returns a random integer between min and max,
     * inclusive. Complete the spin method below by assigning
     * this random integer to result.
     */
    public int spin(int min, int max)
    {

        int result= (int) (Math.random() * (max-min)) + min;

        return result;
    }

    /** Simulates one round of the game as described in part (b).
     */
    public void playRound()
    {
        int player = spin(1, 10);

        int computer = spin(2,8);
        System.out.println("Player: " + player + ", Computer: " + computer );

        if (player > computer) {
            System.out.println("You win! " + (player - computer) + " points");
            turn = 0;
        } else if (computer > player) {
            System.out.println("You lose. " + (player - computer) + " points");
            turn = 0;
        } else if (computer == player) {
            System.out.println("Spinning Again");
            turn++;
            playRound();
        } else {
            System.out.println("Tie. 0 points");
        }
    }

    public static void main(String[] args) {
        DualSpinner ds = new DualSpinner();
        for(int i = 0; i < 10; i++){
            ds.playRound();
        }
    }
}