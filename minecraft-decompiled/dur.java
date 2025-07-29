import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dur extends dpl {
   public static final MapCodec<dur> a = b(dur::new);
   public static final eez<jh> b = dub.f;
   public static final ees c = eer.A;
   public static final ees d = eer.r;
   private static final fjm e = fjj.a(dpz.b(16.0, 0.0, 2.0), dpz.b(8.0, 2.0, 14.0));
   private static final Map<jh, fjm> f = fjj.c(
      fjj.a(dpz.a(16.0, 10.0, 14.0, 1.0, 5.333333), dpz.a(16.0, 12.0, 16.0, 5.333333, 9.666667), dpz.a(16.0, 14.0, 18.0, 9.666667, 14.0), e)
   );
   private static final int g = 2;

   @Override
   public MapCodec<dur> a() {
      return a;
   }

   protected dur(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jh.c).b(c, false).b(d, false));
   }

   @Override
   protected fjm d_(eeb $$0) {
      return e;
   }

   @Override
   protected boolean g_(eeb $$0) {
      return true;
   }

   @Override
   public eeb a(dgo $$0) {
      dmu $$1 = $$0.q();
      dcv $$2 = $$0.n();
      cut $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gQ()) {
         dfd $$5 = $$2.a(kq.aa, dfd.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, $$4);
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return e;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return f.get($$0.c(b));
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ecf($$0, $$1);
   }

   public static boolean a(@Nullable cam $$0, dmu $$1, jb $$2, eeb $$3, dcv $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable cam $$0, dmu $$1, jb $$2, eeb $$3, dcv $$4) {
      if ($$1.c_($$2) instanceof ecf $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, ayz.cz, aza.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bzm $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      eeb $$5 = $$3.b(c, false).b(d, $$4);
      $$1.a($$2, $$5, 3);
      $$1.a(ejb.c, $$2, ejb.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dmu $$0, jb $$1, eeb $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dmu $$0, jb $$1, eeb $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, $$3), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dmu $$0, jb $$1, eeb $$2) {
      fbt $$3 = fbp.a($$0, $$2.c(b).g(), jh.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      if ($$0.c(c)) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected boolean f_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$3 == jh.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      if ($$0.c(d)) {
         eaz $$3 = $$1.c_($$2);
         if ($$3 instanceof ecf) {
            return ((ecf)$$3).k();
         }
      }

      return 0;
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      if ($$1.c(d)) {
         return bxj.f;
      } else if ($$0.a(azx.bf)) {
         return (bxj)(a($$4, $$2, $$3, $$1, $$0) ? bxj.a : bxj.e);
      } else {
         return (bxj)($$0.f() && $$5 == bxi.a ? bxj.e : bxj.f);
      }
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bxj.a;
      } else {
         return bxj.c;
      }
   }

   @Nullable
   @Override
   protected bxm b(eeb $$0, dmu $$1, jb $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dmu $$0, jb $$1, cut $$2) {
      eaz $$3 = $$0.c_($$1);
      if ($$3 instanceof ecf) {
         $$2.a((ecf)$$3);
         $$2.a(azj.av);
      }
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
