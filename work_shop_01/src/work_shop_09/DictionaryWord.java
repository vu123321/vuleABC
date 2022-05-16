package work_shop_09;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DictionaryWord {

    private String word;
    private String meanings;

    public DictionaryWord() {
    }

    public DictionaryWord(String word, String meanings) {
        this.word = word;
        this.meanings = meanings;
    }

    public  String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeanings() {
        return meanings;
    }

    public void setMeanings(String meanings) {
        this.meanings = meanings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictionaryWord that = (DictionaryWord) o;
        return Objects.equals(word, that.word) && Objects.equals(meanings, that.meanings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, meanings);
    }

    @Override
    public String toString() {
        return "DictionaryWord{" +
                "word='" + word + '\'' +
                ", meanings='" + meanings + '\'' +
                '}';
    }
}
