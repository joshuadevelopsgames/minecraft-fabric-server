import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record dfk(int d, List<dfj> e) implements dga {
   public static final int a = 256;
   public static final Codec<dfk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            bbi.n.optionalFieldOf("flight_duration", 0).forGetter(dfk::a),
            dfj.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(dfk::b)
         )
         .apply($$0, dfk::new)
   );
   public static final zm<ByteBuf, dfk> c = zm.a(zk.h, dfk::a, dfj.d.a(zk.c(256)), dfk::b, dfk::new);

   public dfk(int d, List<dfj> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      if (this.d > 0) {
         $$1.accept(xo.c("item.minecraft.firework_rocket.flight").b(xn.w).f(String.valueOf(this.d)).a(o.h));
      }

      dfj $$4 = null;
      int $$5 = 0;

      for (dfj $$6 : this.e) {
         if ($$4 == null) {
            $$4 = $$6;
            $$5 = 1;
         } else if ($$4.equals($$6)) {
            $$5++;
         } else {
            a($$1, $$4, $$5);
            $$4 = $$6;
            $$5 = 1;
         }
      }

      if ($$4 != null) {
         a($$1, $$4, $$5);
      }
   }

   private static void a(Consumer<xo> $$0, dfj $$1, int $$2) {
      xo $$3 = $$1.a().a();
      if ($$2 == 1) {
         $$0.accept(xo.a("item.minecraft.firework_rocket.single_star", $$3).a(o.h));
      } else {
         $$0.accept(xo.a("item.minecraft.firework_rocket.multiple_stars", $$2, $$3).a(o.h));
      }

      $$1.a((Consumer<xo>)($$1x -> $$0.accept(xo.b("  ").b($$1x))));
   }

   public int a() {
      return this.d;
   }

   public List<dfj> b() {
      return this.e;
   }
}
