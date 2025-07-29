import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class eix implements ejf {
   public static final MapCodec<eix> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jb.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, eix::new));
   public static final zm<ByteBuf, eix> b = zm.a(jb.b, $$0 -> $$0.e, eix::new);
   private final jb e;

   public eix(jb $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<fis> a(dmu $$0) {
      return Optional.of(fis.b(this.e));
   }

   @Override
   public ejg<eix> a() {
      return ejg.a;
   }

   public static class a implements ejg<eix> {
      @Override
      public MapCodec<eix> a() {
         return eix.a;
      }

      @Override
      public zm<ByteBuf, eix> b() {
         return eix.b;
      }
   }
}
