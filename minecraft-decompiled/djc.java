import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record djc(diy f, diy g, diy h) implements dis {
   public static final MapCodec<djc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(diy.a.fieldOf("input").forGetter(djc::b), diy.a.fieldOf("result").forGetter(djc::d), diy.a.fieldOf("crafting_station").forGetter(djc::e))
         .apply($$0, djc::new)
   );
   public static final zm<wx, djc> b = zm.a(diy.b, djc::b, diy.b, djc::d, diy.b, djc::e, djc::new);
   public static final dis.a<djc> c = new dis.a<>(a, b);

   @Override
   public dis.a<djc> a() {
      return c;
   }

   public diy b() {
      return this.f;
   }

   @Override
   public diy d() {
      return this.g;
   }

   @Override
   public diy e() {
      return this.h;
   }
}
