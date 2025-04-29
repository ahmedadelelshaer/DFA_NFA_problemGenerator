package DFA_PROBLEMS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Map;

import static java.util.Map.entry;

public class Problem4 {
    int[] states = { 0, 1, 2, 3, 4, 5, 6 };
    int startState = 0;
    int[] finalState = { 0 };
    char[] alphabet = { '0', '1' };
    public Map<Integer, int[]> transitionTable = Map.ofEntries(
            entry(0, new int[] { 0, 1 }),
            entry(1, new int[] { 2, 3 }),
            entry(2, new int[] { 4, 5 }),
            entry(3, new int[] { 6, 0 }),
            entry(4, new int[] { 1, 2 }),
            entry(5, new int[] { 3, 4 }),
            entry(6, new int[] { 5, 6 }));
    DFA dfa = new DFA(states, startState, finalState, alphabet, transitionTable);

    public Problem4(BufferedReader br, BufferedWriter bw) {
        dfa.solveProblem(br, bw);
    }
}