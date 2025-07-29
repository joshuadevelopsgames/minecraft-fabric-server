import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lz extends mf {
   public static final int a = 16711680;
   public static final lz b = new lz(16711680, 1.0F);
   public static final MapCodec<lz> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bbi.l.fieldOf("color").forGetter($$0x -> $$0x.h), g.fieldOf("scale").forGetter(mf::d)).apply($$0, lz::new)
   );
   public static final zm<wx, lz> d = zm.a(zk.g, $$0 -> $$0.h, zk.l, mf::d, lz::new);
   private final int h;

   public lz(int $$0, float $$1) {
      super($$1);
      this.h = $$0;
   }

   @Override
   public md<lz> a() {
      return me.n;
   }

   public Vector3f b() {
      return baj.h(this.h);
   }
}
