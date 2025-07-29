import javax.annotation.Nullable;

public class hbg implements dlv {
   public static final int a = 1;
   public static final int b = 3;
   private final int c;
   private final int d;
   private final int e;
   private final hbj[] f;
   private final dmu h;

   hbg(dmu $$0, int $$1, int $$2, int $$3, hbj[] $$4) {
      this.h = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Override
   public eeb a_(jb $$0) {
      return this.a(ke.a($$0.u()), ke.a($$0.v()), ke.a($$0.w())).b($$0);
   }

   @Override
   public fal b_(jb $$0) {
      return this.a(ke.a($$0.u()), ke.a($$0.v()), ke.a($$0.w())).b($$0).y();
   }

   @Override
   public float a(jh $$0, boolean $$1) {
      return this.h.a($$0, $$1);
   }

   @Override
   public faa C_() {
      return this.h.C_();
   }

   @Nullable
   @Override
   public eaz c_(jb $$0) {
      return this.a(ke.a($$0.u()), ke.a($$0.v()), ke.a($$0.w())).a($$0);
   }

   private hbj a(int $$0, int $$1, int $$2) {
      return this.f[a(this.c, this.d, this.e, $$0, $$1, $$2)];
   }

   @Override
   public int a(jb $$0, dme $$1) {
      return this.h.a($$0, $$1);
   }

   @Override
   public int L_() {
      return this.h.L_();
   }

   @Override
   public int M_() {
      return this.h.M_();
   }

   public static int a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$3 - $$0 + ($$4 - $$1) * 3 + ($$5 - $$2) * 3 * 3;
   }
}
