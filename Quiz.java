import javax.swing.JOptionPane;

public class Quiz {
    static int nQuestions = 0;
    static int nCorrect = 0;
    
    public static void main(String[] args) {
        String question;
        
        // First question
        question = "What is the capital of France?\n" +
                   "A. London\n" +
                   "B. Paris\n" +
                   "C. Berlin\n" +
                   "D. Madrid\n" +
                   "E. Rome\n";
        check(question, "B");
        
        // Second question
        question = "What is the largest planet in our solar system?\n" +
                   "A. Jupiter\n" +
                   "B. Earth\n" +
                   "C. Venus\n" +
                   "D. Mars\n" +
                   "E. Saturn\n";
        check(question, "A");
        
        // Third question
        question = "What is the smallest country in the world?\n" +
                   "A. Monaco\n" +
                   "B. Vatican City\n" +
                   "C. San Marino\n" +
                   "D. Liechtenstein\n" +
                   "E. Andorra\n";
        check(question, "B");
        
        // Display score
        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
    }
    
    static String ask(String question) {
        String answer;
        do {
            answer = JOptionPane.showInputDialog(question).toUpperCase();
            if (!answer.equals("A") && !answer.equals("B") && !answer.equals("C") && !answer.equals("D") && !answer.equals("E")) {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
            }
        } while (!answer.equals("A") && !answer.equals("B") && !answer.equals("C") && !answer.equals("D") && !answer.equals("E"));
        return answer;
    }
    
    static void check(String question, String correctAnswer) {
        nQuestions++;
        String answer = ask(question);
        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null, "Correct!");
            nCorrect++;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer + ".");
        }
    }
}
