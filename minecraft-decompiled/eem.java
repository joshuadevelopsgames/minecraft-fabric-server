public enum eem implements bda {
   a("floor"),
   b("wall"),
   c("ceiling");

   private final String d;

   private eem(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
