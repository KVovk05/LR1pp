public class Fibo {
    private int number;
    private int value;

    /**
     * Constructor
     * @param number
     * @param value
     */
    public Fibo(int number, int value) {
        this.value = value;
        this.number = number;
    }

    /**
     * setter for number
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Setter for value
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * getter for number
     * @return
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * getter for value
     * @return
     */
    public int getValue() {
        return this.value;
    }
}