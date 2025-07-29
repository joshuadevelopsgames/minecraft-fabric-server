import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class adx implements zw<acq> {
   public static final zm<wg, adx> a = zw.a(adx::a, adx::new);
   public static final adx.a b = new adx.a(0);
   public static final adx.a c = new adx.a(1);
   public static final adx.a d = new adx.a(2);
   public static final adx.a e = new adx.a(3);
   public static final adx.a f = new adx.a(4);
   public static final adx.a g = new adx.a(5);
   public static final adx.a h = new adx.a(6);
   public static final adx.a i = new adx.a(7);
   public static final adx.a j = new adx.a(8);
   public static final adx.a k = new adx.a(9);
   public static final adx.a l = new adx.a(10);
   public static final adx.a m = new adx.a(11);
   public static final adx.a n = new adx.a(12);
   public static final adx.a o = new adx.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final adx.a u;
   private final float v;

   public adx(adx.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private adx(wg $$0) {
      this.u = (adx.a)adx.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(wg $$0) {
      $$0.l(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public zy<adx> a() {
      return ahk.G;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public adx.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<adx.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
