import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class ly extends mf {
   public static final int a = 3790560;
   public static final ly b = new ly(3790560, 16711680, 1.0F);
   public static final MapCodec<ly> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            bbi.l.fieldOf("from_color").forGetter($$0x -> $$0x.h), bbi.l.fieldOf("to_color").forGetter($$0x -> $$0x.i), g.fieldOf("scale").forGetter(mf::d)
         )
         .apply($$0, ly::new)
   );
   public static final zm<wx, ly> d = zm.a(zk.g, $$0 -> $$0.h, zk.g, $$0 -> $$0.i, zk.l, mf::d, ly::new);
   private final int h;
   private final int i;

   public ly(int $$0, int $$1, float $$2) {
      super($$2);
      this.h = $$0;
      this.i = $$1;
   }

   public Vector3f b() {
      return baj.h(this.h);
   }

   public Vector3f c() {
      return baj.h(this.i);
   }

   @Override
   public md<ly> a() {
      return me.o;
   }
}
