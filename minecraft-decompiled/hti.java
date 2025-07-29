import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hti(hti.a c) {
   public static final Codec<hti> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hti.a.d.optionalFieldOf("hat", hti.a.a).forGetter(hti::a)).apply($$0, hti::new)
   );
   public static final awo<hti> b = new awo<>("villager", a);

   public hti.a a() {
      return this.c;
   }

   public static enum a implements bda {
      a("none"),
      b("partial"),
      c("full");

      public static final Codec<hti.a> d = bda.a(hti.a::values);
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
