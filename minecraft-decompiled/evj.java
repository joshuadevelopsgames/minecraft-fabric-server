import com.mojang.serialization.Codec;

public enum evj implements bda {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box"),
   e("encapsulate");

   public static final Codec<evj> f = bda.a(evj::values);
   private final String g;

   private evj(final String $$0) {
      this.g = $$0;
   }

   @Override
   public String c() {
      return this.g;
   }
}
