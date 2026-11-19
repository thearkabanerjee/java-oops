class Playlist {
  private String title;
  private String[] songs;

  // TODO: Write a copy constructor here to deep copy from Playlist p
  public Playlist(Playlist p) {
    // WRITE YOUR CODE HERE
    this.title = p.title;
    this.songs = new String[p.songs.length];
    for (int i = 0; i < p.songs.length; i++) {
      this.songs[i] = p.songs[i];
    }
  }
}
