import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.List;

public class hcc implements hbz.a {
   private static final int a = 160;
   private final fue b;
   private final Int2ObjectMap<hcc.a> c = new Int2ObjectOpenHashMap();

   @Override
   public void a() {
      this.c.clear();
   }

   public void a(int $$0, jb $$1, List<abk.a> $$2) {
      this.c.put($$0, new hcc.a($$1, $$2));
   }

   public void a(int $$0) {
      this.c.remove($$0);
   }

   public hcc(fue $$0) {
      this.b = $$0;
   }

   @Override
   public void a(fod $$0, gxn $$1, double $$2, double $$3, double $$4) {
      ftm $$5 = this.b.j.l();
      jb $$6 = jb.a($$5.d().d, 0.0, $$5.d().f);
      ObjectIterator var11 = this.c.values().iterator();

      while (var11.hasNext()) {
         hcc.a $$7 = (hcc.a)var11.next();
         jb $$8 = $$7.a;
         if ($$6.a($$8, 160.0)) {
            for (int $$9 = 0; $$9 < $$7.b.size(); $$9++) {
               abk.a $$10 = $$7.b.get($$9);
               double $$11 = $$8.u() + 0.5;
               double $$12 = $$8.v() + 2.0 + $$9 * 0.25;
               double $$13 = $$8.w() + 0.5;
               int $$14 = $$10.b() ? -16711936 : -3355444;
               hbz.a($$0, $$1, $$10.c(), $$11, $$12, $$13, $$14);
            }
         }
      }
   }

   record a(jb a, List<abk.a> b) {
   }
}
