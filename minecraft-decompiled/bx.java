import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bx(
   Optional<Boolean> b, Optional<Boolean> c, Optional<Boolean> d, Optional<Boolean> e, Optional<Boolean> f, Optional<Boolean> g, Optional<Boolean> h
) {
   public static final Codec<bx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            Codec.BOOL.optionalFieldOf("is_on_ground").forGetter(bx::a),
            Codec.BOOL.optionalFieldOf("is_on_fire").forGetter(bx::b),
            Codec.BOOL.optionalFieldOf("is_sneaking").forGetter(bx::c),
            Codec.BOOL.optionalFieldOf("is_sprinting").forGetter(bx::d),
            Codec.BOOL.optionalFieldOf("is_swimming").forGetter(bx::e),
            Codec.BOOL.optionalFieldOf("is_flying").forGetter(bx::f),
            Codec.BOOL.optionalFieldOf("is_baby").forGetter(bx::g)
         )
         .apply($$0, bx::new)
   );

   public boolean a(bzm $$0) {
      if (this.b.isPresent() && $$0.aK() != this.b.get()) {
         return false;
      } else if (this.c.isPresent() && $$0.cb() != this.c.get()) {
         return false;
      } else if (this.d.isPresent() && $$0.cl() != this.d.get()) {
         return false;
      } else if (this.e.isPresent() && $$0.cm() != this.e.get()) {
         return false;
      } else if (this.f.isPresent() && $$0.cn() != this.f.get()) {
         return false;
      } else {
         if (this.g.isPresent()) {
            boolean $$3 = $$0 instanceof cam $$1 && ($$1.fQ() || $$1 instanceof cut $$2 && $$2.gt().b);
            if ($$3 != this.g.get()) {
               return false;
            }
         }

         return !(this.h.isPresent() && $$0 instanceof cam $$4) || $$4.g_() == this.h.get();
      }
   }

   public Optional<Boolean> a() {
      return this.b;
   }

   public Optional<Boolean> b() {
      return this.c;
   }

   public Optional<Boolean> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public Optional<Boolean> f() {
      return this.g;
   }

   public Optional<Boolean> g() {
      return this.h;
   }

   public static class a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();
      private Optional<Boolean> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();
      private Optional<Boolean> e = Optional.empty();
      private Optional<Boolean> f = Optional.empty();
      private Optional<Boolean> g = Optional.empty();

      public static bx.a a() {
         return new bx.a();
      }

      public bx.a a(Boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bx.a b(Boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bx.a c(Boolean $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bx.a d(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bx.a e(Boolean $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public bx.a f(Boolean $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public bx.a g(Boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public bx b() {
         return new bx(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
