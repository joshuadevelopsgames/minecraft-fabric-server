import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dmx extends dlv, dmc, dnm, dnz.a {
   @Nullable
   efy a(int var1, int var2, egz var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(eka.a var1, int var2, int var3);

   default int b(eka.a $$0, jb $$1) {
      return this.a($$0, $$1.u(), $$1.w());
   }

   int E_();

   dnz I_();

   default jl<dnx> v(jb $$0) {
      return this.I_().a($$0);
   }

   default Stream<eeb> c(fin $$0) {
      int $$1 = bcb.a($$0.a);
      int $$2 = bcb.a($$0.d);
      int $$3 = bcb.a($$0.b);
      int $$4 = bcb.a($$0.e);
      int $$5 = bcb.a($$0.c);
      int $$6 = bcb.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(jb $$0, dme $$1) {
      return $$1.getColor(this.v($$0).a(), $$0.u(), $$0.w());
   }

   @Override
   default jl<dnx> getNoiseBiome(int $$0, int $$1, int $$2) {
      efy $$3 = this.a(jw.e($$0), jw.e($$2), egz.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   jl<dnx> a(int var1, int var2, int var3);

   boolean B_();

   int Q();

   ehy G_();

   @Override
   default int L_() {
      return this.G_().n();
   }

   @Override
   default int M_() {
      return this.G_().o();
   }

   default jb a(eka.a $$0, jb $$1) {
      return new jb($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean w(jb $$0) {
      return this.a_($$0).l();
   }

   default boolean x(jb $$0) {
      if ($$0.v() >= this.Q()) {
         return this.h($$0);
      } else {
         jb $$1 = new jb($$0.u(), this.Q(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (jb var4 = $$1.e(); var4.v() > $$0.v(); var4 = var4.e()) {
               eeb $$2 = this.a_(var4);
               if ($$2.g() > 0 && !$$2.n()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float y(jb $$0) {
      return this.z($$0) - 0.5F;
   }

   @Deprecated
   default float z(jb $$0) {
      float $$1 = this.C($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return bcb.h(this.G_().s(), $$2, 1.0F);
   }

   default efy A(jb $$0) {
      return this.a(ke.a($$0.u()), ke.a($$0.w()));
   }

   default efy a(int $$0, int $$1) {
      return this.a($$0, $$1, egz.n, true);
   }

   default efy a(int $$0, int $$1, egz $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default dly c(int $$0, int $$1) {
      return this.a($$0, $$1, egz.c, false);
   }

   default boolean B(jb $$0) {
      return this.b_($$0).a(azu.a);
   }

   default boolean d(fin $$0) {
      int $$1 = bcb.a($$0.a);
      int $$2 = bcb.c($$0.d);
      int $$3 = bcb.a($$0.b);
      int $$4 = bcb.c($$0.e);
      int $$5 = bcb.a($$0.c);
      int $$6 = bcb.c($$0.f);
      jb.a $$7 = new jb.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               eeb $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.y().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int C(jb $$0) {
      return this.c($$0, this.E_());
   }

   default int c(jb $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(ke.a($$0), ke.a($$1));
   }

   @Deprecated
   default boolean D(jb $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(jb $$0, jb $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.L_() && $$1 <= this.ao() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = ke.a($$0);
      int $$5 = ke.a($$2);
      int $$6 = ke.a($$1);
      int $$7 = ke.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   jz K_();

   cyd L();

   default <T> jn<T> a(amd<? extends jy<? extends T>> $$0) {
      jy<T> $$1 = this.K_().f($$0);
      return $$1.a(this.L());
   }
}
