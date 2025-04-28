package NFA_PROBLEMS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import static java.util.Map.entry;

public class Problem10 {
    int[] states = { 0, 1 };
    int startState[] = { 0 };
    int[] finalState = { 0, 1 };
    List<Character> alphabet = Arrays.asList('E', 'x', 'y');
    public Map<Integer, int[][]> transitionTable = Map.ofEntries(
            entry(0, new int[][] { { -1 }, { 0 }, { 1 } }),
            entry(1, new int[][] { { -1 }, { 0 }, { -1 } }));
    NFA nfa = new NFA(states, startState, finalState, alphabet, transitionTable);

    public Problem10(BufferedReader br, BufferedWriter bw) {
        nfa.solveProblem(br, bw);
    }
}