import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cr extends dl<cr.a> {
   @Override
   public Codec<cr.a> a() {
      return cr.a.a;
   }

   public void a(auc $$0, fis $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public record a(Optional<bj> b, Optional<bq> c, cx.d d) implements dl.a {
      public static final Codec<cr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               bz.b.optionalFieldOf("player").forGetter(cr.a::a),
               bq.a.optionalFieldOf("distance").forGetter(cr.a::b),
               cx.d.d.optionalFieldOf("duration", cx.d.c).forGetter(cr.a::c)
            )
            .apply($$0, cr.a::new)
      );

      public static ar<cr.a> a(bq $$0) {
         return aq.v.a(new cr.a(Optional.empty(), Optional.of($$0), cx.d.c));
      }

      public boolean a(auc $$0, fis $$1, int $$2) {
         return this.c.isPresent() && !this.c.get().a($$1.d, $$1.e, $$1.f, $$0.dC(), $$0.dE(), $$0.dI()) ? false : this.d.d($$2);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<bq> b() {
         return this.c;
      }

      public cx.d c() {
         return this.d;
      }
   }
}
