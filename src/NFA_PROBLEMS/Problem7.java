package NFA_PROBLEMS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;

public class Problem7 {
    // states 0..9
    int[] states = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] startState = { 0 };
    int[] finalState = { 5, 6, 7, 8 }; // updated final states
    List<Character> alphabet = Arrays.asList('E', '0', '1'); // left unchanged

    // transitionTable.get(q)[i] = array of next‐states on alphabet[i]
    public Map<Integer, int[][]> transitionTable = Map.ofEntries(
            entry(0, new int[][] { { -1 }, { 1 }, { 2 } }),
            entry(1, new int[][] { { -1 }, { 3 }, { 6 } }),
            entry(2, new int[][] { { -1 }, { 5 }, { 4 } }),
            entry(3, new int[][] { { -1 }, { 9 }, { 6 } }),
            entry(4, new int[][] { { -1 }, { 5 }, { 9 } }),
            entry(5, new int[][] { { -1 }, { 7 }, { 6 } }),
            entry(6, new int[][] { { -1 }, { 5 }, { 8 } }),
            entry(7, new int[][] { { -1 }, { 9 }, { 6 } }),
            entry(8, new int[][] { { -1 }, { 5 }, { 9 } }),
            entry(9, new int[][] { { -1 }, { 9 }, { 9 } }));

    NFA nfa = new NFA(states, startState, finalState, alphabet, transitionTable);

    public Problem7(BufferedReader br, BufferedWriter bw) {
        nfa.solveProblem(br, bw);
    }
}