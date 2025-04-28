package DFA_PROBLEMS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Map;

import static java.util.Map.entry;

public class Problem2 {
    int[] states = { 0, 1, 2, 3, 4 };
    int startState = 0;
    int[] finalState = { 3 };
    char[] alphabet = { '1', '0' };
    public Map<Integer, int[]> transitionTable = Map.ofEntries(
            entry(0, new int[] { 1, 4 }),
            entry(1, new int[] { 2, 2 }),
            entry(2, new int[] { 3, 3 }),
            entry(3, new int[] { 3, 3 }),
            entry(4, new int[] { 4, 4 }));

    DFA dfa = new DFA(states, startState, finalState, alphabet, transitionTable);

    public Problem2(BufferedReader br, BufferedWriter bw) {
        dfa.solveProblem(br, bw);
    }
}