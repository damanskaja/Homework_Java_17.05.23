public class CharToIntConversion {
    public static void main(String[] args) {
        char ch = '4';

        // Используя String.valueOf()
        int intValue1 = Integer.parseInt(String.valueOf(ch));
        int result1 = intValue1 + 6;
        System.out.println("Результат (String.valueOf()): " + result1);

        // Используя Character.getNumericValue()
        int intValue2 = Character.getNumericValue(ch);
        int result2 = intValue2 + 6;
        System.out.println("Результат (Character.getNumericValue()): " + result2);
    }
}

