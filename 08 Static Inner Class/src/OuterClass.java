class OuterClass {
  int a = 5;

  static class InnerClass {
    int b = 10;
  }


  public static void main(String[] args) {
	OuterClass.InnerClass icSinif = new OuterClass.InnerClass();
    System.out.println(icSinif.b);
  }
}
