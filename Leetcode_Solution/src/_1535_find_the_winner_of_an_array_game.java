import java.util.Arrays;

public class _1535_find_the_winner_of_an_array_game {

    public static int getWinner(int[] arr, int k) {
        if (k==1){
            return Math.max(arr[0], arr[1]);
        }
        if (k>=arr.length){
            return Arrays.stream(arr).max().getAsInt();
        }

        int cr_winner = arr[0];
        int cons_win = 0;

        for (int i=1; i<arr.length; i++){
            if (cr_winner > arr[i]){
                cons_win++;
            }
            else{
                cr_winner = arr[i];
                cons_win = 1;
            }

            if (cons_win == k){
                return cr_winner;
            }
        }

        return cr_winner;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,1};
        int k = 6;

        int a = getWinner(arr, k);
        System.out.println(a);
    }
}   