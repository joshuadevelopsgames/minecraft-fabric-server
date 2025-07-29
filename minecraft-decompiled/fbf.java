import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class fbf extends fay {
   private final boolean a;
   private final Long2ObjectMap<fbc> l = new Long2ObjectOpenHashMap();

   public fbf(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dnh $$0, cao $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public fax a() {
      return this.c(bcb.a(this.c.cV().a), bcb.a(this.c.cV().b + 0.5), bcb.a(this.c.cV().c));
   }

   @Override
   public fbg a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(fax[] $$0, fax $$1) {
      int $$2 = 0;
      Map<jh, fax> $$3 = Maps.newEnumMap(jh.class);

      for (jh $$4 : jh.values()) {
         fax $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (jh $$6 : jh.c.a) {
         jh $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            fax $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable fax $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable fax $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected fax a(int $$0, int $$1, int $$2) {
      fax $$3 = null;
      fbc $$4 = this.b($$0, $$1, $$2);
      if (this.a && $$4 == fbc.u || $$4 == fbc.j) {
         float $$5 = this.c.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.b.a().b_(new jb($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected fbc b(int $$0, int $$1, int $$2) {
      return (fbc)this.l.computeIfAbsent(jb.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2));
   }

   @Override
   public fbc a(fbe $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.c);
   }

   @Override
   public fbc a(fbe $$0, int $$1, int $$2, int $$3, cao $$4) {
      jb.a $$5 = new jb.a();

      for (int $$6 = $$1; $$6 < $$1 + this.e; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.f; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.g; $$8++) {
               eeb $$9 = $$0.a($$5.d($$6, $$7, $$8));
               fal $$10 = $$9.y();
               if ($$10.c() && $$9.a(fba.b) && $$9.l()) {
                  return fbc.u;
               }

               if (!$$10.a(azu.a)) {
                  return fbc.a;
               }
            }
         }
      }

      eeb $$11 = $$0.a($$5);
      return $$11.a(fba.b) ? fbc.j : fbc.a;
   }
}
