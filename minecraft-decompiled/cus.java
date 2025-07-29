import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map;
import java.util.function.Predicate;

public class cus implements bxc, bxn {
   public static final int b = 5;
   public static final int c = 36;
   public static final int d = 9;
   public static final int e = 40;
   public static final int f = 41;
   public static final int g = 42;
   public static final int h = -1;
   public static final Int2ObjectMap<bzw> i = new Int2ObjectArrayMap(
      Map.of(bzw.c.a(36), bzw.c, bzw.d.a(36), bzw.d, bzw.e.a(36), bzw.e, bzw.f.a(36), bzw.f, 40, bzw.b, 41, bzw.g, 42, bzw.h)
   );
   private final ju<dcv> k = ju.a(36, dcv.l);
   private int l;
   public final cut j;
   private final bzq m;
   private int n;

   public cus(cut $$0, bzq $$1) {
      this.j = $$0;
      this.m = $$1;
   }

   public int f() {
      return this.l;
   }

   public void c(int $$0) {
      if (!e($$0)) {
         throw new IllegalArgumentException("Invalid selected slot");
      } else {
         this.l = $$0;
      }
   }

   public dcv g() {
      return this.k.get(this.l);
   }

   public dcv b(dcv $$0) {
      return this.k.set(this.l, $$0);
   }

   public static int h() {
      return 9;
   }

   public ju<dcv> i() {
      return this.k;
   }

   private boolean a(dcv $$0, dcv $$1) {
      return !$$0.f() && dcv.c($$0, $$1) && $$0.l() && $$0.M() < this.f_($$0);
   }

   public int j() {
      for (int $$0 = 0; $$0 < this.k.size(); $$0++) {
         if (this.k.get($$0).f()) {
            return $$0;
         }
      }

      return -1;
   }

   public void c(dcv $$0) {
      this.c(this.k());
      if (!this.k.get(this.l).f()) {
         int $$1 = this.j();
         if ($$1 != -1) {
            this.k.set($$1, this.k.get(this.l));
         }
      }

      this.k.set(this.l, $$0);
   }

   public void d(int $$0) {
      this.c(this.k());
      dcv $$1 = this.k.get(this.l);
      this.k.set(this.l, this.k.get($$0));
      this.k.set($$0, $$1);
   }

