public static String removeDuplicates(String a) {
  String newword = "";

  for (int i = 0; i < a.length(); i++) {
    boolean found = false;
    if (newword.length() == 0) {
      newword += a.charAt(i);
    } else {
      for (int j = 0; j < newword.length(); j++) {
        if (newword.charAt(j) == a.charAt(i)) {
          found = true;
        }
      }

      if (found != true) {
        newword += a.charAt(i);
      }
    }

  }

  return newword;
}

public static void main(String[] args) {
  System.out.println(removeDuplicates("programming"));
}
