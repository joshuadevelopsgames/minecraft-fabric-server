import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record diw(int f, int g, List<diy> h, diy i, diy j) implements dis {
   public static final MapCodec<diw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            Codec.INT.fieldOf("width").forGetter(diw::b),
            Codec.INT.fieldOf("height").forGetter(diw::c),
            diy.a.listOf().fieldOf("ingredients").forGetter(diw::f),
            diy.a.fieldOf("result").forGetter(diw::d),
            diy.a.fieldOf("crafting_station").forGetter(diw::e)
         )
         .apply($$0, diw::new)
   );
   public static final zm<wx, diw> b = zm.a(zk.h, diw::b, zk.h, diw::c, diy.b.a(zk.a()), diw::f, diy.b, diw::d, diy.b, diw::e, diw::new);
   public static final dis.a<diw> c = new dis.a<>(a, b);

   public diw(int f, int g, List<diy> h, diy i, diy j) {
      if (h.size() != f * g) {
         throw new IllegalArgumentException("Invalid shaped recipe display contents");
      } else {
         this.f = f;
         this.g = g;
         this.h = h;
         this.i = i;
         this.j = j;
      }
   }

   @Override
   public dis.a<diw> a() {
      return c;
   }

   @Override
   public boolean a(cyd $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && dis.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<diy> f() {
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
