import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import DFA_PROBLEMS.Problem2;
import DFA_PROBLEMS.Problem3;
import DFA_PROBLEMS.Problem5;
import DFA_PROBLEMS.Problem6;
import NFA_PROBLEMS.Problem10;
import NFA_PROBLEMS.Problem7;
import DFA_PROBLEMS.Problem1;
import NFA_PROBLEMS.Problem8;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("./input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("./output.txt"));
        String choice;
        boolean isValid = true;
        while (isValid) {
            choice = br.readLine();
            bw.write(choice + "\n");
            switch (choice) {

                case "1":
                    Problem1 p1 = new Problem1(br, bw);
                    break;
                case "2":
                    Problem2 p2 = new Problem2(br, bw);
                    break;
                case "3":
                    Problem3 p3 = new Problem3(br, bw);
                    break;
                // case "4":
                // Problem4 p4 = new Problem4(br, bw);
                case "5":
                    Problem5 p5 = new Problem5(br, bw);
                    break;
                case "6":
                    Problem6 p6 = new Problem6(br, bw);
                    break;
                case "7":
                    Problem7 p7 = new Problem7(br, bw);
                    break;
                case "8":
                    Problem8 p8 = new Problem8(br, bw);
                    break;
                case "10":
                    Problem10 p10 = new Problem10(br, bw);
                    isValid = false;
                    break;
                default:
                    break;

            }
            if (!isValid) {
                break;
            }
        }
        bw.close();
    }
}
