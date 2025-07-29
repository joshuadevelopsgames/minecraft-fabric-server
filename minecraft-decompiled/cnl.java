import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cnl extends cmb {
   public static final cnl.d a = new cnl.d(cnl.b.a, dbt.a, dbt.a);
   private static final alh<Integer> c = all.a(cnl.class, alj.b);
   public static final List<cnl.d> b = List.of(
      new cnl.d(cnl.b.h, dbt.b, dbt.h),
      new cnl.d(cnl.b.g, dbt.h, dbt.h),
      new cnl.d(cnl.b.g, dbt.h, dbt.l),
      new cnl.d(cnl.b.l, dbt.a, dbt.h),
      new cnl.d(cnl.b.b, dbt.l, dbt.h),
      new cnl.d(cnl.b.a, dbt.b, dbt.a),
      new cnl.d(cnl.b.f, dbt.g, dbt.d),
      new cnl.d(cnl.b.j, dbt.k, dbt.e),
      new cnl.d(cnl.b.l, dbt.a, dbt.o),
      new cnl.d(cnl.b.f, dbt.a, dbt.e),
      new cnl.d(cnl.b.i, dbt.a, dbt.h),
      new cnl.d(cnl.b.l, dbt.a, dbt.b),
      new cnl.d(cnl.b.d, dbt.j, dbt.g),
      new cnl.d(cnl.b.e, dbt.f, dbt.d),
      new cnl.d(cnl.b.k, dbt.o, dbt.a),
      new cnl.d(cnl.b.c, dbt.h, dbt.o),
      new cnl.d(cnl.b.j, dbt.o, dbt.a),
      new cnl.d(cnl.b.g, dbt.a, dbt.e),
      new cnl.d(cnl.b.a, dbt.o, dbt.a),
      new cnl.d(cnl.b.b, dbt.h, dbt.a),
      new cnl.d(cnl.b.d, dbt.j, dbt.e),
      new cnl.d(cnl.b.g, dbt.e, dbt.e)
   );
   private boolean e = true;

   public cnl(bzv<? extends cnl> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cnl.b $$0, dbt $$1, dbt $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static dbt c(int $$0) {
      return dbt.a($$0 >> 16 & 0xFF);
   }

   public static dbt r(int $$0) {
      return dbt.a($$0 >> 24 & 0xFF);
   }

   public static cnl.b s(int $$0) {
      return cnl.b.a($$0 & 65535);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(c, a.a());
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Variant", cnl.d.a, new cnl.d(this.gS()));
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      cnl.d $$1 = $$0.<cnl.d>a("Variant", cnl.d.a).orElse(a);
      this.t($$1.a());
   }

   private void t(int $$0) {
      this.ay.a(c, $$0);
   }

   @Override
   public boolean q(int $$0) {
      return !this.e;
   }

   private int gS() {
      return this.ay.a(c);
   }

   public dbt gP() {
      return c(this.gS());
   }

   public dbt gQ() {
      return r(this.gS());
   }

   public cnl.b gR() {
      return s(this.gS());
   }

   private void a(cnl.b $$0) {
      int $$1 = this.gS();
      dbt $$2 = c($$1);
      dbt $$3 = r($$1);
      this.t(a($$0, $$2, $$3));
   }

   private void a(dbt $$0) {
      int $$1 = this.gS();
      cnl.b $$2 = s($$1);
      dbt $$3 = r($$1);
      this.t(a($$2, $$0, $$3));
   }

   private void b(dbt $$0) {
      int $$1 = this.gS();
      cnl.b $$2 = s($$1);
      dbt $$3 = c($$1);
      this.t(a($$2, $$3, $$0));
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      if ($$0 == kq.aC) {
         return c((kp<T>)$$0, this.gR());
      } else if ($$0 == kq.aD) {
         return c((kp<T>)$$0, this.gP());
      } else {
         return $$0 == kq.aE ? c((kp<T>)$$0, this.gQ()) : super.a($$0);
      }
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.aC);
      this.a($$0, kq.aD);
      this.a($$0, kq.aE);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.aC) {
         this.a(c(kq.aC, $$1));
         return true;
      } else if ($$0 == kq.aD) {
         this.a(c(kq.aD, $$1));
         return true;
      } else if ($$0 == kq.aE) {
         this.b(c(kq.aE, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a_(dcv $$0) {
      super.a_($$0);
      $$0.a(kq.aC, this);
      $$0.a(kq.aD, this);
      $$0.a(kq.aE, this);
   }

   @Override
   public dcv a() {
      return new dcv(dcz.rP);
   }

   @Override
   protected ayy p() {
      return ayz.Bp;
   }

   @Override
   protected ayy f_() {
      return ayz.Bq;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.Bs;
   }

   @Override
   protected ayy gH() {
      return ayz.Br;
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bck $$4 = $$0.H_();
      cnl.d $$6;
      if ($$3 instanceof cnl.c $$5) {
         $$6 = $$5.b;
      } else if ($$4.i() < 0.9) {
         $$6 = ag.a(b, $$4);
         $$3 = new cnl.c(this, $$6);
      } else {
         this.e = false;
         cnl.b[] $$8 = cnl.b.values();
         dbt[] $$9 = dbt.values();
         cnl.b $$10 = ag.a($$8, $$4);
         dbt $$11 = ag.a($$9, $$4);
         dbt $$12 = ag.a($$9, $$4);
         $$6 = new cnl.d($$10, $$11, $$12);
      }

      this.t($$6.a());
      return $$3;
   }

   public static boolean b(bzv<cnl> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return $$1.b_($$3.e()).a(azu.a) && $$1.a_($$3.d()).a(dqb.J) && ($$1.v($$3).a(azn.ap) || cnn.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements bda, dga {
      a("kob", cnl.a.a, 0),
      b("sunstreak", cnl.a.a, 1),
      c("snooper", cnl.a.a, 2),
      d("dasher", cnl.a.a, 3),
      e("brinely", cnl.a.a, 4),
      f("spotty", cnl.a.a, 5),
      g("flopper", cnl.a.b, 0),
      h("stripey", cnl.a.b, 1),
      i("glitter", cnl.a.b, 2),
      j("blockfish", cnl.a.b, 3),
      k("betty", cnl.a.b, 4),
      l("clayfish", cnl.a.b, 5);

      public static final Codec<cnl.b> m = bda.a(cnl.b::values);
      private static final IntFunction<cnl.b> o = baq.a(cnl.b::b, values(), a);
      public static final zm<ByteBuf, cnl.b> n = zk.a(o, cnl.b::b);
      private final String p;
      private final xo q;
      private final cnl.a r;
      private final int s;

      private b(final String $$0, final cnl.a $$1, final int $$2) {
         this.p = $$0;
         this.r = $$1;
         this.s = $$1.c | $$2 << 8;
         this.q = xo.c("entity.minecraft.tropical_fish.type." + this.p);
      }

      public static cnl.b a(int $$0) {
         return o.apply($$0);
      }

      public cnl.a a() {
         return this.r;
      }

      public int b() {
         return this.s;
      }

      @Override
      public String c() {
         return this.p;
      }

      public xo d() {
         return this.q;
      }

      @Override
      public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
         dbt $$4 = $$3.a(kq.aD, cnl.a.c());
         dbt $$5 = $$3.a(kq.aE, cnl.a.d());
         o[] $$6 = new o[]{o.u, o.h};
         int $$7 = cnl.b.indexOf(new cnl.d(this, $$4, $$5));
         if ($$7 != -1) {
            $$1.accept(xo.c(cnl.b($$7)).a($$6));
         } else {
            $$1.accept(this.q.e().a($$6));
            yc $$8 = xo.c("color.minecraft." + $$4.b());
            if ($$4 != $$5) {
               $$8.f(", ").b(xo.c("color.minecraft." + $$5.b()));
            }

            $$8.a($$6);
            $$1.accept($$8);
         }
      }
   }

   static class c extends cmb.a {
      final cnl.d b;

      c(cnl $$0, cnl.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public record d(cnl.b b, dbt c, dbt d) {
      public static final Codec<cnl.d> a = Codec.INT.xmap(cnl.d::new, cnl.d::a);

      public d(int $$0) {
         this(cnl.s($$0), cnl.c($$0), cnl.r($$0));
      }

      public int a() {
         return cnl.a(this.b, this.c, this.d);
      }
   }
}
