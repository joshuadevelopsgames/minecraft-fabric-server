import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cng extends cmb {
   private static final String a = "type";
   private static final alh<Integer> b = all.a(cng.class, alj.b);

   public cng(bzv<? extends cng> $$0, dmu $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   public int gI() {
      return 5;
   }

   @Override
   public dcv a() {
      return new dcv(dcz.rN);
   }

   @Override
   protected ayy p() {
      return ayz.wS;
   }

   @Override
   protected ayy f_() {
      return ayz.wT;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.wV;
   }

   @Override
   protected ayy gH() {
      return ayz.wU;
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(b, cng.a.d.a());
   }

   @Override
   public void a(alh<?> $$0) {
      super.a($$0);
      if (b.equals($$0)) {
         this.j_();
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("type", cng.a.e, this.gP());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a($$0.<cng.a>a("type", cng.a.e).orElse(cng.a.d));
   }

   @Override
   public void a_(dcv $$0) {
      cmf.a(this, $$0);
      $$0.a(kq.aA, this);
   }

   private void a(cng.a $$0) {
      this.ay.a(b, $$0.i);
   }

   public cng.a gP() {
      return cng.a.g.apply(this.ay.a(b));
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      return $$0 == kq.aA ? c((kp<T>)$$0, this.gP()) : super.a($$0);
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.aA);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.aA) {
         this.a(c(kq.aA, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      bvt.a<cng.a> $$4 = bvt.b();
      $$4.a(cng.a.a, 30);
      $$4.a(cng.a.b, 50);
      $$4.a(cng.a.c, 15);
      $$4.a().a(this.ar).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gQ() {
      return this.gP().j;
   }

   @Override
   protected bzp e(cay $$0) {
      return super.e($$0).a(this.gQ());
   }

   public static enum a implements bda {
      a("small", 0, 0.5F),
      b("medium", 1, 1.0F),
      c("large", 2, 1.5F);

      public static final cng.a d = b;
      public static final bda.a<cng.a> e = bda.a(cng.a::values);
      static final IntFunction<cng.a> g = baq.a(cng.a::a, values(), baq.a.c);
      public static final zm<ByteBuf, cng.a> f = zk.a(g, cng.a::a);
      private final String h;
      final int i;
      final float j;

      private a(final String $$0, final int $$1, final float $$2) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
      }

      @Override
      public String c() {
         return this.h;
      }

      int a() {
         return this.i;
      }
   }
}
