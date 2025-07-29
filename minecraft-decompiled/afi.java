public record afi(ahh e, byte f) implements zw<acq> {
   public static final zm<wx, afi> a = zw.a(afi::a, afi::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private afi(wx $$0) {
      this(new ahh($$0), $$0.readByte());
   }

   private void a(wx $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public zy<afi> a() {
      return ahk.ap;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public ahh b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
