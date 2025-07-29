import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dua extends dpl {
   public static final MapCodec<dua> a = b(dua::new);
   public static final eez<jh> b = eer.S;
   public static final ees c = eer.i;
   private final Function<eeb, fjm> d;
   private final Map<jh, fjm> e;

   @Override
   public MapCodec<dua> a() {
      return a;
   }

   public dua(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jh.a).b(c, true));
      fjm $$1 = dpz.b(12.0, 11.0, 16.0);
      this.d = this.b($$1);
      this.e = ImmutableMap.builderWithExpectedSize(5).putAll(fjj.c(fjj.a($$1, dpz.a(4.0, 8.0, 10.0, 0.0, 4.0)))).put(jh.a, $$1).build();
   }

   private Function<eeb, fjm> b(fjm $$0) {
      fjm $$1 = fjj.a(dpz.b(16.0, 10.0, 16.0), dpz.b(8.0, 4.0, 10.0));
      fjm $$2 = fjj.a($$1, $$0, fiw.e);
      Map<jh, fjm> $$3 = fjj.d(dpz.a(4.0, 4.0, 8.0, 0.0, 8.0), new fis(8.0, 6.0, 8.0).c(0.0625));
      return this.a($$2x -> fjj.a($$2, fjj.a($$3.get($$2x.c(b)), fjj.b(), fiw.i)), new efe[]{c});
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2) {
      return this.e.get($$0.c(b));
   }

   @Override
   public eeb a(dgo $$0) {
      jh $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jh.a.b ? jh.a : $$1).b(c, true);
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ecc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return $$0.C ? null : a($$2, ebb.s, ecc::a);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof ecc $$5) {
         $$3.a($$5);
         $$3.a(azj.ae);
      }

      return bxj.a;
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dmu $$0, jb $$1, eeb $$2) {
      boolean $$3 = !$$0.E($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, $$3), 2);
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      bxf.a($$0, $$1, $$2);
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

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      eaz $$5 = $$1.c_($$2);
      if ($$5 instanceof ecc) {
         ecc.a($$1, $$2, $$0, $$3, (ecc)$$5);
      }
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
