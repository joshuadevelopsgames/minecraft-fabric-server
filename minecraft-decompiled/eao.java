import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eao(ame e, String f) {
   public static final Codec<eao> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ame.a.fieldOf("asset_id").forGetter(eao::a), Codec.STRING.fieldOf("translation_key").forGetter(eao::b)).apply($$0, eao::new)
   );
   public static final zm<wx, eao> b = zm.a(ame.b, eao::a, zk.p, eao::b, eao::new);
   public static final Codec<jl<eao>> c = ama.a(mn.aJ, a);
   public static final zm<wx, jl<eao>> d = zk.a(mn.aJ, b);

   public ame a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }
}
