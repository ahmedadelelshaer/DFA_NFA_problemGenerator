package NFA_PROBLEMS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NFA {
    public int[] states;
    public int[] startState;
    public int[] finalState;
    public List<Character> alphabetMap;
    public Map<Integer, int[][]> transitionTable;

    public NFA(int[] states, int[] startState, int[] finalState, List<Character> alphabet,
            Map<Integer, int[][]> transitionTable) {
        this.states = states;
        this.startState = startState;
        this.finalState = finalState;
        this.alphabetMap = alphabet;
        this.transitionTable = transitionTable;

    }

    public boolean isAccepted(String s) {
        Set<Integer> currentStates = new HashSet<>();
        currentStates.add(startState[0]);
        char[] alphabets = s.toCharArray();
        int index;
        for (int i = 0; i < alphabets.length; i++) {
            Set<Integer> nextStates = new HashSet<>();
            if (alphabetMap.contains(alphabets[i])) {
                index = alphabetMap.indexOf(alphabets[i]);
                for (int curr : currentStates) {
                    int[][] transitions = transitionTable.get(curr);
                    int[] next = transitions[index];
                    for (int n : next) {
                        if (n != -1) { // filter out invalid transition
                            nextStates.add(n);
                        }

                    }
                }
            }
            currentStates = nextStates;
        }

        for (int c : currentStates) {
            for (int fs : finalState) {
                if (c == fs) {
                    return true;
                }
            }
        }
        return false;

    }

    public void solveProblem(BufferedReader br, BufferedWriter bw) {
        try {

            String contentLine = "adsaalsidjasildjasildasjdas";
            while (!contentLine.equals("end")) {
                String accepted;
                contentLine = br.readLine().trim();
                System.out.println(contentLine);
                if (isAccepted(contentLine)) {
                    accepted = "True";
                } else {
                    accepted = "False";
                }
                if (contentLine.equals("end")) {
                    bw.write("x" + "\n");
                    break;
                } else {
                    bw.write(accepted + "\n");
                }

            }
            // bw.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
