import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dir(diy f, diy g, diy h, diy i, int j, float k) implements dis {
   public static final MapCodec<dir> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            diy.a.fieldOf("ingredient").forGetter(dir::b),
            diy.a.fieldOf("fuel").forGetter(dir::c),
            diy.a.fieldOf("result").forGetter(dir::d),
            diy.a.fieldOf("crafting_station").forGetter(dir::e),
            Codec.INT.fieldOf("duration").forGetter(dir::f),
            Codec.FLOAT.fieldOf("experience").forGetter(dir::g)
         )
         .apply($$0, dir::new)
   );
   public static final zm<wx, dir> b = zm.a(diy.b, dir::b, diy.b, dir::c, diy.b, dir::d, diy.b, dir::e, zk.h, dir::f, zk.l, dir::g, dir::new);
   public static final dis.a<dir> c = new dis.a<>(a, b);

   @Override
   public dis.a<dir> a() {
      return c;
   }

   @Override
   public boolean a(cyd $$0) {
      return this.f.a($$0) && this.c().a($$0) && dis.super.a($$0);
   }

   public diy b() {
      return this.f;
   }

   public diy c() {
      return this.g;
   }

   @Override
   public diy d() {
      return this.h;
   }

   @Override
   public diy e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
