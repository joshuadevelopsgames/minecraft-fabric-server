import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record ku(Optional<bg<dfm.c, ku.a>> e) implements dm<dfm> {
   public static final Codec<ku> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(ku.a.a).optionalFieldOf("modifiers").forGetter(ku::b)).apply($$0, ku::new));

   @Override
   public kp<dfm> a() {
      return kq.o;
   }

   public boolean a(dfm $$0) {
      return !this.e.isPresent() || this.e.get().a($$0.b());
   }

   public Optional<bg<dfm.c, ku.a>> b() {
      return this.e;
   }

   public record a(Optional<jp<cbn>> b, Optional<ame> c, cx.c d, Optional<cbq.a> e, Optional<bzx> f) implements Predicate<dfm.c> {
      public static final Codec<ku.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               ka.a(mn.c).optionalFieldOf("attribute").forGetter(ku.a::a),
               ame.a.optionalFieldOf("id").forGetter(ku.a::b),
               cx.c.d.optionalFieldOf("amount", cx.c.c).forGetter(ku.a::c),
               cbq.a.f.optionalFieldOf("operation").forGetter(ku.a::d),
               bzx.m.optionalFieldOf("slot").forGetter(ku.a::e)
            )
            .apply($$0, ku.a::new)
      );

      public boolean a(dfm.c $$0) {
         if (this.b.isPresent() && !this.b.get().a($$0.a())) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().equals($$0.b().a())) {
            return false;
         } else if (!this.d.d($$0.b().b())) {
            return false;
         } else {
            return this.e.isPresent() && this.e.get() != $$0.b().c() ? false : !this.f.isPresent() || this.f.get() == $$0.c();
         }
      }

      public Optional<jp<cbn>> a() {
         return this.b;
      }

      public Optional<ame> b() {
         return this.c;
      }

      public cx.c c() {
         return this.d;
      }

      public Optional<cbq.a> d() {
         return this.e;
      }

      public Optional<bzx> e() {
         return this.f;
      }
   }
}
