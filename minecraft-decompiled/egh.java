import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class egh extends egs {
   private final egi n;
   private final boolean o;

   public egh(egi $$0, boolean $$1) {
      super($$0.f(), egv.a, $$0.l, $$0.I().K_().f(mn.aK), $$0.v());
      this.n = $$0;
      this.o = $$1;
   }

   @Nullable
   @Override
   public eaz c_(jb $$0) {
      return this.n.c_($$0);
   }

   @Override
   public eeb a_(jb $$0) {
      return this.n.a_($$0);
   }

   @Override
   public fal b_(jb $$0) {
      return this.n.b_($$0);
   }

   @Override
   public egj b(int $$0) {
      return this.o ? this.n.b($$0) : super.b($$0);
   }

   @Nullable
   @Override
   public eeb a(jb $$0, eeb $$1, int $$2) {
      return this.o ? this.n.a($$0, $$1, $$2) : null;
   }

   @Override
   public void a(eaz $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(bzm $$0) {
      if (this.o) {
         this.n.a($$0);
      }
   }

   @Override
   public void a(egz $$0) {
      if (this.o) {
         super.a($$0);
      }
   }

   @Override
   public egj[] d() {
      return this.n.d();
   }

   @Override
   public void a(eka.a $$0, long[] $$1) {
   }

   private eka.a c(eka.a $$0) {
      if ($$0 == eka.a.a) {
         return eka.a.b;
      } else {
         return $$0 == eka.a.c ? eka.a.d : $$0;
      }
   }

   @Override
   public eka a(eka.a $$0) {
      return this.n.a($$0);
   }

   @Override
   public int a(eka.a $$0, int $$1, int $$2) {
      return this.n.a(this.c($$0), $$1, $$2);
   }

   @Override
   public jl<dnx> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.n.getNoiseBiome($$0, $$1, $$2);
   }

   @Override
   public dlz f() {
      return this.n.f();
   }

   @Nullable
   @Override
   public evg a(euy $$0) {
      return this.n.a($$0);
   }

   @Override
   public void a(euy $$0, evg $$1) {
   }

   @Override
   public Map<euy, evg> g() {
      return this.n.g();
   }

   @Override
   public void a(Map<euy, evg> $$0) {
   }

   @Override
   public LongSet b(euy $$0) {
      return this.n.b($$0);
   }

   @Override
   public void a(euy $$0, long $$1) {
   }

   @Override
   public Map<euy, LongSet> h() {
      return this.n.h();
   }

   @Override
   public void b(Map<euy, LongSet> $$0) {
   }

   @Override
   public void i() {
      this.n.i();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public egz n() {
      return this.n.n();
   }

   @Override
   public void d(jb $$0) {
   }

   @Override
   public void e(jb $$0) {
   }

   @Override
   public void a(ui $$0) {
   }

   @Nullable
   @Override
   public ui f(jb $$0) {
      return this.n.f($$0);
   }

   @Nullable
   @Override
   public ui a(jb $$0, jn.a $$1) {
      return this.n.a($$0, $$1);
   }

   @Override
   public void a(Predicate<eeb> $$0, BiConsumer<jb, eeb> $$1) {
      this.n.a($$0, $$1);
   }

   @Override
   public fkn<dpz> q() {
      return this.o ? this.n.q() : fkd.a();
   }

   @Override
   public fkn<fak> r() {
      return this.o ? this.n.r() : fkd.a();
   }

   @Override
   public efy.b a(long $$0) {
      return this.n.a($$0);
   }

   @Nullable
   @Override
   public eld v() {
      return this.n.v();
   }

   @Override
   public efx F() {
      if (this.o) {
         return super.F();
      } else {
         throw (UnsupportedOperationException)ag.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   @Override
   public efx G() {
      if (this.o) {
         return super.G();
      } else {
         throw (UnsupportedOperationException)ag.b(new UnsupportedOperationException("Meaningless in this context"));
      }
   }

   public egi H() {
      return this.n;
   }

   @Override
   public boolean x() {
      return this.n.x();
   }

   @Override
   public void a(boolean $$0) {
      this.n.a($$0);
   }

   @Override
   public void a(doa $$0, dog.f $$1) {
      if (this.o) {
         this.n.a($$0, $$1);
      }
   }

   @Override
   public void C() {
      this.n.C();
   }

   @Override
   public ezv D() {
      return this.n.D();
   }
}
