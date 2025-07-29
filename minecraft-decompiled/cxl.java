import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cxl extends bxc, bxm {
   fis dv();

   fin cV();

   @Nullable
   amd<fdo> q();

   void a(@Nullable amd<fdo> var1);

   long s();

   void a(long var1);

   ju<dcv> t();

   void H();

   dmu ai();

   boolean dU();

   @Override
   default boolean c() {
      return this.h();
   }

   default void c_(fdc $$0) {
      if (this.q() != null) {
         $$0.a("LootTable", this.q().a().toString());
         if (this.s() != 0L) {
            $$0.a("LootTableSeed", this.s());
         }
      } else {
         bxd.a($$0, this.t());
      }
   }

   default void b_(fda $$0) {
      this.H();
      amd<fdo> $$1 = $$0.<amd<fdo>>a("LootTable", fdo.a).orElse(null);
      this.a($$1);
      this.a($$0.a("LootTableSeed", 0L));
      if ($$1 == null) {
         bxd.a($$0, this.t());
      }
   }

   default void a(byb $$0, aub $$1, bzm $$2) {
      if ($$1.P().c(dmq.j)) {
         bxf.a($$1, $$2, this);
         bzm $$3 = $$0.c();
         if ($$3 != null && $$3.ap() == bzv.bU) {
            ctj.a($$1, (cut)$$3, true);
         }
      }
   }

   default bxj b_(cut $$0) {
      $$0.a(this);
      return bxj.a;
   }

   default void c_(@Nullable cut $$0) {
      MinecraftServer $$1 = this.ai().q();
      if (this.q() != null && $$1 != null) {
         fdo $$2 = $$1.bc().a(this.q());
         if ($$0 != null) {
            aq.Q.a((auc)$$0, this.q());
         }

         this.a(null);
         fdm.a $$3 = new fdm.a((aub)this.ai()).a(fgd.f, this.dv());
         if ($$0 != null) {
            $$3.a($$0.em()).a(fgd.a, $$0);
         }

         $$2.a(this, $$3.a(fgc.c), this.s());
      }
   }

   default void ak_() {
      this.c_(null);
      this.t().clear();
   }

   default boolean h() {
      for (dcv $$0 : this.t()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   default dcv f_(int $$0) {
      this.c_(null);
      dcv $$1 = this.t().get($$0);
      if ($$1.f()) {
         return dcv.l;
      } else {
         this.t().set($$0, dcv.l);
         return $$1;
      }
   }

   default dcv g_(int $$0) {
      this.c_(null);
      return this.t().get($$0);
   }

   default dcv b(int $$0, int $$1) {
      this.c_(null);
      return bxd.a(this.t(), $$0, $$1);
   }

   default void c(int $$0, dcv $$1) {
      this.c_(null);
      this.t().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   default cbd h_(final int $$0) {
      return $$0 >= 0 && $$0 < this.b() ? new cbd() {
         @Override
         public dcv a() {
            return cxl.this.g_($$0);
         }

         @Override
         public boolean a(dcv $$0x) {
            cxl.this.c($$0, $$0);
            return true;
         }
      } : cbd.a;
   }

   default boolean d_(cut $$0) {
      return !this.dU() && $$0.a(this.cV(), 4.0);
   }
}
