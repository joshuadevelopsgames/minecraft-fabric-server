import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record evf(evf.a b, bvt<doj.c> c) {
   public static final Codec<evf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(evf.a.c.fieldOf("bounding_box").forGetter(evf::a), bvt.a(doj.c.a).fieldOf("spawns").forGetter(evf::b)).apply($$0, evf::new)
   );

   public evf.a a() {
      return this.b;
   }

   public bvt<doj.c> b() {
      return this.c;
   }

   public static enum a implements bda {
      a("piece"),
      b("full");

      public static final Codec<evf.a> c = bda.a(evf.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
