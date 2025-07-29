import com.mojang.serialization.Codec;

public class cj implements at<cj.a> {
   @Override
   public void a(amm $$0, at.a<cj.a> $$1) {
   }

   @Override
   public void b(amm $$0, at.a<cj.a> $$1) {
   }

   @Override
   public void a(amm $$0) {
   }

   @Override
   public Codec<cj.a> a() {
      return cj.a.a;
   }

   public record a() implements au {
      public static final Codec<cj.a> a = Codec.unit(new cj.a());

      @Override
      public void a(bk $$0) {
      }
   }
}
