import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int n = 0;
        int m = 0;
        int position = 0;
        boolean win = false;
        while (T-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            Queue<Integer> CurrentStep = new LinkedList<>();
            Queue<Integer> nextStep = new LinkedList<>();
            ArrayList<Integer> previousStep = new ArrayList<>();
            int[] numArray = new int[n];

            for (int i = 0; i < n; ++i) {
                numArray[i] = sc.nextInt();
            }

            CurrentStep.add(0);

            while (CurrentStep.size() > 0) {
                nextStep.clear();
                win = false;
                for (int v : CurrentStep) {
                    if (v + m >= numArray.length || v + 1 >= numArray.length) {
                        win = true;
                        break;
                    }

                    if (numArray[v + m] == 0 && previousStep.indexOf(v + m) < 0) {
                        nextStep.add(v + m);
                        if (v + m > n - 1) {
                            win = true;
                            break;
                        }
                    }

                    if (v != 0 && numArray[v - 1] == 0 && previousStep.indexOf(v - 1) < 0) {
                        nextStep.add(v - 1);
                    }

                    if (numArray[v + 1] == 0 && previousStep.indexOf(v + 1) < 0) {
                        nextStep.add(v + 1);
                        if (v + 1 > n - 1) {
                            win = true;

                            break;
                        }
                    }
                }

                if (win == true) break;

                previousStep.addAll(CurrentStep);

                CurrentStep.clear();

                CurrentStep.addAll(nextStep);
            }

            if (win == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}