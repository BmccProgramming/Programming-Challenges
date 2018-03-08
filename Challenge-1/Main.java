class Main { 
  public static void main(String[] args) {
    String userInput = "Hello World";
    System.out.println(doglatin(userInput));
    System.out.println(piglatin(userInput));
  }

  static String doglatin(String sentence){
    String [] words = sentence.split(" ");
    String doglatinSentence = "";
    for(String word: words){
      for (int i = word.length() - 1; i >= 0; i--)
        doglatinSentence += word.charAt(i);
      doglatinSentence += " ";
    }
    return doglatinSentence;
  }

  static String piglatin(String sentence)  {
    String [] words = sentence.split(" ");
    String piglatinSentence = "";
    for (String word: words) {
      for (int i = 1;i < word.length(); i++)
        piglatinSentence += word.charAt(i);
      piglatinSentence += word.charAt(0) + "ay ";
    }
    return piglatinSentence;
  }

}
