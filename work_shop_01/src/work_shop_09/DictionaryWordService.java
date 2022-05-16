package work_shop_09;


import java.util.*;
import java.util.stream.Collectors;

public class DictionaryWordService {

    private static List<DictionaryWord> list = new ArrayList<>();


    public static void main(String[] args) {
        List<DictionaryWord> dictionaryWordList = getDictionaryWord();

        sortAndPrintWords(dictionaryWordList);

        System.out.println("======================SET======================");

        Set<DictionaryWord> wordSet = new HashSet<>(dictionaryWordList);
        wordSet.forEach(System.out::println);



    }

    private static List<DictionaryWord> getDictionaryWord() {

        return Arrays.asList(
                new DictionaryWord("murderer", "Kills another person"),
                new DictionaryWord("bank robber", "Steals money from a bank "),
                new DictionaryWord("burglar", "Breaks into a home to steal things"),
                new DictionaryWord("forger", "Makes an illegal copy of something"),
                new DictionaryWord("hacker", "Breaks into a computer system"),
                new DictionaryWord("hijacker", "Takes control of an airplane"),
                new DictionaryWord("hijacker", "Takes control of an airplane"),
                new DictionaryWord("kidnapper", "Holds someone for ransom money"),
                new DictionaryWord("mugger", "Attacks and steals money from someone")
        );
    }

    private static void sortAndPrintWords(List<DictionaryWord> words){
        words.sort(Comparator.comparing(DictionaryWord::getWord));

        int no = 1;

        for (DictionaryWord word : words){
            System.out.println(no+". "+word.getWord()+"\n"+word.getMeanings());
            no++;
        }
    }

}
