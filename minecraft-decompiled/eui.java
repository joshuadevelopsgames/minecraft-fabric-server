import com.mojang.serialization.MapCodec;

public class eui extends eue {
   public static final MapCodec<eui> a = bbi.p.fieldOf("chance").xmap(eui::new, $$0 -> $$0.c);
   private final int c;

   private eui(int $$0) {
      this.c = $$0;
   }

   public static eui a(int $$0) {
      return new eui($$0);
   }

   @Override
   protected boolean a(eud $$0, bck $$1, jb $$2) {
      return $$1.i() < 1.0F / this.c;
   }

   @Override
   public eug<?> b() {
      return eug.b;
   }
}
