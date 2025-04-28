// package DFA_PROBLEMS;

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.util.Map;

// import static java.util.Map.entry;

// public class Problem4 {
//     int[] states = { 0, 1 };
//     int startState = 0;
//     int[] finalState = { 0 };
//     char[] alphabet = { 'a', 'b' };
//     public Map<Integer, int[]> transitionTable = Map.ofEntries(entry(0, new int[] { 1, 0 }),
//             entry(1, new int[] { 0, 1 }));
//     DFA dfa = new DFA(states, startState, finalState, alphabet, transitionTabl

 //      public problem4(BufferedReader br, BufferedWriter bw) {
//         dfa.solveProblem(br, bw);
//     }
// }