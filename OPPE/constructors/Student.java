class Student {
  private String name;
  private String[] subjects;

  // TODO: Write a copy constructor here to deep copy from Student other

  public Student(Student other) {
    // WRITE YOUR CODE HERE
    this.name = other.name;
    this.subjects = new String[other.subjects.length];
    for (int i = 0; i < other.subjects.length; i++) {
      this.subjects[i] = other.subjects[i];
    }

  }
}
