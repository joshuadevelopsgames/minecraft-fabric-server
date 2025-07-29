import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class dcl extends dcr {
   protected static final Map<dpz, Pair<Predicate<dgq>, Consumer<dgq>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dqb.i,
         Pair.of(dcl::b, a(dqb.cN.m())),
         dqb.lk,
         Pair.of(dcl::b, a(dqb.cN.m())),
         dqb.j,
         Pair.of(dcl::b, a(dqb.cN.m())),
         dqb.k,
         Pair.of(dcl::b, a(dqb.j.m())),
         dqb.ts,
         Pair.of((Predicate<dgq>)$$0 -> true, a(dqb.j.m(), dcz.eg))
      )
   );

   public dcl(dej $$0, float $$1, float $$2, dcr.a $$3) {
      super($$3.c($$0, $$1, $$2));
   }

   @Override
   public bxj a(dgq $$0) {
      dmu $$1 = $$0.q();
      jb $$2 = $$0.a();
      Pair<Predicate<dgq>, Consumer<dgq>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bxj.e;
      } else {
         Predicate<dgq> $$4 = (Predicate<dgq>)$$3.getFirst();
         Consumer<dgq> $$5 = (Consumer<dgq>)$$3.getSecond();
         if ($$4.test($$0)) {
            cut $$6 = $$0.o();
            $$1.a($$6, $$2, ayz.nk, aza.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, cam.d($$0.p()));
               }
            }

            return bxj.a;
         } else {
            return bxj.e;
         }
      }
   }

   public static Consumer<dgq> a(eeb $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(ejb.c, $$1.a(), ejb.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<dgq> a(eeb $$0, dmt $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(ejb.c, $$2.a(), ejb.a.a($$2.o(), $$0));
         dpz.a($$2.q(), $$2.a(), $$2.k(), new dcv($$1));
      };
   }

   public static boolean b(dgq $$0) {
      return $$0.k() != jh.a && $$0.q().a_($$0.a().d()).l();
   }
}
