import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class hxn extends hxl {
   private static final long a = a(Runtime.getRuntime().maxMemory());
   private final LongList b = new LongArrayList();
   private final LongList c = new LongArrayList();
   private final LongList d = new LongArrayList();

   @Override
   public void a(hxf $$0) {
      if (fue.R().D()) {
         super.a($$0);
      }
   }

   private void g() {
      this.b.clear();
      this.c.clear();
      this.d.clear();
   }

   @Override
   public void f() {
      this.b.add(fue.R().o());
      this.h();
      this.c.add(fue.R().p());
   }

   private void h() {
      long $$0 = Runtime.getRuntime().totalMemory();
      long $$1 = Runtime.getRuntime().freeMemory();
      long $$2 = $$0 - $$1;
      this.d.add(a($$2));
   }

   @Override
   public void b(hxf $$0) {
      $$0.send(hxg.c, $$0x -> {
         $$0x.a(hxi.r, new LongArrayList(this.b));
         $$0x.a(hxi.s, new LongArrayList(this.c));
         $$0x.a(hxi.t, new LongArrayList(this.d));
         $$0x.a(hxi.u, this.e());
         $$0x.a(hxi.v, fue.R().n.aK());
         $$0x.a(hxi.w, (int)a);
      });
      this.g();
   }

   private static long a(long $$0) {
      return $$0 / 1000L;
   }
}
