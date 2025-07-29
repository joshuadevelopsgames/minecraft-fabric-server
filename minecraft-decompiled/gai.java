import java.util.Objects;

public class gai implements gag {
   private static final ame e = ame.b("hud/jump_bar_background");
   private static final ame f = ame.b("hud/jump_bar_cooldown");
   private static final ame g = ame.b("hud/jump_bar_progress");
   private final fue h;
   private final caw i;

   public gai(fue $$0) {
      this.h = $$0;
      this.i = Objects.requireNonNull($$0.t).u();
   }

   @Override
   public void a(fxb $$0, ftu $$1) {
      int $$2 = this.a(this.h.aP());
      int $$3 = this.b(this.h.aP());
      $$0.a(gxx.ar, e, $$2, $$3, 182, 5);
      if (this.i.c() > 0) {
         $$0.a(gxx.ar, f, $$2, $$3, 182, 5);
      } else {
         int $$4 = (int)(this.h.t.v() * 183.0F);
         if ($$4 > 0) {
            $$0.a(gxx.ar, g, 182, 5, 0, 0, $$2, $$3, $$4, 5);
         }
      }
   }

   @Override
   public void b(fxb $$0, ftu $$1) {
   }
}
