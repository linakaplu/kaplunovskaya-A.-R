import java.util.ArrayList;
import java.util.List;
abstract class Questionnaire {
    protected List<String> questions;

    public Questionnaire() {
        this.questions = new ArrayList<>();
    }

    public void createQuestionnaire() {
        addQuestions();
        displayQuestions();
    }

    public void addCustomQuestion(String question) {
        questions.add(question);
    }

    protected abstract void addQuestions();

    protected void displayQuestions() {
        System.out.println("Вопросы в анкете:");
        for (int i = 0; i < questions.size(); i++) {
            System.out.println((i + 1) + ". " + questions.get(i));
        }
    }

    public void viewAllQuestions() {
        System.out.println("Все вопросы:");
        for (int i = 0; i < questions.size(); i++) {
            System.out.println((i + 1) + ". " + questions.get(i));
        }
    }
}
