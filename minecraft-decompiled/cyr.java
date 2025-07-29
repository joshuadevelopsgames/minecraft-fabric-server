import java.util.Optional;
import javax.annotation.Nullable;

public class cyr extends cym {
   private static final int m = 0;
   private static final int n = 1;
   private static final int o = 3;
   private static final int p = 1;
   private static final int q = 28;
   private static final int r = 28;
   private static final int s = 37;
   private static final int t = 0;
   private final bxc u = new bxr(1) {
      @Override
      public boolean b(int $$0, dcv $$1) {
         return $$1.a(azx.bh);
      }

      @Override
      public int an_() {
         return 1;
      }
   };
   private final cyr.a v;
   private final cyz w;
   private final cyy x;

   public cyr(int $$0, bxc $$1) {
      this($$0, $$1, new daj(3), cyz.a);
   }

   public cyr(int $$0, bxc $$1, cyy $$2, cyz $$3) {
      super(czv.j, $$0);
      a($$2, 3);
      this.x = $$2;
      this.w = $$3;
      this.v = new cyr.a(this.u, 0, 136, 110);
      this.a(this.v);
      this.a($$2);
      this.c($$1, 36, 137);
   }

   @Override
   public void a(cut $$0) {
      super.a($$0);
      if (!$$0.ai().C) {
         dcv $$1 = this.v.a(this.v.a());
         if (!$$1.f()) {
            $$0.a($$1, false);
         }
      }
   }

   @Override
   public boolean b(cut $$0) {
      return a(this.w, $$0, dqb.gn);
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public dcv b(cut $$0, int $$1) {
      dcv $$2 = dcv.l;
      dak $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dcv $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return dcv.l;
            }

            $$3.b($$4, $$2);
         } else if (!this.v.h() && this.v.a($$4) && $$4.M() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return dcv.l;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return dcv.l;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return dcv.l;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return dcv.l;
         }

         if ($$4.f()) {
            $$3.e(dcv.l);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return dcv.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(0);
   }

   public static int a(@Nullable jl<byo> $$0) {
      return $$0 == null ? 0 : mm.d.t().a($$0) + 1;
   }

   @Nullable
   public static jl<byo> e(int $$0) {
      return $$0 == 0 ? null : mm.d.t().a($$0 - 1);
   }

   @Nullable
   public jl<byo> m() {
      return e(this.x.a(1));
   }

   @Nullable
   public jl<byo> n() {
      return e(this.x.a(2));
   }

   public void a(Optional<jl<byo>> $$0, Optional<jl<byo>> $$1) {
      if (this.v.h()) {
         this.x.a(1, a($$0.orElse(null)));
         this.x.a(2, a($$1.orElse(null)));
         this.v.a(1);
         this.w.a(dmu::q);
      }
   }

   public boolean o() {
      return !this.u.a(0).f();
   }

   static class a extends dak {
      public a(bxc $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(dcv $$0) {
         return $$0.a(azx.bh);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
