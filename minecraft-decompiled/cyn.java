import java.util.List;

public abstract class cyn extends dab {
   private final int o;
   private final int p;
   protected final cze m;
   protected final daf n = new daf();

   public cyn(czv<?> $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.o = $$2;
      this.p = $$3;
      this.m = new dar(this, $$2, $$3);
   }

   protected dak a(cut $$0, int $$1, int $$2) {
      return this.a(new dag($$0, this.m, this.n, 0, $$1, $$2));
   }

   @Override
   protected void d(int $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.o; $$2++) {
         for (int $$3 = 0; $$3 < this.p; $$3++) {
            this.a(new dak(this.m, $$3 + $$2 * this.o, $$0 + $$3 * 18, $$1 + $$2 * 18));
         }
      }
   }

   @Override
   public dab.a a(boolean $$0, boolean $$1, dhr<?> $$2, aub $$3, cus $$4) {
      dhr<dhb> $$5 = (dhr<dhb>)$$2;
      this.l();

      dab.a var8;
      try {
         List<dak> $$6 = this.n();
         var8 = alq.a(new alq.a<dhb>() {
            @Override
            public void a(cuz $$0) {
               cyn.this.a($$0);
            }

            @Override
            public void a() {
               cyn.this.n.a();
               cyn.this.m.a();
            }

            @Override
            public boolean a(dhr<dhb> $$0) {
               return $$0.b().a(cyn.this.m.aB_(), cyn.this.q().ai());
            }
         }, this.o, this.p, $$6, $$6, $$4, $$5, $$0, $$1);
      } finally {
         this.a($$3, (dhr<dhb>)$$2);
      }

      return var8;
   }

   @Override
   protected void l() {
   }

   protected void a(aub $$0, dhr<dhb> $$1) {
   }

   public abstract dak m();

   public abstract List<dak> n();

   public int o() {
      return this.o;
   }

   public int p() {
      return this.p;
   }

   protected abstract cut q();

   @Override
   public void a(cuz $$0) {
      this.m.fillStackedContents($$0);
   }
}
