import java.util.List;

public record fwc(bvt<gzl> a) {
   public fwc(bvt<gzl> a) {
      if (a.c()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   public fwc a(gzm $$0) {
      return new fwc(this.a.a($$0));
   }

   public gzc.b a() {
      List<bvs<gzl>> $$0 = this.a.d();
      return (gzc.b)($$0.size() == 1 ? new gzj.a($$0.getFirst().a()) : new hup.a(this.a.a(gzj.a::new)));
   }

   public bvt<gzl> b() {
      return this.a;
   }
}
