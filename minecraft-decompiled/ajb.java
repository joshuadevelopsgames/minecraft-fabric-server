public record ajb(int b, int c) implements zw<ahm> {
   public static final zm<wg, ajb> a = zw.a(ajb::a, ajb::new);

   private ajb(wg $$0) {
      this($$0.l(), $$0.l());
      if (this.c < 0 && this.c != -1) {
         throw new IllegalArgumentException("Invalid selectedItemIndex: " + this.c);
      }
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
   }

   @Override
   public zy<ajb> a() {
      return ahk.bn;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }
}
