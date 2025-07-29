import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgl(jp<byo> c) implements dgj {
   public static final MapCodec<dgl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ka.a(mn.Z).fieldOf("effects").forGetter(dgl::b)).apply($$0, dgl::new));
   public static final zm<wx, dgl> b = zm.a(zk.c(mn.Z), dgl::b, dgl::new);

   public dgl(jl<byo> $$0) {
      this(jp.a($$0));
   }

   @Override
   public dgj.a<dgl> a() {
      return dgj.a.b;
   }

   @Override
   public boolean a(dmu $$0, dcv $$1, cam $$2) {
      boolean $$3 = false;

      for (jl<byo> $$4 : this.c) {
         if ($$2.g($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public jp<byo> b() {
      return this.c;
   }
}
