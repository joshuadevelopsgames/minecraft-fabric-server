import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dsf extends dpl {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dsf> a = b(dsf::new);
   public static final eez<jh> b = dsd.a;
   public static final ees c = eer.G;
   private static final lm f = new lm();
   public static final Map<dcr, ln> d = new IdentityHashMap<>();
   private static final int g = 4;

   @Override
   public MapCodec<? extends dsf> a() {
      return a;
   }

   public static void a(dmt $$0, ln $$1) {
      d.put($$0.h(), $$1);
   }

   public static void a(dmt $$0) {
      d.put($$0.h(), new lr($$0.h()));
   }

   protected dsf(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jh.c).b(c, false));
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof ebu $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof ebv ? azj.ad : azj.af);
      }

      return bxj.a;
   }

   protected void a(aub $$0, eeb $$1, jb $$2) {
      ebu $$3 = $$0.a($$2, ebb.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         lk $$4 = new lk($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.A);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(ejb.a, $$2, ejb.a.a($$3.m()));
         } else {
            dcv $$6 = $$3.a($$5);
            ln $$7 = this.a($$0, $$6);
            if ($$7 != ln.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected ln a(dmu $$0, dcv $$1) {
      if (!$$1.a($$0.L())) {
         return f;
      } else {
         ln $$2 = d.get($$1.h());
         return $$2 != null ? $$2 : a($$1);
      }
   }

   private static ln a(dcv $$0) {
      return (ln)($$0.c(kq.D) ? lo.c : f);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      boolean $$6 = $$1.E($$2) || $$1.E($$2.d());
      boolean $$7 = $$0.c(c);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.b(c, true), 2);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.b(c, false), 2);
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ebu($$0, $$1);
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(b, $$0.d().g());
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      bxf.a($$0, $$1, $$2);
   }

   public static jv a(lk $$0) {
      return a($$0, 0.7, fis.c);
   }

   public static jv a(lk $$0, double $$1, fis $$2) {
      jh $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * $$3.j() + $$2.a(), $$1 * $$3.k() + $$2.b(), $$1 * $$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return cym.a($$1.c_($$2));
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
      $$0.a(b, c);
   }
}
