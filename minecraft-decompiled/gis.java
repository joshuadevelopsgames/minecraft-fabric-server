import java.util.Arrays;

public class gis extends giq {
   private static final xo a = xo.c("options.sounds.title");

   public gis(get $$0, fui $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      this.d.a(this.c.c(aza.a));
      this.d.a(this.F());
      this.d.a(this.c.ax());
      this.d.a(this.c.aa(), this.c.ab());
      this.d.a(this.c.az(), this.c.aA());
   }

   private fuh<?>[] F() {
      return Arrays.stream(aza.values()).filter($$0 -> $$0 != aza.a).map(this.c::c).toArray(fuh[]::new);
   }
}
