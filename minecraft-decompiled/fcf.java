import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fcf extends fbx {
   private static final int c = -1;
   public static final Codec<fcf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.optionalFieldOf("map", -1).forGetter($$0x -> $$0x.d)).apply($$0, fcf::new)
   );
   public static final fby<fcf> b = new fby<>("idcounts", fcf::new, a, bdr.l);
   private int d;

   public fcf() {
      this(-1);
   }

   public fcf(int $$0) {
      this.d = $$0;
   }

   public fce a() {
      fce $$0 = new fce(++this.d);
      this.e();
      return $$0;
   }
}
