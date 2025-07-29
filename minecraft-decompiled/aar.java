import java.util.Map;

public class aar implements zw<aae> {
   public static final zm<wg, aar> a = zw.a(aar::a, aar::new);
   private final Map<amd<? extends jy<?>>, bag.a> b;

   public aar(Map<amd<? extends jy<?>>, bag.a> $$0) {
      this.b = $$0;
   }

   private aar(wg $$0) {
      this.b = $$0.a(wg::r, bag.a::b);
   }

   private void a(wg $$0) {
      $$0.a(this.b, wg::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zy<aar> a() {
      return aas.m;
   }

   public void a(aae $$0) {
      $$0.a(this);
   }

   public Map<amd<? extends jy<?>>, bag.a> b() {
      return this.b;
   }
}
