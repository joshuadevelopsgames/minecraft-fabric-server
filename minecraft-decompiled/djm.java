import com.mojang.serialization.Codec;

public enum djm implements bda {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<djm> d = bda.a(djm::values);
   private final String e;

   private djm(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
