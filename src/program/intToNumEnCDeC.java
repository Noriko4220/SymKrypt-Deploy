package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class intToNumEnCDeC {
    public String convertStringToBinary(String input) {

        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            result.append(
                    String.format("%8s", Integer.toBinaryString(aChar))
                            .replaceAll(" ", "0")
            );
        }
        return result.toString();

    }

    public String convertBinaryToString(String input){
        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < input.length()) {
            result.add(input.substring(index, Math.min(index + 8, input.length())));
            index += 8;
        }

        String sb = result.stream().collect(Collectors.joining(" "));

        String raw = Arrays.stream(sb.split(" "))
                .map(binary -> Integer.parseInt(binary, 2))
                .map(Character::toString)
                .collect(Collectors.joining());

        return raw;
    }
}
