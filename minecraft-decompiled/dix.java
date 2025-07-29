import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dix(List<diy> f, diy g, diy h) implements dis {
   public static final MapCodec<dix> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            diy.a.listOf().fieldOf("ingredients").forGetter(dix::b),
            diy.a.fieldOf("result").forGetter(dix::d),
            diy.a.fieldOf("crafting_station").forGetter(dix::e)
         )
         .apply($$0, dix::new)
   );
   public static final zm<wx, dix> b = zm.a(diy.b.a(zk.a()), dix::b, diy.b, dix::d, diy.b, dix::e, dix::new);
   public static final dis.a<dix> c = new dis.a<>(a, b);

   @Override
   public dis.a<dix> a() {
      return c;
   }

   @Override
   public boolean a(cyd $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && dis.super.a($$0);
   }

   public List<diy> b() {
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
