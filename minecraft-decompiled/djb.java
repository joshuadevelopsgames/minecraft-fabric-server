import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record djb(diy f, diy g, diy h, diy i, diy j) implements dis {
   public static final MapCodec<djb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            diy.a.fieldOf("template").forGetter(djb::b),
            diy.a.fieldOf("base").forGetter(djb::c),
            diy.a.fieldOf("addition").forGetter(djb::f),
            diy.a.fieldOf("result").forGetter(djb::d),
            diy.a.fieldOf("crafting_station").forGetter(djb::e)
         )
         .apply($$0, djb::new)
   );
   public static final zm<wx, djb> b = zm.a(diy.b, djb::b, diy.b, djb::c, diy.b, djb::f, diy.b, djb::d, diy.b, djb::e, djb::new);
   public static final dis.a<djb> c = new dis.a<>(a, b);

   @Override
   public dis.a<djb> a() {
      return c;
   }

   public diy b() {
      return this.f;
   }

   public diy c() {
      return this.g;
   }

   public diy f() {
      return this.h;
   }

   @Override
   public diy d() {
      return this.i;
   }

   @Override
   public diy e() {
      return this.j;
   }
}
