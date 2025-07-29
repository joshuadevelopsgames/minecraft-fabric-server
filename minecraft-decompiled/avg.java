import net.minecraft.server.MinecraftServer;

public class avg implements ajx {
   private static final xo b = xo.c("disconnect.ignoring_status_request");
   private final MinecraftServer c;
   private final wd d;

   public avg(MinecraftServer $$0, wd $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aju $$0) {
      switch ($$0.g()) {
         case b:
            this.a($$0, false);
            break;
         case a:
            alb $$1 = this.c.au();
            this.d.a(alf.d);
            if (this.c.am() && $$1 != null) {
               this.d.a(alf.b, new avj($$1, this.d));
            } else {
               this.d.a(b);
            }
            break;
         case c:
            if (!this.c.bm()) {
               this.d.a(akg.d);
               xo $$2 = xo.c("multiplayer.disconnect.transfers_disabled");
               this.d.a(new akd($$2));
               this.d.a($$2);
            } else {
               this.a($$0, true);
            }
            break;
         default:
            throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      }
   }

   private void a(aju $$0, boolean $$1) {
      this.d.a(akg.d);
      if ($$0.b() != ac.b().d()) {
         xo $$2;
         if ($$0.b() < 754) {
            $$2 = xo.a("multiplayer.disconnect.outdated_client", ac.b().c());
         } else {
            $$2 = xo.a("multiplayer.disconnect.incompatible", ac.b().c());
         }

         this.d.a(new akd($$2));
         this.d.a($$2);
      } else {
         this.d.a(akg.b, new avh(this.c, this.d, $$1));
      }
   }

   @Override
   public void a(wf $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }
}
