import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class fwg implements fwe {
   private final dpz a;
   private final List<fwg.a> b = new ArrayList<>();

   private fwg(dpz $$0) {
      this.a = $$0;
   }

   @Override
   public dpz a() {
      return this.a;
   }

   public static fwg a(dpz $$0) {
      return new fwg($$0);
   }

   public fwg a(fwc $$0) {
      this.b.add(new fwg.a(Optional.empty(), $$0));
      return this;
   }

   private void a(gzp $$0) {
      $$0.instantiate(this.a.l());
   }

   public fwg a(gzp $$0, fwc $$1) {
      this.a($$0);
      this.b.add(new fwg.a(Optional.of($$0), $$1));
      return this;
   }

   public fwg a(fwf $$0, fwc $$1) {
      return this.a($$0.a(), $$1);
   }

   @Override
   public gza b() {
      return new gza(Optional.empty(), Optional.of(new gza.a(this.b.stream().map(fwg.a::a).toList())));
   }

   record a(Optional<gzp> a, fwc b) {
      public gzs a() {
         return new gzs(this.a, this.b.a());
      }

      public Optional<gzp> b() {
         return this.a;
      }

      public fwc c() {
         return this.b;
      }
   }
}
