public class MulitpleChoice extends Question {


    public MulitpleChoice(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        String actualAnswer = this.getTheAnswer();
        if (answer.equals(actualAnswer){
            return true;
        } else {
            return false;
        }
    }
}
