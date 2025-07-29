import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hxk {
   private final UUID a = UUID.randomUUID();
   private final hxf b;
   private final hxo c;
   private final hxq d = new hxq();
   private final hxn e;
   private final hxp f;

   public hxk(hxf $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hxo($$3);
      this.e = new hxn();
      this.f = new hxp($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hxi.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dmr $$0, boolean $$1) {
      this.c.a($$0, $$1);
      this.d.a();
      this.b();
   }

   public void a(String $$0) {
      this.c.a($$0);
      this.b();
   }

   public void a(long $$0) {
      this.d.a($$0);
   }

   public void b() {
      if (this.c.a(this.b)) {
         this.f.a(this.b);
         this.e.a();
      }
   }

   public void c() {
      this.c.a(this.b);
      this.e.d();
      this.d.a(this.b);
   }

   public void a(dmu $$0, aj $$1) {
      ame $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ae();
         this.b.send(hxg.f, $$2x -> {
            $$2x.a(hxi.D, $$2.toString());
            $$2x.a(hxi.E, $$3);
         });
      }
   }
}
