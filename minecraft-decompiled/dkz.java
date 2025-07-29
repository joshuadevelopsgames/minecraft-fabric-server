import java.util.Map;

public record dkz(int a, Map<dlb, Integer> b, int c, jl<ayy> d, float e, float f, bae<dcr> g, amd<dlc> h) {
   public dfm a(dlb $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      dfm.a $$2 = dfm.a();
      bzx $$3 = bzx.a($$0.a());
      ame $$4 = ame.b("armor." + $$0.b());
      $$2.a(cbs.a, new cbq($$4, $$1, cbq.a.a), $$3);
      $$2.a(cbs.b, new cbq($$4, this.e, cbq.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(cbs.q, new cbq($$4, this.f, cbq.a.a), $$3);
      }

      return $$2.a();
   }
}
