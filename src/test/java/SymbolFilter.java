import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertTrue;

public class SymbolFilter {
    @Test
    public void filteringSymbols() {
        String value = "124df.34.5";
        String shouldBe = "124.345";
        String afterFilteringWeHave = filter(value);
        assertTrue(shouldBe.equals(afterFilteringWeHave));
    }

    private String filter(String value) {
        List<String> invalidValue = charArrayToListOfString(value);
        invalidValue = invalidValue
                .stream()
                .filter(this::isValidSymbol)
                .collect(toList());

        removeExtraPoint(invalidValue);

        StringBuilder validValue = new StringBuilder();
        invalidValue.forEach(validValue::append);

        return validValue.toString();
    }

    private boolean isValidSymbol(final String symbol) {
        List<String> validSymbols = Arrays.asList("1", "2", "3", "4", "4", "5", "6", "7", "8", "9", "0", ".");
        return validSymbols.contains(symbol);
    }

    private void removeExtraPoint(List<String> value) {
        Predicate<String> predicate = s -> s.equals(".");
        long count = value.stream().filter(predicate).count();
        if (count == 2) {
            int indexOfPoint = value.lastIndexOf(".");
            value.remove(indexOfPoint);
        }
    }

    private List<String> charArrayToListOfString(String value) {
        char[] chars = value.toCharArray();
        List<String> listOfString = new ArrayList<>(chars.length);

        for (int i = 0; i < chars.length; i++) {
            listOfString.add(String.valueOf(chars[i]));
        }

        return listOfString;
    }
}
