package DFA_PROBLEMS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Map;

import static java.util.Map.entry;

public class Problem6 {
    int[] states = { 0, 1, 2, 3 };
    int startState = 0;
    int[] finalState = { 1 };
    char[] alphabet = { 'a', 'b' };
    public Map<Integer, int[]> transitionTable = Map.ofEntries(
            entry(0, new int[] { 2, 1 }),
            entry(1, new int[] { 3, 0 }),
            entry(2, new int[] { 0, 3 }),
            entry(3, new int[] { 1, 2 }));
    DFA dfa = new DFA(states, startState, finalState, alphabet, transitionTable);

    public Problem6(BufferedReader br, BufferedWriter bw) {
        dfa.solveProblem(br, bw);
    }
}