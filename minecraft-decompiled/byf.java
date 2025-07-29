import com.mojang.serialization.Codec;

public enum byf implements bda {
   a("default"),
   b("fall_variants"),
   c("intentional_game_design");

   public static final Codec<byf> d = bda.a(byf::values);
   private final String e;

   private byf(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
