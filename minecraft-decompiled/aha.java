public record aha(float b, boolean c) implements zw<acq> {
   public static final zm<wg, aha> a = zw.a(aha::a, aha::new);

   private aha(wg $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static aha a(bxt $$0) {
      return new aha($$0.f(), $$0.l());
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<aha> a() {
      return ahk.cs;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
