package Assignment5.Q4;

import javax.swing.*;
import java.util.Scanner;

public class UseScoreException {
    public static void main(String[] args) {
        while(true) {
            String input = JOptionPane.showInputDialog(null,"Enter the score: ");
            try {
                if (input == null) {
                    break;
                }
                int score = Integer.parseInt(input);
                if (score < 0 || score > 100) {
                    throw new ScoreException("Score should not be out of range.");
                }
                JOptionPane.showInputDialog(null,"This is a valid score");
            } catch (ScoreException e) {
                JOptionPane.showInputDialog(null,e.getMessage());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "You must enter a number for the score!");
            } finally {
                System.out.println("Score Checked..");
            }
            String again = JOptionPane.showInputDialog("Do you want to enter another score?");
            if (again == null || !(again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("y"))) {
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Completed the assignment");
    }
}
