import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class crw extends crv {
   private static final boolean a = false;
   private static final boolean b = false;
   @Nullable
   private jb c;
   private boolean d = false;
   private boolean e = false;

   protected crw(bzv<? extends crw> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void H() {
      super.H();
      this.ch.a(4, new crw.a<>(this, 0.7, 0.595));
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.b("patrol_target", jb.a, this.c);
      $$0.a("PatrolLeader", this.d);
      $$0.a("Patrolling", this.e);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.c = $$0.<jb>a("patrol_target", jb.a).orElse(null);
      this.d = $$0.a("PatrolLeader", false);
      this.e = $$0.a("Patrolling", false);
   }

   public boolean gH() {
      return true;
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      if ($$2 != bzu.p && $$2 != bzu.h && $$2 != bzu.d && $$0.H_().i() < 0.06F && this.gH()) {
         this.d = true;
      }

      if (this.gK()) {
         this.a(bzw.f, cwj.a(this.eb().f(mn.aJ)));
         this.a(bzw.f, 2.0F);
      }

      if ($$2 == bzu.p) {
         this.e = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bzv<? extends crw> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return $$1.a(dnd.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.e || $$0 > 16384.0;
   }

   public void h(jb $$0) {
      this.c = $$0;
      this.e = true;
   }

   public jb gI() {
      return this.c;
   }

   public boolean gJ() {
      return this.c != null;
   }

   public void x(boolean $$0) {
      this.d = $$0;
      this.e = true;
   }

   public boolean gK() {
      return this.d;
   }

   public boolean gN() {
      return true;
   }

   public void gO() {
      this.c = this.dx().b(-500 + this.ar.a(1000), 0, -500 + this.ar.a(1000));
      this.e = true;
   }

   protected boolean gP() {
      return this.e;
   }

   protected void y(boolean $$0) {
      this.e = $$0;
   }

   public static class a<T extends crw> extends chi {
      private static final int a = 200;
      private final T b;
      private final double c;
      private final double d;
      private long e;

      public a(T $$0, double $$1, double $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = -1L;
         this.a(EnumSet.of(chi.a.a));
      }

      @Override
      public boolean b() {
         boolean $$0 = this.b.ai().ae() < this.e;
         return this.b.gP() && this.b.e() == null && !this.b.cZ() && this.b.gJ() && !$$0;
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
      }

      @Override
      public void a() {
         boolean $$0 = this.b.gK();
         cjw $$1 = this.b.S();
         if ($$1.l()) {
            List<crw> $$2 = this.h();
            if (this.b.gP() && $$2.isEmpty()) {
               this.b.y(false);
            } else if ($$0 && this.b.gI().a(this.b.dv(), 10.0)) {
               this.b.gO();
            } else {
               fis $$3 = fis.c(this.b.gI());
               fis $$4 = this.b.dv();
               fis $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).c(0.4).e($$3);
               fis $$6 = $$3.d($$4).d().c(10.0).e($$4);
               jb $$7 = jb.a((jv)$$6);
               $$7 = this.b.ai().a(eka.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.ai().ae() + 200L;
               } else if ($$0) {
                  for (crw $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<crw> h() {
         return this.b.ai().a(crw.class, this.b.cV().g(16.0), $$0 -> $$0.gN() && !$$0.v(this.b));
      }

      private boolean i() {
         bck $$0 = this.b.ec();
         jb $$1 = this.b.ai().a(eka.a.f, this.b.dx().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.S().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
