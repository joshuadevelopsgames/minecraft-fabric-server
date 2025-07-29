import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public record ech(Optional<dcr> d, Optional<dcr> e, Optional<dcr> f, Optional<dcr> g) implements dga {
   public static final ech a = new ech(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<ech> b = mm.g.q().sizeLimitedListOf(4).xmap(ech::new, ech::a);
   public static final zm<wx, ech> c = zk.a(mn.N).a(zk.c(4)).a(ech::new, ech::a);

   private ech(List<dcr> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public ech(dcr $$0, dcr $$1, dcr $$2, dcr $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<dcr> a(List<dcr> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         dcr $$2 = $$0.get($$1);
         return $$2 == dcz.rS ? Optional.empty() : Optional.of($$2);
      }
   }

   public List<dcr> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(dcz.rS)).toList();
   }

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      if (!this.equals(a)) {
         $$1.accept(xn.a);
         a($$1, this.g);
         a($$1, this.e);
         a($$1, this.f);
         a($$1, this.d);
      }
   }

   private static void a(Consumer<xo> $$0, Optional<dcr> $$1) {
      $$0.accept(new dcv($$1.orElse(dcz.rS), 1).y().e().a(o.h));
   }

   public Optional<dcr> b() {
      return this.d;
   }

   public Optional<dcr> c() {
      return this.e;
   }

   public Optional<dcr> d() {
      return this.f;
   }

   public Optional<dcr> e() {
      return this.g;
   }
}
