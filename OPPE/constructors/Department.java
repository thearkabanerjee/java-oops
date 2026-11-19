class Department {
  private String deptName;
  private String[] employeeNames;

  // TODO: Write a copy constructor here to deep copy from Department d
  public Department(Department d) {
    // WRITE YOUR CODE HERE
    this.deptName = d.deptName;
    this.employeeNames = new String[d.employeeNames.length];
    for (int i = 0; i < d.employeeNames.length; i++) {
      this.employeeNames[i] = d.employeeNames[i];
    }
  }
}
