import javax.swing.JLabel;

public class ScoreCount {
    private int score;
    private JLabel scoreLabel; // For displaying score

    public ScoreCount() {
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        score += points;
        if (scoreLabel != null) {
            scoreLabel.setText(String.valueOf(score));
        }
    }

    public void resetScore() {
        score = 0;
        if (scoreLabel != null) {
            scoreLabel.setText(String.valueOf(score));
        }
    }

    public void setScoreLabel(JLabel label) {
        this.scoreLabel = label;
    }
}