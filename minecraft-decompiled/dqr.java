import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dqr extends dor {
   public static final MapCodec<dqr> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mm.e.q().fieldOf("candle").forGetter($$0x -> $$0x.h), t()).apply($$0, dqr::new)
   );
   public static final ees d = dor.b;
   private static final fjm e = fjj.a(dpz.b(2.0, 8.0, 14.0), dpz.b(14.0, 0.0, 8.0));
   private static final Map<dqq, dqr> f = Maps.newHashMap();
   private static final Iterable<fis> g = List.of(new fis(8.0, 16.0, 8.0).c(0.0625));
   private final dqq h;

   @Override
   public MapCodec<dqr> a() {
      return c;
   }

   protected dqr(dpz $$0, eea.d $$1) {
      super($$1);
      this.l(this.C.b().b(d, false));
      if ($$0 instanceof dqq $$2) {
         f.put($$2, this);
         this.h = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dqq.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<fis> b(eeb $$0) {
      return g;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return e;
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      if ($$0.a(dcz.px) || $$0.a(dcz.vy)) {
         return bxj.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bxj.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      bxj $$5 = dqn.a($$1, $$2, dqb.ex.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(fio $$0) {
      return $$0.g().e - $$0.b().v() > 0.5;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(d);
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return new dcv(dqb.ex);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4 == jh.a && !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return dqn.d;
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   public static eeb a(dqq $$0) {
      return f.get($$0).m();
   }

   public static boolean h(eeb $$0) {
      return $$0.a(azo.bo, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
