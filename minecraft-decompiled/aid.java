import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public record aid(int b, int c, short d, byte e, cyx f, Int2ObjectMap<wj> g, wj h) implements zw<ahm> {
   private static final int i = 128;
   private static final zm<wx, Int2ObjectMap<wj>> j = zk.a(Int2ObjectOpenHashMap::new, zk.e.a(Short::intValue, Integer::shortValue), wj.b, 128);
   public static final zm<wx, aid> a = zm.a(zk.x, aid::b, zk.h, aid::e, zk.e, aid::f, zk.c, aid::g, cyx.h, aid::h, j, aid::i, wj.b, aid::j, aid::new);

   public aid(int b, int c, short d, byte e, cyx f, Int2ObjectMap<wj> g, wj h) {
      g = Int2ObjectMaps.unmodifiable(g);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   @Override
   public zy<aid> a() {
      return ahk.bB;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public short f() {
      return this.d;
   }

   public byte g() {
      return this.e;
   }

   public cyx h() {
      return this.f;
   }

   public Int2ObjectMap<wj> i() {
      return this.g;
   }

   public wj j() {
      return this.h;
   }
}
