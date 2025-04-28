package NFA_PROBLEMS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import static java.util.Map.entry;

public class Problem8 {
    int[] states = { 0, 1, 2, 3, 4 };
    int startState[] = { 0 };
    int[] finalState = { 4 };
    List<Character> alphabet = Arrays.asList('e', 'a', 'b');
    public Map<Integer, int[][]> transitionTable = Map.ofEntries(
            entry(0, new int[][] { { -1 }, { 0, 1 }, { 0 } }),
            entry(1, new int[][] { { -1 }, { -1 }, { 2 } }),
            entry(2, new int[][] { { -1 }, { 2, 3 }, { 2 } }),
            entry(3, new int[][] { { -1 }, { -1 }, { 4 } }),
            entry(4, new int[][] { { -1 }, { 4 }, { 4 } }));
    NFA nfa = new NFA(states, startState, finalState, alphabet, transitionTable);

    public Problem8(BufferedReader br, BufferedWriter bw) {
        nfa.solveProblem(br, bw);
    }
}