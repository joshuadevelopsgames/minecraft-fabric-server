import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class ccq extends ccd<cau> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<cam, Float> f;
   private final Function<cam, Double> g;
   private final boolean h;

   public ccq(Function<cam, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public ccq(Function<cam, Float> $$0, Function<cam, Double> $$1) {
      this($$0, $$1, false);
   }

   public ccq(Function<cam, Float> $$0, Function<cam, Double> $$1, boolean $$2) {
      super(ag.a(() -> {
         Builder<cjo<?>, cjp> $$0x = ImmutableMap.builder();
         $$0x.put(cjo.o, cjp.c);
         $$0x.put(cjo.n, cjp.c);
         $$0x.put(cjo.Q, cjp.b);
         $$0x.put(cjo.S, cjp.b);
         $$0x.put(cjo.P, cjp.a);
         $$0x.put(cjo.s, cjp.b);
         $$0x.put(cjo.aa, cjp.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected float a(cau $$0) {
      return this.f.apply($$0);
   }

   private Optional<cut> b(cau $$0) {
      return $$0.eh().c(cjo.P);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aub $$0, cau $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.eh().a(cjo.s) && !$$1.eh().a(cjo.aa);
   }

   protected void b(aub $$0, cau $$1, long $$2) {
      $$1.eh().a(cjo.S, true);
   }

   protected void c(aub $$0, cau $$1, long $$2) {
      cbm<?> $$3 = $$1.eh();
      $$3.a(cjo.Q, 100);
      $$3.b(cjo.S);
      $$3.b(cjo.n);
      $$3.b(cjo.o);
   }

   protected void d(aub $$0, cau $$1, long $$2) {
      cut $$3 = this.b($$1).get();
      cbm<?> $$4 = $$1.eh();
      $$4.a(cjo.o, new cco($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < bcb.k($$5)) {
         $$4.b(cjo.n);
      } else {
         $$4.a(cjo.n, new cjr(new cco($$3, this.h, this.h), this.a($$1), 2));
      }
   }
}
