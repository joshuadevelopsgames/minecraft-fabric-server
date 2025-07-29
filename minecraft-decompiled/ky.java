import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ky(cx.d e, cx.d f) implements kz {
   public static final Codec<ky> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cx.d.d.optionalFieldOf("durability", cx.d.c).forGetter(ky::a), cx.d.d.optionalFieldOf("damage", cx.d.c).forGetter(ky::b))
         .apply($$0, ky::new)
   );

   @Override
   public boolean a(kl $$0) {
      Integer $$1 = $$0.a(kq.e);
      if ($$1 == null) {
         return false;
      } else {
         int $$2 = $$0.a(kq.d, 0);
         return !this.e.d($$2 - $$1) ? false : this.f.d($$1);
      }
   }

   public static ky a(cx.d $$0) {
      return new ky($$0, cx.d.c);
   }

   public cx.d a() {
      return this.e;
   }

   public cx.d b() {
      return this.f;
   }
}
