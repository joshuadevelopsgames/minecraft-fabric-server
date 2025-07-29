import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record li(Optional<bg<aut<xo>, li.a>> e, Optional<String> f, Optional<String> g, cx.d h, Optional<Boolean> i) implements dm<dgf> {
   public static final Codec<li> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            bg.a(li.a.a).optionalFieldOf("pages").forGetter(li::b),
            Codec.STRING.optionalFieldOf("author").forGetter(li::c),
            Codec.STRING.optionalFieldOf("title").forGetter(li::d),
            cx.d.d.optionalFieldOf("generation", cx.d.c).forGetter(li::e),
            Codec.BOOL.optionalFieldOf("resolved").forGetter(li::f)
         )
         .apply($$0, li::new)
   );

   @Override
   public kp<dgf> a() {
      return kq.V;
   }

   public boolean a(dgf $$0) {
      if (this.f.isPresent() && !this.f.get().equals($$0.e())) {
         return false;
      } else if (this.g.isPresent() && !this.g.get().equals($$0.d().a())) {
         return false;
      } else if (!this.h.d($$0.f())) {
         return false;
      } else {
         return this.i.isPresent() && this.i.get() != $$0.g() ? false : !this.e.isPresent() || this.e.get().a($$0.a());
      }
   }

   public Optional<bg<aut<xo>, li.a>> b() {
      return this.e;
   }

   public Optional<String> c() {
      return this.f;
   }

   public Optional<String> d() {
      return this.g;
   }

   public cx.d e() {
      return this.h;
   }

   public Optional<Boolean> f() {
      return this.i;
   }

   public record a(xo b) implements Predicate<aut<xo>> {
      public static final Codec<li.a> a = xq.a.xmap(li.a::new, li.a::a);

      public boolean a(aut<xo> $$0) {
         return $$0.a().equals(this.b);
      }

      public xo a() {
         return this.b;
      }
   }
}
