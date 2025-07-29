import com.mojang.serialization.Codec;

public enum efl implements bda {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   @Deprecated
   public static final Codec<efl> e = bbi.c(efl::valueOf);
   private final String f;
   private final xo g;

   private efl(final String $$0) {
      this.f = $$0;
      this.g = xo.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.f;
   }

   public xo a() {
      return this.g;
   }
}
