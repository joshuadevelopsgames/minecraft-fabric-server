public class sq extends sx {
   protected final xo a;
   protected final int b;

   public sq(xo $$0, int $$1) {
      super($$0.getString());
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public xo a() {
      return xo.a("test.error.tick", this.a, this.b);
   }

   @Override
   public String getMessage() {
      return this.a().getString();
   }
}
