import java.util.List;

public record afc(List<afc.a> b, boolean c) implements zw<acq> {
   public static final zm<wx, afc> a = zm.a(afc.a.c.a(zk.a()), afc::b, zk.b, afc::e, afc::new);

   @Override
   public zy<afc> a() {
      return ahk.ak;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public record a(dit d, byte e) {
      public static final byte a = 1;
      public static final byte b = 2;
      public static final zm<wx, afc.a> c = zm.a(dit.a, afc.a::c, zk.c, afc.a::d, afc.a::new);

      public a(dit $$0, boolean $$1, boolean $$2) {
         this($$0, (byte)(($$1 ? 1 : 0) | ($$2 ? 2 : 0)));
      }

      public boolean a() {
         return (this.e & 1) != 0;
      }

      public boolean b() {
         return (this.e & 2) != 0;
      }

      public dit c() {
         return this.d;
      }

      public byte d() {
         return this.e;
      }
   }
}
