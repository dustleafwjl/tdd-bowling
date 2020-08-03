import java.util.ArrayList;

public class BowlingGame {

    public static final int MAX_SCORE = 10;

    public int getLineScore(String scoreCode) {
        ArrayList<Frame> frames = formatScoreCode(scoreCode);
        int score = calculate(frames);
        return score;
    }

    private ArrayList<Frame> formatScoreCode(String scoreCode) {
        String[] frameCodes = scoreCode.split("\\|");
        ArrayList<Frame> result = new ArrayList<Frame>();
        for (int i = 0; i < frameCodes.length; i ++) {
            if(frameCodes[i].equals("A")) {
                result.add(new Frame(MAX_SCORE));
            }else if(i == 10) {
                result.add(new Frame(Integer.parseInt(frameCodes[0])));
            } else {
                String[] scoreArr = frameCodes[i].split("-");
                result.add(new Frame(Integer.parseInt(scoreArr[0]), Integer.parseInt(scoreArr[1])));
            }
        }
        return result;
    }

    private int calculate(ArrayList<Frame> frames) {
//        System.out.println(frames);
        int sumScore = 0;
        for(Frame item : frames) {
            sumScore += item.getTotalScore();
        }
        return sumScore;
    }
}
