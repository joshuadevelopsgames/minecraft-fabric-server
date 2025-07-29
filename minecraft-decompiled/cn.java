import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cn(Optional<jp<dcr>> b, cx.d c, bo d) implements Predicate<dcv> {
   public static final Codec<cn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ka.a(mn.N).optionalFieldOf("items").forGetter(cn::a), cx.d.d.optionalFieldOf("count", cx.d.c).forGetter(cn::b), bo.b.forGetter(cn::c))
         .apply($$0, cn::new)
   );

   public boolean a(dcv $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else {
         return !this.c.d($$0.M()) ? false : this.d.a($$0);
      }
   }

   public Optional<jp<dcr>> a() {
      return this.b;
   }

   public cx.d b() {
      return this.c;
   }

   public bo c() {
      return this.d;
   }

   public static class a {
      private Optional<jp<dcr>> a = Optional.empty();
      private cx.d b = cx.d.c;
      private bo c = bo.a;

      public static cn.a a() {
         return new cn.a();
      }

      public cn.a a(jm<dcr> $$0, dmt... $$1) {
         this.a = Optional.of(jp.a($$0x -> $$0x.h().e(), $$1));
         return this;
      }

      public cn.a a(jm<dcr> $$0, bae<dcr> $$1) {
         this.a = Optional.of($$0.b($$1));
         return this;
      }

      public cn.a a(cx.d $$0) {
         this.b = $$0;
         return this;
      }

      public cn.a a(bo $$0) {
         this.c = $$0;
         return this;
      }

      public cn b() {
         return new cn(this.a, this.b, this.c);
      }
   }
}
