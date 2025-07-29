import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gzl(ame c, gzl.a d) implements gzb.a {
   public static final MapCodec<gzl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ame.a.fieldOf("model").forGetter(gzl::a), gzl.a.a.forGetter(gzl::b)).apply($$0, gzl::new)
   );
   public static final Codec<gzl> b = a.codec();

   public gzl(ame $$0) {
      this($$0, gzl.a.b);
   }

   public gzl a(i $$0) {
      return this.a(this.d.a($$0));
   }

   public gzl b(i $$0) {
      return this.a(this.d.b($$0));
   }

   public gzl a(boolean $$0) {
      return this.a(this.d.a($$0));
   }

   public gzl a(ame $$0) {
      return new gzl($$0, this.d);
   }

   public gzl a(gzl.a $$0) {
      return new gzl(this.c, $$0);
   }

   public gzl a(gzm $$0) {
      return $$0.apply(this);
   }

   @Override
   public gzb a(huc $$0) {
      return gzh.a($$0, this.c, this.d.a());
   }

   @Override
   public void a(huk.a $$0) {
      $$0.markDependency(this.c);
   }

   public ame a() {
      return this.c;
   }

   public gzl.a b() {
      return this.d;
   }

   public record a(i c, i d, boolean e) {
      public static final MapCodec<gzl.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               i.e.optionalFieldOf("x", i.a).forGetter(gzl.a::b),
               i.e.optionalFieldOf("y", i.a).forGetter(gzl.a::c),
               Codec.BOOL.optionalFieldOf("uvlock", false).forGetter(gzl.a::d)
            )
            .apply($$0, gzl.a::new)
      );
      public static final gzl.a b = new gzl.a(i.a, i.a, false);

      public hui a() {
         htu $$0 = htu.a(this.c, this.d);
         return (hui)(this.e ? $$0.c() : $$0);
      }

      public gzl.a a(i $$0) {
         return new gzl.a($$0, this.d, this.e);
      }

      public gzl.a b(i $$0) {
         return new gzl.a(this.c, $$0, this.e);
      }

      public gzl.a a(boolean $$0) {
         return new gzl.a(this.c, this.d, $$0);
      }

      public i b() {
         return this.c;
      }

      public i c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }
   }
}
