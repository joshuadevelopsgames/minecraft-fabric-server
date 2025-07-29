import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gte {
   public static final gte a = new gte(gtd.b, gtf.createDnsSrvRedirectHandler(), gta.a());
   private final gtd b;
   private final gtf c;
   private final gta d;

   @VisibleForTesting
   gte(gtd $$0, gtf $$1, gta $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gtb> a(gtc $$0) {
      Optional<gtb> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gtc> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
