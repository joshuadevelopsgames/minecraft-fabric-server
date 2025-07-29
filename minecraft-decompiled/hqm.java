import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import org.joml.Vector3f;

public class hqm implements hqq {
   public static final ame a = ame.b("christmas");
   public static final ame b = ame.b("normal");
   public static final ame c = ame.b("trapped");
   public static final ame d = ame.b("ender");
   private final gmr e;
   private final hua f;
   private final float g;

   public hqm(gmr $$0, hua $$1, float $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public void a(dct $$0, fod $$1, gxn $$2, int $$3, int $$4, boolean $$5) {
      fog $$6 = this.f.a($$2, gxz::d);
      this.e.a(this.g);
      this.e.a($$1, $$6, $$3, $$4);
   }

   @Override
   public void a(Set<Vector3f> $$0) {
      fod $$1 = new fod();
      this.e.a(this.g);
      this.e.e().a($$1, $$0);
   }

   public record a(ame b, float c) implements hqv.a {
      public static final MapCodec<hqm.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ame.a.fieldOf("texture").forGetter(hqm.a::b), Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hqm.a::c))
            .apply($$0, hqm.a::new)
      );

      public a(ame $$0) {
         this($$0, 0.0F);
      }

      @Override
      public MapCodec<hqm.a> a() {
         return a;
      }

      @Override
      public hqv<?> a(gqj $$0) {
         gmr $$1 = new gmr($$0.a(gqm.X));
         hua $$2 = gyi.m.a(this.b);
         return new hqm($$1, $$2, this.c);
      }
   }
}
