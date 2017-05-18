package example.com.teachme.Question;


import example.com.teachme.model.Game;

public class MCQ extends Question {

    private String[] choices;
    private int answer;

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public MCQ() {
        super();
    }

    public MCQ(String id, String description, Game game) {
        super(id, description, game);
    }

    public MCQ(String id, String description, Game game, String[] choices, int answer) {
        super(id, description, game);
        this.choices = choices;
        this.answer = answer;
    }

}
