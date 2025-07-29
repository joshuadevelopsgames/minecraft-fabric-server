import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record mj(fis c, int d, int e) implements mc {
   public static final MapCodec<mj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fis.a.fieldOf("target").forGetter(mj::b), bbi.l.fieldOf("color").forGetter(mj::c), bbi.p.fieldOf("duration").forGetter(mj::d))
         .apply($$0, mj::new)
   );
   public static final zm<wx, mj> b = zm.a(fis.b, mj::b, zk.g, mj::c, zk.h, mj::d, mj::new);

   @Override
   public md<mj> a() {
      return me.W;
   }

   public fis b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
