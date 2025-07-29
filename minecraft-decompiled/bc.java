import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bc extends dl<bc.a> {
   @Override
   public Codec<bc.a> a() {
      return bc.a.a;
   }

   public void a(auc $$0, amd<dmu> $$1, amd<dmu> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public record a(Optional<bj> b, Optional<amd<dmu>> c, Optional<amd<dmu>> d) implements dl.a {
      public static final Codec<bc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               bz.b.optionalFieldOf("player").forGetter(bc.a::a),
               amd.a(mn.bu).optionalFieldOf("from").forGetter(bc.a::c),
               amd.a(mn.bu).optionalFieldOf("to").forGetter(bc.a::d)
            )
            .apply($$0, bc.a::new)
      );

      public static ar<bc.a> b() {
         return aq.w.a(new bc.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ar<bc.a> a(amd<dmu> $$0, amd<dmu> $$1) {
         return aq.w.a(new bc.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static ar<bc.a> a(amd<dmu> $$0) {
         return aq.w.a(new bc.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static ar<bc.a> b(amd<dmu> $$0) {
         return aq.w.a(new bc.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(amd<dmu> $$0, amd<dmu> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
