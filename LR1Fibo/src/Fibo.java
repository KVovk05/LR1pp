public class Fibo {
    private int number;
    private int value;

    public Fibo(int number, int value) {
        this.value = value;
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNumber() {
        return this.number;
    }

    public int getValue() {
        return this.value;
    }
}