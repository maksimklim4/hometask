public enum Position {
    DIRECTOR(2),
    WORKER(1);
    private int coefficient;
    Position(int coefficient) {
        this.coefficient = coefficient;
    }
    public int getCoefficient() {
        return coefficient;
    }
}
