import com.mojang.serialization.Codec;

public enum eyk implements bda {
   a("ignore_waterlogging"),
   b("apply_waterlogging");

   public static Codec<eyk> c = bda.b(eyk::values);
   private final String d;

   private eyk(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }
}
