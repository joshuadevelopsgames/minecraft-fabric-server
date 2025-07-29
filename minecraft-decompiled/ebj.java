import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class ebj extends eaz implements bxc {
   public static final int b = 6;
   private static final Logger c = LogUtils.getLogger();
   private static final int d = -1;
   private final ju<dcv> e = ju.a(6, dcv.l);
   private int f = -1;

   public ebj(jb $$0, eeb $$1) {
      super(ebb.N, $$0, $$1);
   }

   private void c(int $$0) {
      if ($$0 >= 0 && $$0 < 6) {
         this.f = $$0;
         eeb $$1 = this.m();

         for (int $$2 = 0; $$2 < dre.c.size(); $$2++) {
            boolean $$3 = !this.a($$2).f();
            ees $$4 = dre.c.get($$2);
            $$1 = $$1.b($$4, $$3);
         }

         Objects.requireNonNull(this.n).a(this.o, $$1, 3);
         this.n.a(ejb.c, this.o, ejb.a.a($$1));
      } else {
         c.error("Expected slot 0-5, got {}", $$0);
      }
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.e.clear();
      bxd.a($$0, this.e);
      this.f = $$0.a("last_interacted_slot", -1);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      bxd.a($$0, this.e, true);
      $$0.a("last_interacted_slot", this.f);
   }

   public int f() {
      return (int)this.e.stream().filter(Predicate.not(dcv::f)).count();
   }

   @Override
   public void a() {
      this.e.clear();
   }

   @Override
   public int b() {
      return 6;
   }

   @Override
   public boolean c() {
      return this.e.stream().allMatch(dcv::f);
   }

   @Override
   public dcv a(int $$0) {
      return this.e.get($$0);
   }

   @Override
   public dcv a(int $$0, int $$1) {
      dcv $$2 = Objects.requireNonNullElse(this.e.get($$0), dcv.l);
      this.e.set($$0, dcv.l);
      if (!$$2.f()) {
         this.c($$0);
      }

      return $$2;
   }

   @Override
   public dcv b(int $$0) {
      return this.a($$0, 1);
   }

   @Override
   public void a(int $$0, dcv $$1) {
      if ($$1.a(azx.bg)) {
         this.e.set($$0, $$1);
         this.c($$0);
      } else if ($$1.f()) {
         this.a($$0, 1);
      }
   }

   @Override
   public boolean a(bxc $$0, int $$1, dcv $$2) {
      return $$0.a_($$2x -> $$2x.f() ? true : dcv.c($$2, $$2x) && $$2x.M() + $$2.M() <= $$0.f_($$2x));
   }

   @Override
   public int an_() {
      return 1;
   }

   @Override
   public boolean a(cut $$0) {
      return bxc.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, dcv $$1) {
      return $$1.a(azx.bg) && this.a($$0).f() && $$1.M() == this.an_();
   }

   public int j() {
      return this.f;
   }

   @Override
   protected void a(kl $$0) {
      super.a($$0);
      $$0.a(kq.ap, dfn.a).a(this.e);
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kq.ap, dfn.a(this.e));
   }

   @Override
   public void b(fdc $$0) {
      $$0.c("Items");
   }
}
