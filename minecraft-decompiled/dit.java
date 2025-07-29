import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record dit(diu b, dis c, OptionalInt d, dhp e, Optional<List<dhi>> f) {
   public static final zm<wx, dit> a = zm.a(diu.a, dit::a, dis.e, dit::b, zk.i, dit::c, zk.a(mn.ai), dit::d, dhi.a.a(zk.a()).a(zk::a), dit::e, dit::new);

   public List<dcv> a(bdp $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(cuz $$0) {
      return this.f.isEmpty() ? false : $$0.a(this.f.get(), null);
   }

   public diu a() {
      return this.b;
   }

   public dis b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public dhp d() {
      return this.e;
   }

   public Optional<List<dhi>> e() {
      return this.f;
   }
}
