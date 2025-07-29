import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class dhi implements cuy.a<jl<dcr>>, Predicate<dcv> {
   public static final zm<wx, dhi> a = zk.c(mn.N).a(dhi::new, $$0 -> $$0.e);
   public static final zm<wx, Optional<dhi>> b = zk.c(mn.N)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new dhi((jp<dcr>)$$0)), $$0 -> $$0.<jp.a<dcr>>map($$0x -> $$0x.e).orElse(jp.a()));
   public static final Codec<jp<dcr>> c = aly.a(mn.N, dcr.e, false);
   public static final Codec<dhi> d = bbi.c(c).xmap(dhi::new, $$0 -> $$0.e);
   private final jp<dcr> e;

   private dhi(jp<dcr> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(dcz.a.e())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<dhi> $$0, dcv $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   @Deprecated
   public Stream<jl<dcr>> a() {
      return this.e.a();
   }

   public boolean b() {
      return this.e.b() == 0;
   }

   public boolean a(dcv $$0) {
      return $$0.a(this.e);
   }

   public boolean a(jl<dcr> $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof dhi $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static dhi a(dmt $$0) {
      return new dhi(jp.a($$0.h().e()));
   }

   public static dhi a(dmt... $$0) {
      return a(Arrays.stream($$0));
   }

   public static dhi a(Stream<? extends dmt> $$0) {
      return new dhi(jp.a($$0.map($$0x -> $$0x.h().e()).toList()));
   }

   public static dhi a(jp<dcr> $$0) {
      return new dhi($$0);
   }

   public diy c() {
      return (diy)this.e.d().map(diy.h::new, $$0 -> new diy.b($$0.stream().map(dhi::b).toList()));
   }

   public static diy a(Optional<dhi> $$0) {
      return $$0.<diy>map(dhi::c).orElse(diy.c.c);
   }

   private static diy b(jl<dcr> $$0) {
      diy $$1 = new diy.d($$0);
      dcv $$2 = $$0.a().i();
      if (!$$2.f()) {
         diy $$3 = new diy.f($$2);
         return new diy.j($$1, $$3);
      } else {
         return $$1;
      }
   }
}
