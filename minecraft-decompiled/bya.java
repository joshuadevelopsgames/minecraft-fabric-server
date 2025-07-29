import com.mojang.serialization.Codec;

public enum bya implements bda {
   a("never"),
   b("when_caused_by_living_non_player"),
   c("always");

   public static final Codec<bya> d = bda.a(bya::values);
   private final String e;

   private bya(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
