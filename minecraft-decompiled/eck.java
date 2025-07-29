import javax.annotation.Nullable;

public class eck extends eaz implements ejd.b<ejk.b>, ejk {
   private static final int a = 0;
   private ejk.a b;
   private final ejk.b c;
   private final ejk.d d;
   private int e = 0;

   protected eck(ebb<?> $$0, jb $$1, eeb $$2) {
      super($$0, $$1, $$2);
      this.d = this.a();
      this.b = new ejk.a();
      this.c = new ejk.b(this);
   }

   public eck(jb $$0, eeb $$1) {
      this(ebb.J, $$0, $$1);
   }

   public ejk.d a() {
      return new eck.a(this.aA_());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.e = $$0.a("last_vibration_frequency", 0);
      this.b = $$0.<ejk.a>a("listener", ejk.a.a).orElseGet(ejk.a::new);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("last_vibration_frequency", this.e);
      $$0.a("listener", ejk.a.a, this.b);
   }

   @Override
   public ejk.a gI() {
      return this.b;
   }

   @Override
   public ejk.d gJ() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public void a(int $$0) {
      this.e = $$0;
   }

   public ejk.b f() {
      return this.c;
   }

   protected class a implements ejk.d {
      public static final int b = 8;
      protected final jb c;
      private final ejf a;

      public a(final jb $$1) {
         this.c = $$1;
         this.a = new eix($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public ejf b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aub $$0, jb $$1, jl<ejb> $$2, @Nullable ejb.a $$3) {
         if (!$$1.equals(this.c) || !$$2.a(ejb.f) && !$$2.a(ejb.i)) {
            return ejk.a_($$2) == 0 ? false : dxb.q(eck.this.m());
         } else {
            return false;
         }
      }

      @Override
      public void a(aub $$0, jb $$1, jl<ejb> $$2, @Nullable bzm $$3, @Nullable bzm $$4, float $$5) {
         eeb $$6 = eck.this.m();
         if (dxb.q($$6)) {
            int $$7 = ejk.a_($$2);
            eck.this.a($$7);
            int $$8 = ejk.a_($$5, this.a());
            if ($$6.b() instanceof dxb $$9) {
               $$9.a($$3, $$0, this.c, $$6, $$8, $$7);
            }
         }
      }

      @Override
      public void e() {
         eck.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
