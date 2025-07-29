import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dlk(ame e, xo f, boolean g) {
   public static final Codec<dlk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            ame.a.fieldOf("asset_id").forGetter(dlk::a),
            xq.a.fieldOf("description").forGetter(dlk::b),
            Codec.BOOL.fieldOf("decal").orElse(false).forGetter(dlk::c)
         )
         .apply($$0, dlk::new)
   );
   public static final zm<wx, dlk> b = zm.a(ame.b, dlk::a, xq.b, dlk::b, zk.b, dlk::c, dlk::new);
   public static final Codec<jl<dlk>> c = ama.a(mn.bq, a);
   public static final zm<wx, jl<dlk>> d = zk.a(mn.bq, b);

   public xo a(jl<dli> $$0) {
      return this.f.f().c($$0.a().b().a());
   }

   public ame a() {
      return this.e;
   }

   public xo b() {
      return this.f;
   }

   public boolean c() {
      return this.g;
   }
}
