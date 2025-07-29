import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record dfx(List<dfx.a> e) implements dfb, dga {
   public static final dfx a = new dfx(List.of());
   public static final int b = 160;
   public static final Codec<dfx> c = dfx.a.a.listOf().xmap(dfx::new, dfx::a);
   public static final zm<wx, dfx> d = dfx.a.b.a(zk.a()).a(dfx::new, dfx::a);

   public dfx a(dfx.a $$0) {
      return new dfx(ag.a(this.e, $$0));
   }

   @Override
   public void a(dmu $$0, cam $$1, dcv $$2, dfa $$3) {
      for (dfx.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      if ($$2.b()) {
         List<byq> $$4 = new ArrayList<>();

         for (dfx.a $$5 : this.e) {
            $$4.add($$5.a());
         }

         der.a($$4, $$1, 1.0F, $$0.b());
      }
   }

   public List<dfx.a> a() {
      return this.e;
   }

   public record a(jl<byo> c, int d) {
      public static final Codec<dfx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(byo.a.fieldOf("id").forGetter(dfx.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(dfx.a::c))
            .apply($$0, dfx.a::new)
      );
      public static final zm<wx, dfx.a> b = zm.a(byo.b, dfx.a::b, zk.h, dfx.a::c, dfx.a::new);

      public byq a() {
         return new byq(this.c, this.d);
      }

      public jl<byo> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
