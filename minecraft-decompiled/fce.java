import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record fce(int c) implements dga {
   public static final Codec<fce> a = Codec.INT.xmap(fce::new, fce::b);
   public static final zm<ByteBuf, fce> b = zk.h.a(fce::new, fce::b);
   private static final xo d = xo.c("filled_map.locked").a(o.h);

   public String a() {
      return "map_" + this.c;
   }

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      fcg $$4 = $$0.a(this);
      if ($$4 == null) {
         $$1.accept(xo.c("filled_map.unknown").a(o.h));
      } else {
         dfs $$5 = $$3.a(kq.O);
         if ($$3.a(kq.g) == null && $$5 == null) {
            $$1.accept(xo.a("filled_map.id", this.c).a(o.h));
         }

         if ($$4.i || $$5 == dfs.a) {
            $$1.accept(d);
         }

         if ($$2.a()) {
            int $$6 = $$5 == dfs.b ? 1 : 0;
            int $$7 = Math.min($$4.g + $$6, 4);
            $$1.accept(xo.a("filled_map.scale", 1 << $$7).a(o.h));
            $$1.accept(xo.a("filled_map.level", $$7, 4).a(o.h));
         }
      }
   }

   public int b() {
      return this.c;
   }
}
