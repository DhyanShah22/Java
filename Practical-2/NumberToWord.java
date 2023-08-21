public class NumberToWord {
    private static final String[] units = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convertNumberToWord(int number) {
        if (number < 0 || number > 9999) {
            return "Number out of range";
        }

        if (number == 0) {
            return "Zero";
        }

        if (number < 20) {
            return units[number];
        }

        if (number < 100) {
            return tens[number / 10] + (number % 10 == 0 ? "" : " " + units[number % 10]);
        }

       
            return units[number / 100] + " Hundred" + (number % 100 == 0 ? "" : " and " + convertNumberToWord(number % 100));
        }


    public static void main(String[] args) {
        int number = 546; 
        String wordRepresentation = convertNumberToWord(number);
        System.out.println(number + " in words: " + wordRepresentation);
    }
}