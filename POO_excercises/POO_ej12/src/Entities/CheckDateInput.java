package Entities;

public class CheckDateInput {
    private String message;
    private int min, max;
    private boolean checked;
    private int value;

    public int getValue() {
        return value;
    }


    public void setValue(int value) {
        this.value = value;
    }


    public static CheckDateInput createCheck(String message, int min, int max) {
        CheckDateInput temporary = new CheckDateInput();
        temporary.setMessage(message);
        temporary.setMax(max);
        temporary.setMin(min);
        temporary.setChecked(false);
        
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
