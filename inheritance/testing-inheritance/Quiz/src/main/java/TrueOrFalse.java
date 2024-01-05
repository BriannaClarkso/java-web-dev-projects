public class TrueOrFalse extends Question{


    public TrueOrFalse(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        String actualAnswer = this.getTheAnswer();
        if (answer.equals(getTheAnswer()){
            return true;
        } else {
            return false;
        }
    }
}
