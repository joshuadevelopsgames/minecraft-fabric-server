import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cw extends dl<cw.a> {
   @Override
   public Codec<cw.a> a() {
      return cw.a.a;
   }

   public void a(auc $$0, amd<fdo> $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public record a(Optional<bj> b, amd<fdo> c) implements dl.a {
      public static final Codec<cw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(cw.a::a), fdo.a.fieldOf("loot_table").forGetter(cw.a::b)).apply($$0, cw.a::new)
      );

      public static ar<cw.a> a(amd<fdo> $$0) {
         return aq.Q.a(new cw.a(Optional.empty(), $$0));
      }

      public boolean b(amd<fdo> $$0) {
         return this.c == $$0;
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public amd<fdo> b() {
         return this.c;
      }
   }
}
