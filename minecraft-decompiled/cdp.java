import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class cdp {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static cce<cau> a() {
      return cfq.a(
         (Function<cfq.b<cau>, ? extends App<cfq.c<cau>, cft<cau>>>)($$0 -> $$0.group($$0.b(cjo.i), $$0.c(cjo.n), $$0.a(cjo.o), $$0.a(cjo.r))
            .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
               if ($$5.H_().a(10) != 0) {
                  return false;
               } else {
                  List<cam> $$8 = $$0.b($$1);
                  Optional<cam> $$9 = $$8.stream().filter($$1xx -> a((cam)$$6, $$1xx)).findAny();
                  if (!$$9.isPresent()) {
                     Optional<cam> $$12 = a($$8);
                     if ($$12.isPresent()) {
                        a($$4, $$3, $$2, $$12.get());
                        return true;
                     } else {
                        $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                        return true;
                     }
                  } else {
                     for (int $$10 = 0; $$10 < 10; $$10++) {
                        fis $$11 = clj.a($$6, 20, 8);
                        if ($$11 != null && $$5.c(jb.a((jv)$$11))) {
                           $$2.a(new cjr($$11, 0.6F, 0));
                           break;
                        }
                     }

                     return true;
                  }
               }
            }))
      );
   }

   private static void a(cfr<?, cam> $$0, cfr<?, cdr> $$1, cfr<?, cjr> $$2, cam $$3) {
      $$0.a($$3);
      $$1.a(new cco($$3, true));
      $$2.a(new cjr(new cco($$3, false), 0.6F, 1));
   }

   private static Optional<cam> a(List<cam> $$0) {
      Map<cam, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<cam, Integer> b(List<cam> $$0) {
      Map<cam, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(cdp::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static cam a(cam $$0) {
      return $$0.eh().c(cjo.r).get();
   }

   private static boolean b(cam $$0) {
      return $$0.eh().c(cjo.r).isPresent();
   }

   private static boolean a(cam $$0, cam $$1) {
      return $$1.eh().c(cjo.r).filter($$1x -> $$1x == $$0).isPresent();
   }
}
