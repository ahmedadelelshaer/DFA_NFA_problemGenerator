package NFA_PROBLEMS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;

public class Problem7 {
    // Define our eight states (0 through 7)
    int[] states = { 0, 1, 2, 3, 4, 5, 6, 7 };
    int[] startState = { 0 };
    // Accept if the NFA reaches any of these states
    int[] finalState = { 5, 6, 7 };
    // Use binary alphabet
    List<Character> alphabet = Arrays.asList('0', '1');
    // Transition table: each state maps to a two-column 2D array.
    // For each state, first row corresponds to symbol '0' and second row to '1'.
    // The design is as follows:
    // State 0: Start.
    // on '0' → state 1; on '1' → state 3.
    // State 1: Seen one 0.
    // on '0' → state 2; on '1' → state 5 (switch => both seen).
    // State 2: Seen two consecutive 0’s.
    // on '0' → trap (-1); on '1' → state 5.
    // State 3: Seen one 1.
    // on '0' → state 5; on '1' → state 4.
    // State 4: Seen two consecutive 1’s.
    // on '0' → state 5; on '1' → trap (-1).
    // State 5: In the “both seen” region (after switching).
    // on '0' → state 6; on '1' → state 7.
    // State 6: In “both seen”, last symbol was 0.
    // on '0' → trap (-1); on '1' → state 7.
    // State 7: In “both seen”, last symbol was 1.
    // on '0' → state 6; on '1' → state 7 (allow a two‑in‑a‐row branch).
    public Map<Integer, int[][]> transitionTable = Map.ofEntries(
            entry(0, new int[][] { { 1 }, { 3 } }),
            entry(1, new int[][] { { 2 }, { 5 } }),
            entry(2, new int[][] { { -1 }, { 5 } }),
            entry(3, new int[][] { { 5 }, { 4 } }),
            entry(4, new int[][] { { 5 }, { -1 } }),
            entry(5, new int[][] { { 6 }, { 7 } }),
            entry(6, new int[][] { { -1 }, { 7 } }),
            entry(7, new int[][] { { 6 }, { 7 } }));
    NFA nfa = new NFA(states, startState, finalState, alphabet, transitionTable);

    public Problem7(BufferedReader br, BufferedWriter bw) {
        nfa.solveProblem(br, bw);
    }
}