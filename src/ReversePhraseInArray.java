public class ReversePhraseInArray {

    public static void reverse() {
        String mnemonicRainbow = "Каждый охотник желает знать, где сидит фазан.";
        String[] rainbowWords = mnemonicRainbow.split(",?\\s+");
        String[] reverseRainbowWords = new String[rainbowWords.length];

        for (int i = 0; i < rainbowWords.length; i++) {
            reverseRainbowWords[i] = rainbowWords[rainbowWords.length - i - 1];
        }
        for (String reverseRainbowWord : reverseRainbowWords) {
            System.out.println(reverseRainbowWord);
        }
    }
}
