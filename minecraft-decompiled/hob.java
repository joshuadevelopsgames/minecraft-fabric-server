import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hob implements hoe {
   private final List<hoe> a;

   public hob(List<hoe> $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hoh $$0, dcv $$1, hof $$2, dct $$3, @Nullable grk $$4, @Nullable cam $$5, int $$6) {
      $$0.a(this);
      $$0.a(this.a.size());

      for (hoe $$7 : this.a) {
         $$7.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public record a(List<hoe.b> b) implements hoe.b {
      public static final MapCodec<hob.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hog.a.listOf().fieldOf("models").forGetter(hob.a::b)).apply($$0, hob.a::new)
      );

      @Override
      public MapCodec<hob.a> a() {
         return a;
      }

      @Override
      public void a(huk.a $$0) {
         for (hoe.b $$1 : this.b) {
            $$1.a($$0);
         }
      }

      @Override
      public hoe a(hoe.a $$0) {
         return new hob(this.b.stream().map($$1 -> $$1.a($$0)).toList());
      }
   }
}
