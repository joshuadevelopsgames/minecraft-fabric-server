import java.util.List;

public record abt(amd<dmu> c, euq d, List<abt.a> e) implements abe {
   public static final zm<wg, abt> a = abe.a(abt::a, abt::new);
   public static final abe.b<abt> b = abe.a("debug/structures");

   private abt(wg $$0) {
      this($$0.a(mn.bu), b($$0), $$0.a(abt.a::new));
   }

   private void a(wg $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public abe.b<abt> a() {
      return b;
   }

   static euq b(wg $$0) {
      return new euq($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(wg $$0, euq $$1) {
      $$0.q($$1.h());
      $$0.q($$1.i());
      $$0.q($$1.j());
      $$0.q($$1.k());
      $$0.q($$1.l());
      $$0.q($$1.m());
   }

   public amd<dmu> b() {
      return this.c;
   }

   public euq c() {
      return this.d;
   }

   public List<abt.a> d() {
      return this.e;
   }

   public record a(euq a, boolean b) {
      public a(wg $$0) {
         this(abt.b($$0), $$0.readBoolean());
      }

      public void a(wg $$0) {
         abt.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
