public static char mostFrequentChar(String a) {
  char most = a.charAt(0);
  int maxcount = 0;

  for (int i = 0; i < a.length(); i++) {

    int count = 0;
    char ount = a.charAt(i);

    for (int j = 0; j < a.length(); j++) {
      if (a.charAt(i) == a.charAt(j)) {
        count++;
      }
    }

    if (count > maxcount) {
      maxcount = count;
      most = ount;
    }

  }

  return most;
}

public static void main(String[] args) {
  System.out.println(mostFrequentChar("programming"));
}
