import javax.annotation.Nullable;

public class daf implements bxc, dad {
   private final ju<dcv> b = ju.a(1, dcv.l);
   @Nullable
   private dhr<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for (dcv $$0 : this.b) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dcv a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public dcv a(int $$0, int $$1) {
      return bxd.a(this.b, 0);
   }

   @Override
   public dcv b(int $$0) {
      return bxd.a(this.b, 0);
   }

   @Override
   public void a(int $$0, dcv $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cut $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable dhr<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public dhr<?> d() {
      return this.c;
   }
}
