package NFA_PROBLEMS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import static java.util.Map.entry;

public class Problem9 {
    int[] states = { 0, 1, 2 };
    int startState[] = { 0 };
    int[] finalState = { 1, 2 };
    List<Character> alphabet = Arrays.asList('0', '1');
    public Map<Integer, int[][]> transitionTable = Map.ofEntries(
            entry(0, new int[][] { { 0 }, { 1 } }),
            entry(1, new int[][] { { 2 }, { 1 } }),
            entry(2, new int[][] { { -1 }, { 1 } }));
    NFA nfa = new NFA(states, startState, finalState, alphabet, transitionTable);

    public Problem9(BufferedReader br, BufferedWriter bw) {
        nfa.solveProblem(br, bw);
    }
}