import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class StepImplementation {

    private HashSet<Character> vowels;

    @Step("Vowels in English language are <vowelString>.")
    public void setLanguageVowels(String vowelString) {
        vowels = new HashSet<>();
        for (char ch : vowelString.toCharArray()) {
            vowels.add(ch);
        }
    }

    @Step("The word <word> has <expectedCount> vowels.")
    public void verifyVowelsCountInWord(String word, int expectedCount) {
        int actualCount = countVowels(word);
        assertEquals(expectedCount, actualCount);
    }

    @Step("Almost all words have vowels <wordsTable>")
    public void verifyVowelsCountInMultipleWords(Table wordsTable) {
        for (TableRow row : wordsTable.getTableRows()) {
            String word = row.getCell("Word");
            int expectedCount = Integer.parseInt(row.getCell("Vowel Count"));
            int actualCount = countVowels(word);

            assertEquals(expectedCount, actualCount);
        }
    }

    @Step("generate implementations")
    public void generateImplementations(){
        for(int i=0;i<1000;i++)
        {
            System.out.println("@Step(\"Step implementation "+i+"\")\n" +
                    "    public void implementation"+i+"() {\n" +
                    "    }\n");
        }
    }

    private int countVowels(String word) {
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (vowels.contains(ch)) {
                count++;
            }
        }
        return count;
    }
}
