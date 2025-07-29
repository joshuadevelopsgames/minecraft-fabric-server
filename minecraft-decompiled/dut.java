import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dut extends dsw {
   public static final MapCodec<dut> a = b(dut::new);
   public static final ees b = eer.A;
   private final Function<eeb, fjm> d;

   @Override
   public MapCodec<dut> a() {
      return a;
   }

   protected dut(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, jh.c).b(b, false).b(c, eem.b));
      this.d = this.b();
   }

   private Function<eeb, fjm> b() {
      Map<eem, Map<jh, fjm>> $$0 = fjj.e(dpz.b(6.0, 8.0, 10.0, 16.0));
      return this.a($$1 -> $$0.get($$1.c(c)).get($$1.c(f)), new efe[]{b});
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if ($$1.C) {
         eeb $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }
      } else {
         this.b($$0, $$1, $$2, null);
      }

      return bxj.a;
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, dmn $$3, BiConsumer<dcv, jb> $$4) {
      if ($$3.g()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(eeb $$0, dmu $$1, jb $$2, @Nullable cut $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.d($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? ejb.a : ejb.e, $$2);
   }

   protected static void a(@Nullable cut $$0, dmv $$1, jb $$2, eeb $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, ayz.pd, aza.e, 0.3F, $$4);
   }

   private static void a(eeb $$0, dmv $$1, jb $$2, float $$3) {
      jh $$4 = $$0.c(f).g();
      jh $$5 = n($$0).g();
      double $$6 = $$2.u() + 0.5 + 0.1 * $$4.j() + 0.2 * $$5.j();
      double $$7 = $$2.v() + 0.5 + 0.1 * $$4.k() + 0.2 * $$5.k();
      double $$8 = $$2.w() + 0.5 + 0.1 * $$4.l() + 0.2 * $$5.l();
      $$1.a(new lz(16711680, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(eeb $$0) {
      return true;
   }

   private void d(eeb $$0, dmu $$1, jb $$2) {
      jh $$3 = n($$0).g();
      fbt $$4 = fbp.a($$1, $$3, $$3.o().d() ? jh.b : $$0.c(f));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c, f, b);
   }
}
