import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record deu(List<eaw.c> d) implements dga {
   public static final Codec<deu> a = eaw.c.b.xmap(deu::new, deu::a);
   public static final zm<ByteBuf, deu> b = eaw.c.c.a(zk.a()).a(deu::new, deu::a);
   public static final deu c = new deu(List.of());

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      $$1.accept(xo.a("container.beehive.bees", this.d.size(), 3).a(o.h));
   }

   public List<eaw.c> a() {
      return this.d;
   }
}
