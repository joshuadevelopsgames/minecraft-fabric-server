import java.util.List;

public class dar implements cze {
   private final ju<dcv> b;
   private final int c;
   private final int d;
   private final cym e;

   public dar(cym $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, ju.a($$1 * $$2, dcv.l));
   }

   private dar(cym $$0, int $$1, int $$2, ju<dcv> $$3) {
      this.b = $$3;
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public int b() {
      return this.b.size();
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
      return $$0 >= this.b() ? dcv.l : this.b.get($$0);
   }

   @Override
   public dcv b(int $$0) {
      return bxd.a(this.b, $$0);
   }

   @Override
   public dcv a(int $$0, int $$1) {
      dcv $$2 = bxd.a(this.b, $$0, $$1);
      if (!$$2.f()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, dcv $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
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
   public int g() {
      return this.d;
   }

   @Override
   public int ay_() {
      return this.c;
   }

   @Override
   public List<dcv> h() {
      return List.copyOf(this.b);
   }

   @Override
   public void fillStackedContents(cuz $$0) {
      for (dcv $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
