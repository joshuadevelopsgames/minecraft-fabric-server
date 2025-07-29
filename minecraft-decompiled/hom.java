import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hom<T> implements hoe {
   private final hqv<T> a;
   private final hoj b;

   public hom(hqv<T> $$0, hoj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hoh $$0, dcv $$1, hof $$2, dct $$3, @Nullable grk $$4, @Nullable cam $$5, int $$6) {
      $$0.a(this);
      hoh.b $$7 = $$0.a();
      if ($$1.C()) {
         hoh.a $$8 = hoh.a.b;
         $$7.a($$8);
         $$0.c();
         $$0.a($$8);
      }

      T $$9 = this.a.b($$1);
      $$7.a(() -> {
         Set<Vector3f> $$0x = new HashSet<>();
         this.a.a($$0x);
         return $$0x.toArray(new Vector3f[0]);
      });
      $$7.a(this.a, $$9);
      if ($$9 != null) {
         $$0.a($$9);
      }

      this.b.a($$7, $$3);
   }

   public record a(ame b, hqv.a c) implements hoe.b {
      public static final MapCodec<hom.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ame.a.fieldOf("base").forGetter(hom.a::b), hqw.a.fieldOf("model").forGetter(hom.a::c)).apply($$0, hom.a::new)
      );

      @Override
      public void a(huk.a $$0) {
         $$0.markDependency(this.b);
      }

      @Override
      public hoe a(hoe.a $$0) {
         hqv<?> $$1 = this.c.a($$0.b());
         if ($$1 == null) {
            return $$0.c();
         } else {
            hoj $$2 = this.b($$0);
            return new hom<>($$1, $$2);
         }
      }

      private hoj b(hoe.a $$0) {
         huc $$1 = $$0.a();
         hul $$2 = $$1.a(this.b);
         gzk $$3 = $$2.g();
         return hoj.a($$1, $$2, $$3);
      }

      @Override
      public MapCodec<hom.a> a() {
         return a;
      }
   }
}
