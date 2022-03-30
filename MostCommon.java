/**
 * Created by said on 2/19/2021.
 */
public class MostCommon {
    String word;
    int numberOfUses;

    public MostCommon(String word, int numberOfUses) {
        this.word = word;
        this.numberOfUses = numberOfUses;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getNumberOfUses() {
        return numberOfUses;
    }

    public void setNumberOfUses(int numberOfUses) {
        this.numberOfUses = numberOfUses;
    }

    @Override
    public String toString() {
        return "MostCommon{" +
                "word='" + word + '\'' +
                ", numberOfUses=" + numberOfUses +
                '}';
    }
}
