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
                result.add(new Frame(Integer.parseInt(frameCodes[i])));
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
        Frame lastFrame = frames.get(frames.size() - 1);
        for (int i = 9; i >= 0; i --) {
            Frame currentFrame = frames.get(i);
            if(currentFrame.getTotalScore() == 10 && currentFrame.getFirstScore() != 10) {
                sumScore += currentFrame.getTotalScore() + lastFrame.getFirstScore();
            } else if(currentFrame.getFirstScore() == 10) {

            } else {
                sumScore += currentFrame.getTotalScore();
            }
            lastFrame = frames.get(i);
        }

        return sumScore;
    }
}
