package Entities;

public class Pixel {

    private boolean on=false;
    private String unicodeValue=" ";
    
    public Pixel(boolean on, String unicodeValue) {
        this.on = on;
        this.unicodeValue = unicodeValue;
    }

    public boolean isOn() {
        return on;
    }

    public String getUnicodeValue() {
        return unicodeValue;
    }
    
}
