import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.function.BiConsumer;

public class afk implements zw<acq> {
   public static final zm<wg, afk> a = zw.a(afk::a, afk::new);
   private static final int b = 12;
   private final ke c;
   private final short[] d;
   private final eeb[] e;

   public afk(ke $$0, ShortSet $$1, egj $$2) {
      this.c = $$0;
      int $$3 = $$1.size();
      this.d = new short[$$3];
      this.e = new eeb[$$3];
      int $$4 = 0;

      for (ShortIterator var6 = $$1.iterator(); var6.hasNext(); $$4++) {
         short $$5 = (Short)var6.next();
         this.d[$$4] = $$5;
         this.e[$$4] = $$2.a(ke.a($$5), ke.b($$5), ke.c($$5));
      }
   }

   private afk(wg $$0) {
      this.c = ke.a($$0.readLong());
      int $$1 = $$0.l();
      this.d = new short[$$1];
      this.e = new eeb[$$1];

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         long $$3 = $$0.m();
         this.d[$$2] = (short)($$3 & 4095L);
         this.e[$$2] = dpz.k.a((int)($$3 >>> 12));
      }
   }

   private void a(wg $$0) {
      $$0.b(this.c.s());
      $$0.c(this.d.length);

      for (int $$1 = 0; $$1 < this.d.length; $$1++) {
         $$0.a((long)dpz.j(this.e[$$1]) << 12 | this.d[$$1]);
      }
   }

   @Override
   public zy<afk> a() {
      return ahk.ar;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public void a(BiConsumer<jb, eeb> $$0) {
      jb.a $$1 = new jb.a();

      for (int $$2 = 0; $$2 < this.d.length; $$2++) {
         short $$3 = this.d[$$2];
         $$1.d(this.c.d($$3), this.c.e($$3), this.c.f($$3));
         $$0.accept($$1, this.e[$$2]);
      }
   }
}
