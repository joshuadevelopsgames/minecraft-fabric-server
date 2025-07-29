import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dnh implements dmc {
   protected final int a;
   protected final int b;
   protected final efy[][] c;
   protected boolean d;
   protected final dmu e;
   private final Supplier<jl<dnx>> f;

   public dnh(dmu $$0, jb $$1, jb $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.K_().f(mn.aK).b(doe.b));
      this.a = ke.a($$1.u());
      this.b = ke.a($$1.w());
      int $$3 = ke.a($$2.u());
      int $$4 = ke.a($$2.w());
      this.c = new efy[$$3 - this.a + 1][$$4 - this.b + 1];
      egc $$5 = $$0.T();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = ke.a($$1.u()); $$8 <= ke.a($$2.u()); $$8++) {
         for (int $$9 = ke.a($$1.w()); $$9 <= ke.a($$2.w()); $$9++) {
            efy $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private efy d(jb $$0) {
      return this.a(ke.a($$0.u()), ke.a($$0.w()));
   }

   private efy a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         efy $$4 = this.c[$$2][$$3];
         return (efy)($$4 != null ? $$4 : new ege(this.e, new dlz($$0, $$1), this.f.get()));
      } else {
         return new ege(this.e, new dlz($$0, $$1), this.f.get());
      }
   }

   @Override
   public eft F_() {
      return this.e.F_();
   }

   @Override
   public dly c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<fjm> c(@Nullable bzm $$0, fin $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public eaz c_(jb $$0) {
      efy $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public eeb a_(jb $$0) {
      if (this.u($$0)) {
         return dqb.a.m();
      } else {
         efy $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public fal b_(jb $$0) {
      if (this.u($$0)) {
         return fam.a.g();
      } else {
         efy $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int L_() {
      return this.e.L_();
   }

   @Override
   public int M_() {
      return this.e.M_();
   }
}
