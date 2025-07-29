import net.minecraft.server.MinecraftServer;

public class auz implements ajx {
   private final MinecraftServer b;
   private final wd c;

   public auz(MinecraftServer $$0, wd $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(aju $$0) {
      if ($$0.g() != ajt.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(akg.b, new avh(this.b, this.c, false));
         this.c.a(akg.d);
      }
   }

   @Override
   public void a(wf $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
