import com.mojang.serialization.Codec;

public enum bxz implements bda {
   a("hurt", ayz.vz),
   b("thorns", ayz.vz),
   c("drowning", ayz.vA),
   d("burning", ayz.vC),
   e("poking", ayz.vD),
   f("freezing", ayz.vB);

   public static final Codec<bxz> g = bda.a(bxz::values);
   private final String h;
   private final ayy i;

   private bxz(final String $$0, final ayy $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public ayy a() {
      return this.i;
   }
}
