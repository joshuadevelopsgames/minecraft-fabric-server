import com.mojang.serialization.Codec;

public enum evu implements bda {
   a("linear"),
   b("triangular");

   public static final Codec<evu> c = bda.a(evu::values);
   private final String d;

   private evu(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(bck $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
