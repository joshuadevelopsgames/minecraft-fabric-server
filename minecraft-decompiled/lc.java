import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record lc(lc.a e) implements dm<dfj> {
   public static final Codec<lc> a = lc.a.a.xmap(lc::new, lc::b);

   @Override
   public kp<dfj> a() {
      return kq.ai;
   }

   public boolean a(dfj $$0) {
      return this.e.a($$0);
   }

   public lc.a b() {
      return this.e;
   }

   public record a(Optional<dfj.a> b, Optional<Boolean> c, Optional<Boolean> d) implements Predicate<dfj> {
      public static final Codec<lc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               dfj.a.g.optionalFieldOf("shape").forGetter(lc.a::a),
               Codec.BOOL.optionalFieldOf("has_twinkle").forGetter(lc.a::b),
               Codec.BOOL.optionalFieldOf("has_trail").forGetter(lc.a::c)
            )
            .apply($$0, lc.a::new)
      );

      public boolean a(dfj $$0) {
         if (this.b.isPresent() && this.b.get() != $$0.a()) {
            return false;
         } else {
            return this.c.isPresent() && this.c.get() != $$0.e() ? false : !this.d.isPresent() || this.d.get() == $$0.d();
         }
      }

      public Optional<dfj.a> a() {
         return this.b;
      }

      public Optional<Boolean> b() {
         return this.c;
      }

      public Optional<Boolean> c() {
         return this.d;
      }
   }
}
