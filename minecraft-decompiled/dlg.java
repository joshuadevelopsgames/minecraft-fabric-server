import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record dlg(jl<dli> c, jl<dlk> d) implements dga {
   public static final Codec<dlg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dli.c.fieldOf("material").forGetter(dlg::a), dlk.c.fieldOf("pattern").forGetter(dlg::b)).apply($$0, dlg::new)
   );
   public static final zm<wx, dlg> b = zm.a(dli.d, dlg::a, dlk.d, dlg::b, dlg::new);
   private static final xo e = xo.c(ag.a("item", ame.b("smithing_template.upgrade"))).a(o.h);

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      $$1.accept(e);
      $$1.accept(xn.a().b(this.d.a().a(this.c)));
      $$1.accept(xn.a().b(this.c.a().b()));
   }

   public ame a(String $$0, amd<dlc> $$1) {
      dlh.a $$2 = this.a().a().a().a($$1);
      return this.b().a().a().a((UnaryOperator<String>)($$2x -> $$0 + "/" + $$2x + "_" + $$2.a()));
   }

   public jl<dli> a() {
      return this.c;
   }

   public jl<dlk> b() {
      return this.d;
   }
}
