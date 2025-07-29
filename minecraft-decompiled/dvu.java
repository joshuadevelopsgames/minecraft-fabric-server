import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dvu extends dpz {
   public static final ees b = eer.N;
   public static final ees c = eer.O;
   public static final ees d = eer.P;
   public static final ees e = eer.Q;
   public static final ees f = eer.L;
   public static final ees g = eer.M;
   public static final Map<jh, ees> h = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jh.c, b, jh.f, c, jh.d, d, jh.e, e, jh.b, f, jh.a, g)));
   private final Function<eeb, fjm> a;

   protected dvu(float $$0, eea.d $$1) {
      super($$1);
      this.a = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dvu> a();

   private Function<eeb, fjm> a(float $$0) {
      fjm $$1 = dpz.a((double)$$0);
      Map<jh, fjm> $$2 = fjj.d(dpz.c($$0, 0.0, 8.0));
      return this.a($$2x -> {
         fjm $$3 = $$1;

         for (Entry<jh, ees> $$4 : h.entrySet()) {
            if ($$2x.c($$4.getValue())) {
               $$3 = fjj.a($$2.get($$4.getKey()), $$3);
            }
         }

         return $$3;
      });
   }

   @Override
   protected boolean e_(eeb $$0) {
      return false;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.a.apply($$0);
   }
}
