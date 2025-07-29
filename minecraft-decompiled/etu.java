import com.mojang.serialization.MapCodec;

public class etu extends euj {
   public static final MapCodec<etu> a = bwo.b(0, 256).fieldOf("count").xmap(etu::new, $$0 -> $$0.c);
   private final bwo c;

   private etu(bwo $$0) {
      this.c = $$0;
   }

   public static etu a(bwo $$0) {
      return new etu($$0);
   }

   public static etu a(int $$0) {
      return a(bwl.a($$0));
   }

   @Override
   protected int a(bck $$0, jb $$1) {
      return this.c.a($$0);
   }

   @Override
   public eug<?> b() {
      return eug.f;
   }
}
