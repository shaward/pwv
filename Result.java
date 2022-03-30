import java.util.Set;

/**
 * Created by said on 2/19/2021.
 */
public class Result {
    Set<String> words;
    MostCommon mostCommon;

    public Result(Set<String> words, MostCommon mostCommon) {
        this.words = words;
        this.mostCommon = mostCommon;
    }

    public Set<String> getWords() {
        return words;
    }

    public void setWords(Set<String> words) {
        this.words = words;
    }

    public MostCommon getMostCommon() {
        return mostCommon;
    }

    public void setMostCommon(MostCommon mostCommon) {
        this.mostCommon = mostCommon;
    }

    @Override
    public String toString() {
        return "Result{" +
                "words=" + words +
                ", mostCommon=" + mostCommon +
                '}';
    }
}
