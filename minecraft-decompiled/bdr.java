import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Set;

public enum bdr {
   a(blp.a),
   b(blp.b),
   c(blp.c),
   d(blp.d),
   e(blp.e),
   f(blp.f),
   g(blp.g),
   h(blp.h),
   i(blp.i),
   j(blp.j),
   k(blp.k),
   l(blp.l),
   m(blp.m),
   n(blp.n),
   o(blp.p),
   p(blp.o),
   q(blp.q),
   r(blp.r),
   s(blp.P),
   t(blp.s);

   public static final Set<TypeReference> u;
   private final TypeReference v;

   private bdr(final TypeReference $$0) {
      this.v = $$0;
   }

   static int a() {
      return ac.b().a().b();
   }

   public <A> Codec<A> a(final Codec<A> $$0, final DataFixer $$1, final int $$2) {
      return new Codec<A>() {
         public <T> DataResult<T> encode(A $$0x, DynamicOps<T> $$1x, T $$2x) {
            return $$0.encode($$0, $$1, $$2).flatMap($$1xxx -> $$1.mergeToMap($$1xxx, $$1.createString("DataVersion"), $$1.createInt(bdr.a())));
         }

         public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> $$0x, T $$1x) {
            int $$2x = $$0.get($$1, "DataVersion").flatMap($$0::getNumberValue).map(Number::intValue).result().orElse($$2);
            Dynamic<T> $$3 = new Dynamic($$0, $$0.remove($$1, "DataVersion"));
            Dynamic<T> $$4 = bdr.this.a($$1, $$3, $$2x);
            return $$0.decode($$4);
         }
      };
   }

   public <T> Dynamic<T> a(DataFixer $$0, Dynamic<T> $$1, int $$2, int $$3) {
      return $$0.update(this.v, $$1, $$2, $$3);
   }

   public <T> Dynamic<T> a(DataFixer $$0, Dynamic<T> $$1, int $$2) {
      return this.a($$0, $$1, $$2, a());
   }

   public ui a(DataFixer $$0, ui $$1, int $$2, int $$3) {
      return (ui)this.a($$0, new Dynamic(uw.a, $$1), $$2, $$3).getValue();
   }

   public ui a(DataFixer $$0, ui $$1, int $$2) {
      return this.a($$0, $$1, $$2, a());
   }

   static {
      u = Set.of(b.v);
   }
}
