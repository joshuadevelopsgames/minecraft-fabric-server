import java.util.ArrayList;
import java.util.List;

public class gir extends giq {
   private static final xo a = xo.c("options.skinCustomisation.title");

   public gir(get $$0, fui $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      List<fxm> $$0 = new ArrayList<>();

      for (cuv $$1 : cuv.values()) {
         $$0.add(fxv.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.y().a(this.c));
      this.d.a($$0);
   }
}
