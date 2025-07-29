public class brw extends brs {
   private final brt c;
   private final brv d;

   public brw(int $$0, brt $$1, brv $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public brw(int $$0, brt $$1, brv $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new adq((long[])this.b.clone(), this.d));
   }
}
