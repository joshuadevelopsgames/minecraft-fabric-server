import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ch(Optional<jp<fak>> b, Optional<ds> c) {
   public static final Codec<ch> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ka.a(mn.H).optionalFieldOf("fluids").forGetter(ch::a), ds.a.optionalFieldOf("state").forGetter(ch::b)).apply($$0, ch::new)
   );

   public boolean a(aub $$0, jb $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         fal $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<jp<fak>> a() {
      return this.b;
   }

   public Optional<ds> b() {
      return this.c;
   }

   public static class a {
      private Optional<jp<fak>> a = Optional.empty();
      private Optional<ds> b = Optional.empty();

      private a() {
      }

      public static ch.a a() {
         return new ch.a();
      }

      public ch.a a(fak $$0) {
         this.a = Optional.of(jp.a($$0.k()));
         return this;
      }

      public ch.a a(jp<fak> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ch.a a(ds $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ch b() {
         return new ch(this.a, this.b);
      }
   }
}
