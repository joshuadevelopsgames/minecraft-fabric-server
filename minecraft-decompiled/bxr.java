import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bxr implements bxc, dap {
   private final int b;
   private final ju<dcv> c;
   @Nullable
   private List<bxe> d;

   public bxr(int $$0) {
      this.b = $$0;
      this.c = ju.a($$0, dcv.l);
   }

   public bxr(dcv... $$0) {
      this.b = $$0.length;
      this.c = ju.a(dcv.l, $$0);
   }

   public void a(bxe $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(bxe $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public dcv a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : dcv.l;
   }

   public List<dcv> f() {
      List<dcv> $$0 = this.c.stream().filter($$0x -> !$$0x.f()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public dcv a(int $$0, int $$1) {
      dcv $$2 = bxd.a(this.c, $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public dcv a(dcr $$0, int $$1) {
      dcv $$2 = new dcv($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         dcv $$4 = this.a($$3);
         if ($$4.h().equals($$0)) {
            int $$5 = $$1 - $$2.M();
            dcv $$6 = $$4.a($$5);
            $$2.g($$6.M());
            if ($$2.M() == $$1) {
               break;
            }
         }
      }

      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public dcv b(dcv $$0) {
      if ($$0.f()) {
         return dcv.l;
      } else {
         dcv $$1 = $$0.v();
         this.e($$1);
         if ($$1.f()) {
            return dcv.l;
         } else {
            this.d($$1);
            return $$1.f() ? dcv.l : $$1;
         }
      }
   }

   public boolean c(dcv $$0) {
      boolean $$1 = false;

      for (dcv $$2 : this.c) {
         if ($$2.f() || dcv.c($$2, $$0) && $$2.M() < $$2.k()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public dcv b(int $$0) {
      dcv $$1 = this.c.get($$0);
      if ($$1.f()) {
         return dcv.l;
      } else {
         this.c.set($$0, dcv.l);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, dcv $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.f_($$1));
      this.e();
   }

   @Override
   public int b() {
      return this.b;
   }

   @Override
   public boolean c() {
      for (dcv $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (bxe $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cut $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void fillStackedContents(cuz $$0) {
      for (dcv $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.f()).collect(Collectors.toList()).toString();
   }

   private void d(dcv $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         dcv $$2 = this.a($$1);
         if ($$2.f()) {
            this.a($$1, $$0.g());
            return;
         }
      }
   }

   private void e(dcv $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         dcv $$2 = this.a($$1);
         if (dcv.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.f()) {
               return;
            }
         }
      }
   }

   private void a(dcv $$0, dcv $$1) {
      int $$2 = this.f_($$1);
      int $$3 = Math.min($$0.M(), $$2 - $$1.M());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(fda.a<dcv> $$0) {
      this.a();

      for (dcv $$1 : $$0) {
         this.b($$1);
      }
   }

   public void a(fdc.a<dcv> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         dcv $$2 = this.a($$1);
         if (!$$2.f()) {
            $$0.a($$2);
         }
      }
   }

   public ju<dcv> g() {
      return this.c;
   }
}
