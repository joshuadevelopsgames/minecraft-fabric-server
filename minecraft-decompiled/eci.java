import javax.annotation.Nullable;

public abstract class eci extends eas implements bxq {
   @Nullable
   protected amd<fdo> l;
   protected long m = 0L;

   protected eci(ebb<?> $$0, jb $$1, eeb $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public amd<fdo> aw_() {
      return this.l;
   }

   @Override
   public void a(@Nullable amd<fdo> $$0) {
      this.l = $$0;
   }

   @Override
   public long az_() {
      return this.m;
   }

   @Override
   public void a(long $$0) {
      this.m = $$0;
   }

   @Override
   public boolean c() {
      this.f_(null);
      return super.c();
   }

   @Override
   public dcv a(int $$0) {
      this.f_(null);
      return super.a($$0);
   }

   @Override
   public dcv a(int $$0, int $$1) {
      this.f_(null);
      return super.a($$0, $$1);
   }

   @Override
   public dcv b(int $$0) {
      this.f_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, dcv $$1) {
      this.f_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cut $$0) {
      return super.d($$0) && (this.l == null || !$$0.am());
   }

   @Nullable
   @Override
   public cym createMenu(int $$0, cus $$1, cut $$2) {
      if (this.d($$2)) {
         this.f_($$1.j);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(kl $$0) {
      super.a($$0);
      dfw $$1 = $$0.a(kq.at);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kq.at, new dfw(this.l, this.m));
      }
   }

   @Override
   public void b(fdc $$0) {
      super.b($$0);
      $$0.c("LootTable");
      $$0.c("LootTableSeed");
   }
}
