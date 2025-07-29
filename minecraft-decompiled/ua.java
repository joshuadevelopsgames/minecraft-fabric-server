public class ua extends sx {
   private final Throwable a;

   public ua(Throwable $$0) {
      super($$0.getMessage());
      this.a = $$0;
   }

   @Override
   public xo a() {
      return xo.a("test.error.unknown", this.a.getMessage());
   }
}
