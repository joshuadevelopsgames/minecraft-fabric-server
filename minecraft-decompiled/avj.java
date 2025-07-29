public class avj implements alc {
   private static final xo b = xo.c("multiplayer.status.request_handled");
   private final alb c;
   private final wd d;
   private boolean e;

   public avj(alb $$0, wd $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(wf $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   @Override
   public void a(ald $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new ala(this.c));
      }
   }

   @Override
   public void a(akx $$0) {
      this.d.a(new aku($$0.b()));
      this.d.a(b);
   }
}
