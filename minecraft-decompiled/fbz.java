import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record fbz(jb b, dbt c, Optional<xo> d) {
   public static final Codec<fbz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            jb.a.fieldOf("pos").forGetter(fbz::c),
            dbt.q.lenientOptionalFieldOf("color", dbt.a).forGetter(fbz::d),
            xq.a.lenientOptionalFieldOf("name").forGetter(fbz::e)
         )
         .apply($$0, fbz::new)
   );

   @Nullable
   public static fbz a(dly $$0, jb $$1) {
      if ($$0.c_($$1) instanceof ean $$3) {
         dbt $$4 = $$3.f();
         Optional<xo> $$5 = Optional.ofNullable($$3.al());
         return new fbz($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jl<fcb> a() {
      return switch (this.c) {
         case a -> fcc.k;
         case b -> fcc.l;
         case c -> fcc.m;
         case d -> fcc.n;
         case e -> fcc.o;
         case f -> fcc.p;
         case g -> fcc.q;
         case h -> fcc.r;
         case i -> fcc.s;
         case j -> fcc.t;
         case k -> fcc.u;
         case l -> fcc.v;
         case m -> fcc.w;
         case n -> fcc.x;
         case o -> fcc.y;
         case p -> fcc.z;
      };
   }

   public String b() {
      return "banner-" + this.b.u() + "," + this.b.v() + "," + this.b.w();
   }

   public jb c() {
      return this.b;
   }

   public dbt d() {
      return this.c;
   }

   public Optional<xo> e() {
      return this.d;
   }
}