   public static boolean e(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int d(dcv $$0) {
      for (int $$1 = 0; $$1 < this.k.size(); $$1++) {
         if (!this.k.get($$1).f() && dcv.c($$0, this.k.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public static boolean e(dcv $$0) {
      return !$$0.n() && !$$0.F() && !$$0.c(kq.g);
   }

   public int a(jl<dcr> $$0, dcv $$1) {
      for (int $$2 = 0; $$2 < this.k.size(); $$2++) {
         dcv $$3 = this.k.get($$2);
         if (!$$3.f() && $$3.a($$0) && e($$3) && ($$1.f() || dcv.c($$1, $$3))) {
            return $$2;
         }
      }

      return -1;
   }

   public int k() {
      for (int $$0 = 0; $$0 < 9; $$0++) {
         int $$1 = (this.l + $$0) % 9;
         if (this.k.get($$1).f()) {
            return $$1;
         }
      }

      for (int $$2 = 0; $$2 < 9; $$2++) {
         int $$3 = (this.l + $$2) % 9;
         if (!this.k.get($$3).F()) {
            return $$3;
         }
      }

      return this.l;
   }

   public int a(Predicate<dcv> $$0, int $$1, bxc $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bxd.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bxd.a($$2, $$0, $$1 - $$3, $$4);
      dcv $$5 = this.j.cn.g();
      $$3 += bxd.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.f()) {
         this.j.cn.a(dcv.l);
      }

      return $$3;
   }

   private int k(dcv $$0) {
      int $$1 = this.f($$0);
      if ($$1 == -1) {
         $$1 = this.j();
      }

      return $$1 == -1 ? $$0.M() : this.d($$1, $$0);
   }

   private int d(int $$0, dcv $$1) {
      int $$2 = $$1.M();
      dcv $$3 = this.a($$0);
      if ($$3.f()) {
         $$3 = $$1.c(0);
         this.a($$0, $$3);
      }

      int $$4 = this.f_($$3) - $$3.M();
      int $$5 = Math.min($$2, $$4);
      if ($$5 == 0) {
         return $$2;
      } else {
         $$2 -= $$5;
         $$3.g($$5);
         $$3.d(5);
         return $$2;
      }
   }

   public int f(dcv $$0) {
      if (this.a(this.a(this.l), $$0)) {
         return this.l;
      } else if (this.a(this.a(40), $$0)) {
         return 40;
      } else {
         for (int $$1 = 0; $$1 < this.k.size(); $$1++) {
            if (this.a(this.k.get($$1), $$0)) {
               return $$1;
            }
         }

         return -1;
      }
   }

   public void l() {
      for (int $$0 = 0; $$0 < this.k.size(); $$0++) {
         dcv $$1 = this.a($$0);
         if (!$$1.f()) {
            $$1.a(this.j.ai(), this.j, $$0 == this.l ? bzw.a : null);
         }
      }
   }

   public boolean g(dcv $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, dcv $$1) {
      if ($$1.f()) {
         return false;
      } else {
         try {
            if ($$1.n()) {
               if ($$0 == -1) {
                  $$0 = this.j();
               }

               if ($$0 >= 0) {
                  this.k.set($$0, $$1.g());
                  this.k.get($$0).d(5);
                  return true;
               } else if (this.j.gc()) {
                  $$1.e(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int $$2;
               do {
                  $$2 = $$1.M();
                  if ($$0 == -1) {
                     $$1.e(this.k($$1));
                  } else {
                     $$1.e(this.d($$0, $$1));
                  }
               } while (!$$1.f() && $$1.M() < $$2);

               if ($$1.M() == $$2 && this.j.gc()) {
                  $$1.e(0);
                  return true;
               } else {
                  return $$1.M() < $$2;
               }
            }
         } catch (Throwable var6) {
            p $$4 = p.a(var6, "Adding item to inventory");
            q $$5 = $$4.a("Item being added");
            $$5.a("Item ID", dcr.a($$1.h()));
            $$5.a("Item data", $$1.o());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new aa($$4);
         }
      }
   }

   public void h(dcv $$0) {
      this.a($$0, true);
   }

   public void a(dcv $$0, boolean $$1) {
      while (!$$0.f()) {
         int $$2 = this.f($$0);
         if ($$2 == -1) {
            $$2 = this.j();
         }

         if ($$2 == -1) {
            this.j.a($$0, false);
            break;
         }

         int $$3 = $$0.k() - this.a($$2).M();
         if (this.c($$2, $$0.a($$3)) && $$1 && this.j instanceof auc $$4) {
            $$4.g.b(this.f($$2));
         }
      }
   }

   public agi f(int $$0) {
      return new agi($$0, this.a($$0).v());
   }

   @Override
   public dcv a(int $$0, int $$1) {
      if ($$0 < this.k.size()) {
         return bxd.a(this.k, $$0, $$1);
      } else {
         bzw $$2 = (bzw)i.get($$0);
         if ($$2 != null) {
            dcv $$3 = this.m.a($$2);
            if (!$$3.f()) {
               return $$3.a($$1);
            }
         }

         return dcv.l;
      }
   }

   public void i(dcv $$0) {
      for (int $$1 = 0; $$1 < this.k.size(); $$1++) {
         if (this.k.get($$1) == $$0) {
            this.k.set($$1, dcv.l);
            return;
         }
      }

      ObjectIterator var5 = i.values().iterator();

      while (var5.hasNext()) {
         bzw $$2 = (bzw)var5.next();
         dcv $$3 = this.m.a($$2);
         if ($$3 == $$0) {
            this.m.a($$2, dcv.l);
            return;
         }
      }
   }

   @Override
   public dcv b(int $$0) {
      if ($$0 < this.k.size()) {
         dcv $$1 = this.k.get($$0);
         this.k.set($$0, dcv.l);
         return $$1;
      } else {
         bzw $$2 = (bzw)i.get($$0);
         return $$2 != null ? this.m.a($$2, dcv.l) : dcv.l;
      }
   }

   @Override
   public void a(int $$0, dcv $$1) {
      if ($$0 < this.k.size()) {
         this.k.set($$0, $$1);
      }

      bzw $$2 = (bzw)i.get($$0);
      if ($$2 != null) {
         this.m.a($$2, $$1);
      }
   }

   public void a(fdc.a<bxk> $$0) {
      for (int $$1 = 0; $$1 < this.k.size(); $$1++) {
         dcv $$2 = this.k.get($$1);
         if (!$$2.f()) {
            $$0.a(new bxk($$1, $$2));
         }
      }
   }

   public void a(fda.a<bxk> $$0) {
      this.k.clear();

      for (bxk $$1 : $$0) {
         if ($$1.a(this.k.size())) {
            this.a($$1.a(), $$1.b());
         }
      }
   }

   @Override
   public int b() {
      return this.k.size() + i.size();
   }

   @Override
   public boolean c() {
      for (dcv $$0 : this.k) {
         if (!$$0.f()) {
            return false;
         }
      }

      ObjectIterator var3 = i.values().iterator();

      while (var3.hasNext()) {
         bzw $$1 = (bzw)var3.next();
         if (!this.m.a($$1).f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dcv a(int $$0) {
      if ($$0 < this.k.size()) {
         return this.k.get($$0);
      } else {
         bzw $$1 = (bzw)i.get($$0);
         return $$1 != null ? this.m.a($$1) : dcv.l;
      }
   }

   @Override
   public xo aj() {
      return xo.c("container.inventory");
   }

   public void m() {
      for (int $$0 = 0; $$0 < this.k.size(); $$0++) {
         dcv $$1 = this.k.get($$0);
         if (!$$1.f()) {
            this.j.a($$1, true, false);
            this.k.set($$0, dcv.l);
         }
      }

      this.m.a((cam)this.j);
   }

   @Override
   public void e() {
      this.n++;
   }

   public int n() {
      return this.n;
   }

   @Override
   public boolean a(cut $$0) {
      return true;
   }

   public boolean j(dcv $$0) {
      for (dcv $$1 : this) {
         if (!$$1.f() && dcv.c($$1, $$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(bae<dcr> $$0) {
      for (dcv $$1 : this) {
         if (!$$1.f() && $$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(Predicate<dcv> $$0) {
      for (dcv $$1 : this) {
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   public void a(cus $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.c($$0.f());
   }

   @Override
   public void a() {
      this.k.clear();
      this.m.b();
   }

   public void a(cuz $$0) {
      for (dcv $$1 : this.k) {
         $$0.a($$1);
      }
   }

   public dcv a(boolean $$0) {
      dcv $$1 = this.g();
      return $$1.f() ? dcv.l : this.a(this.l, $$0 ? $$1.M() : 1);
   }
}
