import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cqv(int e, int f, ame g, Optional<xo> h, Optional<xo> i) {
   public static final Codec<cqv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            bbi.a(1, 16).fieldOf("width").forGetter(cqv::b),
            bbi.a(1, 16).fieldOf("height").forGetter(cqv::c),
            ame.a.fieldOf("asset_id").forGetter(cqv::d),
            xq.a.optionalFieldOf("title").forGetter(cqv::e),
            xq.a.optionalFieldOf("author").forGetter(cqv::f)
         )
         .apply($$0, cqv::new)
   );
   public static final zm<wx, cqv> b = zm.a(zk.h, cqv::b, zk.h, cqv::c, ame.b, cqv::d, xq.e, cqv::e, xq.e, cqv::f, cqv::new);
   public static final Codec<jl<cqv>> c = amb.a(mn.be);
   public static final zm<wx, jl<cqv>> d = zk.a(mn.be, b);

   public int a() {
      return this.b() * this.c();
   }

   public int b() {
      return this.e;
   }

   public int c() {
      return this.f;
   }

   public ame d() {
      return this.g;
   }

   public Optional<xo> e() {
      return this.h;
   }

   public Optional<xo> f() {
      return this.i;
   }
}
