import javax.annotation.Nullable;

public class hks extends hkn implements dlv {
   public jb a = jb.c;
   public jb b = jb.c;
   public eeb c = dqb.L.m();
   @Nullable
   public jl<dnx> d;
   public dlv e = dmj.a;

   @Override
   public float a(jh $$0, boolean $$1) {
      return this.e.a($$0, $$1);
   }

   @Override
   public faa C_() {
      return this.e.C_();
   }

   @Override
   public int a(jb $$0, dme $$1) {
      return this.d == null ? -1 : $$1.getColor(this.d.a(), $$0.u(), $$0.w());
   }

   @Nullable
   @Override
   public eaz c_(jb $$0) {
      return null;
   }

   @Override
   public eeb a_(jb $$0) {
      return $$0.equals(this.b) ? this.c : dqb.a.m();
   }

   @Override
   public fal b_(jb $$0) {
      return this.a_($$0).y();
   }

   @Override
   public int M_() {
      return 1;
   }

   @Override
   public int L_() {
      return this.b.v();
   }
}
