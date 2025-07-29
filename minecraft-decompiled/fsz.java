public class fsz extends ftc {
   private static final xo b = xo.c("mco.connect.connecting");
   private final hye c;
   private final fpx d;
   private final fpt e;

   public fsz(get $$0, fpx $$1, fpt $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hye($$0);
   }

   @Override
   public void run() {
      if (this.e.a() != null) {
         this.c.a(this.d, gtc.a(this.e.a()));
      } else {
         this.b();
      }
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      fue.R().ag().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public xo a() {
      return b;
   }
}
