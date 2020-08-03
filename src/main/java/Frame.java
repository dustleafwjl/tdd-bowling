public class Frame {
    private int firstScore;
    private int secondScore;
    Frame(int onlyScore) {
        this.firstScore = onlyScore;
    }
    Frame(int firstScore, int secondScore) {
        this.firstScore = firstScore;
        this.secondScore = secondScore;
    }
    @Override
    public String toString() {
        return String.valueOf(firstScore + secondScore);
    }

    public int getTotalScore() {
        return firstScore + secondScore;
    }
    public int getFirstScore() {
        return firstScore;
    }
    public int getSecondScore() {
        return secondScore;
    }
}
