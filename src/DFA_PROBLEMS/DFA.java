package DFA_PROBLEMS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;

public class DFA {
    public int[] states;
    public int startState;
    public int[] finalState;
    public char[] alphabetMap;
    public Map<Integer, int[]> transitionTable;

    public DFA(int[] states, int startState, int[] finalState, char[] alphabet, Map<Integer, int[]> transitionTable) {
        this.states = states;
        this.startState = startState;
        this.finalState = finalState;
        this.alphabetMap = alphabet;
        this.transitionTable = transitionTable;

    }

    public boolean isAccepted(String s) {
        char[] alphabets = s.toCharArray();
        int nextState = 0;
        for (int i = 0; i < alphabets.length; i++) {
            if (alphabetMap.length == 2) {
                if (alphabets[i] == alphabetMap[0]) {
                    nextState = transitionTable.get(nextState)[0];
                } else {
                    nextState = transitionTable.get(nextState)[1];
                }
            }
            if (alphabetMap.length == 3) {
                if (alphabets[i] == alphabetMap[0]) {
                    nextState = transitionTable.get(nextState)[0];
                } else if (alphabets[i] == alphabetMap[1]) {
                    nextState = transitionTable.get(nextState)[1];
                } else {
                    nextState = transitionTable.get(nextState)[2];
                }
            }

        }

        boolean isFinalState = false;
        for (int state : finalState) {
            if (state == nextState) {
                isFinalState = true;
                break;
            }
        }
        if (isFinalState) {
            return true;
        } else {
            return false;
        }

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