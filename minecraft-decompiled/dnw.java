import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnw {
   public static final Codec<dnw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(me.bk.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, dnw::new)
   );
   private final mc b;
   private final float c;

   public dnw(mc $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public mc a() {
      return this.b;
   }

   public boolean a(bck $$0) {
      return $$0.i() <= this.c;
   }
}
