import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record dfp(Optional<jk> c, boolean d) {
   public static final Codec<dfp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jk.b.optionalFieldOf("target").forGetter(dfp::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(dfp::b)).apply($$0, dfp::new)
   );
   public static final zm<ByteBuf, dfp> b = zm.a(jk.c.a(zk::a), dfp::a, zk.b, dfp::b, dfp::new);

   public dfp a(aub $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.aj()) {
            return this;
         } else {
            jb $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.B().a(clt.s, $$1) ? this : new dfp(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<jk> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
