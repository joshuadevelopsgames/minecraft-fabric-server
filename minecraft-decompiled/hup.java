import java.util.List;
import java.util.function.Function;

public class hup implements gzc {
   private final bvt<gzc> a;
   private final hrs b;

   public hup(bvt<gzc> $$0) {
      this.a = $$0;
      gzc $$1 = $$0.d().getFirst().a();
      this.b = $$1.a();
   }

   @Override
   public hrs a() {
      return this.b;
   }

   @Override
   public void a(bck $$0, List<gzb> $$1) {
      this.a.b($$0).a($$0, $$1);
   }

   public record a(bvt<gzc.b> d) implements gzc.b {
      @Override
      public gzc a(huc $$0) {
         return new hup(this.d.a((Function<gzc.b, gzc>)($$1 -> $$1.a($$0))));
      }

      @Override
      public void a(huk.a $$0) {
         this.d.d().forEach($$1 -> $$1.a().a($$0));
      }

      public bvt<gzc.b> b() {
         return this.d;
      }
   }
}
