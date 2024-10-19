package calculator;

import camp.nextstep.edu.missionutils.Console;

class StringAddCalculator {
    public int add(String input) {
        if (input == null) {
            return 0;
        }

        int result = 0;
        String[] numbers = input.split(",|:");
        for (String num : numbers) {
            result += Integer.parseInt(num);
        }

        return result;
    }
}


public class Application {
    public static void main(String[] args) {
        StringAddCalculator stringAddCalculator = new StringAddCalculator();

        System.out.println("덧셈할 문자열을 입력해주세요.");
        String input = Console.readLine();

        int result = stringAddCalculator.add(input);
        System.out.println("결과 : " + result);
    }
}
