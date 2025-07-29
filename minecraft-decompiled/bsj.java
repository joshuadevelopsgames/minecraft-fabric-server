public record bsj<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bsj<T> a(String $$0) {
      return new bsj<>($$0);
   }
}
