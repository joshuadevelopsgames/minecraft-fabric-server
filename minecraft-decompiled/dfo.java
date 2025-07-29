import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dfo(List<xo> e, List<xo> f) implements dga {
   public static final dfo a = new dfo(List.of());
   public static final int b = 256;
   private static final yl g = yl.a.a(o.f).b(true);
   public static final Codec<dfo> c = xq.a.sizeLimitedListOf(256).xmap(dfo::new, dfo::a);
   public static final zm<wx, dfo> d = xq.b.a(zk.c(256)).a(dfo::new, dfo::a);

   public dfo(List<xo> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xr.a($$0x.f(), g)));
   }

   public dfo(List<xo> e, List<xo> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public dfo a(xo $$0) {
      return new dfo(ag.a(this.e, $$0));
   }

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      this.f.forEach($$1);
   }

   public List<xo> a() {
      return this.e;
   }

   public List<xo> b() {
      return this.f;
   }
}
