class MyClass {
  MyClass(MyClass mc) { } // Noncompliant

  int     foo1() {
    int num = 0; // Noncompliant
    int number = 0;
    String nums;
    String str = ""; // Noncompliant
    Object o = new Object(); // Noncompliant
    Object object = null;
    Double[] doublesInAList;
    char c; // Noncompliant
    return -1;
  }
}
