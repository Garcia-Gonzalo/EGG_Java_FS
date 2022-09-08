package Entidades;

public class CheckDates2 {
    private String message;
    private int min, max;
    private boolean checked;
    private int value;
    private int correct;
    
    
    public int getCorrect() {
        return correct;
    }


    public void setCorrect(int correct) {
        this.correct = correct;
    }


    public int getValue() {
        return value;
    }


    public void setValue(int value) {
        this.value = value;
    }


    public static CheckDate createCheck(String message, int min, int max, int correct) {
        CheckDate temporary = new CheckDate();
        temporary.setMessage(message);
        temporary.setMax(max);
        temporary.setMin(min);
        temporary.setChecked(false);
        temporary.setCorrect(correct);

        return temporary;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    public void setMin(int min) {
        this.min = min;
    }


    public void setMax(int max) {
        this.max = max;
    }


    public void setChecked(boolean checked) {
        this.checked = checked;
    }


    public String getMessage() {
        return message;
    }


    public int getMin() {
        return min;
    }


    public int getMax() {
        return max;
    }


    public boolean isChecked() {
        return checked;
    }
    
    
}
