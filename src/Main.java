// The main class will be performing arithmetic performance.
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Scanner object 1 for user input.
        Scanner sc = new Scanner(System.in);

        // This stores the input by the
        ArrayList<Integer> Ns = new ArrayList<>();

        //
        for (int i = 0; i < 3;i++ ){
            int N1 = sc.nextInt();
            Ns.add(N1);
        }

        System.out.println(Ns);
    }
}