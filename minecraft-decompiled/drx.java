import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class drx extends dpz implements dxl {
   public static final ees a = dvu.b;
   public static final ees b = dvu.c;
   public static final ees c = dvu.d;
   public static final ees d = dvu.e;
   public static final ees e = eer.I;
   public static final Map<jh, ees> f = dvu.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ag.a());
   private final Function<eeb, fjm> g;
   private final Function<eeb, fjm> h;

   protected drx(float $$0, float $$1, float $$2, float $$3, float $$4, eea.d $$5) {
      super($$5);
      this.g = this.a($$0, $$4, $$2, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
   }

   @Override
   protected abstract MapCodec<? extends drx> a();

   protected Function<eeb, fjm> a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      fjm $$5 = dpz.b($$0, 0.0, $$1);
      Map<jh, fjm> $$6 = fjj.c(dpz.a($$2, $$3, $$4, 0.0, 8.0));
      return this.a($$2x -> {
         fjm $$3x = $$5;

         for (Entry<jh, ees> $$4x : f.entrySet()) {
            if ($$2x.c($$4x.getValue())) {
               $$3x = fjj.a($$3x, $$6.get($$4x.getKey()));
            }
         }

         return $$3x;
      }, new efe[]{e});
   }

   @Override
   protected boolean e_(eeb $$0) {
      return !$$0.c(e);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.g.apply($$0);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(e) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      switch ($$1) {
         case c:
            return $$0.b(a, $$0.c(c)).b(b, $$0.c(d)).b(c, $$0.c(a)).b(d, $$0.c(b));
         case d:
            return $$0.b(a, $$0.c(b)).b(b, $$0.c(c)).b(c, $$0.c(d)).b(d, $$0.c(a));
         case b:
            return $$0.b(a, $$0.c(d)).b(b, $$0.c(a)).b(c, $$0.c(b)).b(d, $$0.c(c));
         default:
            return $$0;
      }
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      switch ($$1) {
         case b:
            return $$0.b(a, $$0.c(c)).b(c, $$0.c(a));
         case c:
            return $$0.b(b, $$0.c(d)).b(d, $$0.c(b));
         default:
            return super.a($$0, $$1);
      }
   }
}
