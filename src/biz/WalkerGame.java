package biz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class WalkerGame {

    public Boolean start(int T, int n, int m, int[] values) {

        boolean win = false;
        while (T-- > 0) {

            Queue<Integer> CurrentStep = new LinkedList<>();
            Queue<Integer> nextStep = new LinkedList<>();
            ArrayList<Integer> previousStep = new ArrayList<>();

            CurrentStep.add(0);

            while (CurrentStep.size() > 0) {
                nextStep.clear();
                win = false;
                for (int v : CurrentStep) {
                    if (v + m >= values.length || v + 1 >= values.length) {
                        win = true;
                        break;
                    }

                    if (values[v + m] == 0 && previousStep.indexOf(v + m) < 0) {
                        nextStep.add(v + m);
                        if (v + m > n - 1) {
                            win = true;
                            break;
                        }
                    }

                    if (v != 0 && values[v - 1] == 0 && previousStep.indexOf(v - 1) < 0) {
                        nextStep.add(v - 1);
                    }

                    if (values[v + 1] == 0 && previousStep.indexOf(v + 1) < 0) {
                        nextStep.add(v + 1);
                        if (v + 1 > n - 1) {
                            win = true;

                            break;
                        }
                    }
                }

                if (win) break;

                previousStep.addAll(CurrentStep);

                CurrentStep.clear();

                CurrentStep.addAll(nextStep);
            }

            if (win) {
                return true;
            } else {
                return false;
            }

        }
        return  false;
    }
        }






