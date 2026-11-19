class Team {
  private String teamName;
  private String[] players;

  // TODO: Write a copy constructor here to deep copy from Team t
  public Team(Team t) {
    // WRITE YOUR CODE HERE
    this.teamName = t.teamName;
    this.players = new String[t.players.length];

    for (int i = 0; i < t.players.length; i++) {
      this.players[i] = t.players[i];
    }

  }
}
