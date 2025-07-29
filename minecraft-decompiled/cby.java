import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cby<E extends cau> extends ccd<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<cau, bae<byd>> h;
   private final Function<E, fis> i;

   public cby(float $$0) {
      this($$0, $$0x -> azp.F, $$0x -> clj.a($$0x, 5, 4));
   }

   public cby(float $$0, int $$1) {
      this($$0, $$0x -> azp.F, $$1x -> cle.a($$1x, 5, 4, $$1, $$1x.h(0.0F).d, $$1x.h(0.0F).f, (float) (Math.PI / 2)));
   }

   public cby(float $$0, Function<cau, bae<byd>> $$1) {
      this($$0, $$1, $$0x -> clj.a($$0x, 5, 4));
   }

   public cby(float $$0, Function<cau, bae<byd>> $$1, Function<E, fis> $$2) {
      super(Map.of(cjo.aa, cjp.c, cjo.y, cjp.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
   }

   protected boolean a(aub $$0, E $$1) {
      return $$1.eh().c(cjo.y).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.eh().a(cjo.aa);
   }

   protected boolean a(aub $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aub $$0, E $$1, long $$2) {
      $$1.eh().a(cjo.aa, true);
      $$1.eh().b(cjo.n);
      $$1.S().n();
   }

   protected void c(aub $$0, E $$1, long $$2) {
      cbm<?> $$3 = $$1.eh();
      $$3.b(cjo.aa);
   }

   protected void d(aub $$0, E $$1, long $$2) {
      if ($$1.S().l()) {
         fis $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.eh().a(cjo.n, new cjr($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private fis a(E $$0, aub $$1) {
      if ($$0.cb()) {
         Optional<fis> $$2 = this.a((dly)$$1, $$0).map(fis::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return this.i.apply($$0);
   }

   private Optional<jb> a(dly $$0, bzm $$1) {
      jb $$2 = $$1.dx();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<jb> $$3;
         if (bcb.f($$1.ds()) == 2) {
            $$3 = $$1x -> jb.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(azu.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(azu.a);
         }

         return jb.a($$2, 5, 1, $$3);
      }
   }
}
