import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class fay {
   protected fbe b;
   protected cao c;
   protected final Int2ObjectMap<fax> d = new Int2ObjectOpenHashMap();
   protected int e;
   protected int f;
   protected int g;
   protected boolean h = true;
   protected boolean i;
   protected boolean j;
   protected boolean k;

   public void a(dnh $$0, cao $$1) {
      this.b = new fbe($$0, $$1);
      this.c = $$1;
      this.d.clear();
      this.e = bcb.d($$1.ds() + 1.0F);
      this.f = bcb.d($$1.dt() + 1.0F);
      this.g = bcb.d($$1.ds() + 1.0F);
   }

   public void b() {
      this.b = null;
      this.c = null;
   }

   protected fax b(jb $$0) {
      return this.c($$0.u(), $$0.v(), $$0.w());
   }

   protected fax c(int $$0, int $$1, int $$2) {
      return (fax)this.d.computeIfAbsent(fax.b($$0, $$1, $$2), $$3 -> new fax($$0, $$1, $$2));
   }

   public abstract fax a();

   public abstract fbg a(double var1, double var3, double var5);

   protected fbg b(double $$0, double $$1, double $$2) {
      return new fbg(this.c(bcb.a($$0), bcb.a($$1), bcb.a($$2)));
   }

   public abstract int a(fax[] var1, fax var2);

   public abstract fbc a(fbe var1, int var2, int var3, int var4, cao var5);

   public abstract fbc a(fbe var1, int var2, int var3, int var4);

   public fbc a(cao $$0, jb $$1) {
      return this.a(new fbe($$0.ai(), $$0), $$1.u(), $$1.v(), $$1.w());
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   public void b(boolean $$0) {
      this.i = $$0;
   }

   public void c(boolean $$0) {
      this.j = $$0;
   }

   public void d(boolean $$0) {
      this.k = $$0;
   }

   public boolean d() {
      return this.h;
   }

   public boolean e() {
      return this.i;
   }

   public boolean f() {
      return this.j;
   }

   public boolean g() {
      return this.k;
   }

   public static boolean a(eeb $$0) {
      return $$0.a(azo.aQ) || $$0.a(dqb.K) || $$0.a(dqb.lp) || dqp.h($$0) || $$0.a(dqb.fU);
   }
}
