import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class fsg extends fzs implements fsb {
   private static final int d = 212;
   private static final int e = 2;
   private static final int f = 6;
   static final xo a = xo.c("mco.configure.world.settings.title");
   private static final xo g = xo.c("mco.configure.world.name");
   private static final xo h = xo.c("mco.configure.world.description");
   private static final xo i = xo.c("mco.configure.world.region_preference");
   private final fsc j;
   private final fue k;
   private fpx l;
   private final Map<fpw, fqn> m;
   final fxo b;
   private fxx n;
   private fxx o;
   private final fyx p;
   private final fyb q;
   private fsg.a r;

   fsg(fsc $$0, fue $$1, fpx $$2, Map<fpw, fqn> $$3) {
      super(a);
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      gbj.b $$4 = this.c.b(6).d(1);
      $$4.a(new fyx(g, $$0.B()));
      this.o = new fxx($$1.h, 0, 0, 212, 20, xo.c("mco.configure.world.name"));
      this.o.f(32);
      $$4.a(this.o);
      $$4.a(gbp.b(2));
      $$4.a(new fyx(h, $$0.B()));
      this.n = new fxx($$1.h, 0, 0, 212, 20, xo.c("mco.configure.world.description"));
      this.n.f(32);
      $$4.a(this.n);
      $$4.a(gbp.b(2));
      $$4.a(new fyx(i, $$0.B()));
      gbh $$5 = new gbh(0, 0, 212, 9, gbh.b.a);
      this.p = $$5.a(new fyx(192, 9, xo.i(), $$0.B()).c());
      this.q = $$5.a(fyb.a(10, 8, fqn.e.b()));
      $$4.a($$5);
      $$4.a(fxo.a(xo.c("mco.configure.world.buttons.region_preference"), $$0x -> this.c()).a(0, 0, 212, 20).a());
      $$4.a(gbp.b(2));
      this.b = $$4.a(fxo.a(xo.i(), $$3x -> {
         if ($$2.f == fpx.c.b) {
            $$1.a(frs.a($$0, xo.c("mco.configure.world.close.question.title"), xo.c("mco.configure.world.close.question.line1"), $$1xx -> {
               this.a();
               $$0.l();
            }));
         } else {
            this.a();
            $$0.b(false);
         }
      }).a(0, 0, 212, 20).a());
      this.b.j = false;
      this.a($$2);
   }

   private static yc a(fsg.a $$0) {
      return ($$0.a().equals(fqj.c) && $$0.b() != null ? xo.c($$0.b().z) : xo.c($$0.a().f)).a(o.h);
   }

   private static ame a(fsg.a $$0, Map<fpw, fqn> $$1) {
      if ($$0.b() != null && $$1.containsKey($$0.b())) {
         fqn $$2 = $$1.getOrDefault($$0.b(), fqn.e);
         return $$2.b();
      } else {
         return fqn.e.b();
      }
   }

   private void c() {
      this.k.a(new fsf(this.j, this::a, this.m, this.r));
   }

   private void a(fqj $$0, fpw $$1) {
      this.r = new fsg.a($$0, $$1);
      this.d();
   }

   private void d() {
      this.p.b(a(this.r));
      this.q.a(a(this.r, this.m));
      this.q.k = this.r.a == fqj.c;
   }

   @Override
   public void b(fpx $$0) {
      this.a($$0);
   }

   @Override
   public void a(fpx $$0) {
      this.l = $$0;
      if ($$0.y == null) {
         $$0.y = fqk.a;
      }

      if ($$0.y.b == fqj.c && $$0.y.c == null) {
         Optional<fpw> $$1 = this.m.keySet().stream().findFirst();
         $$1.ifPresent($$1x -> $$0.y.c = $$1x);
      }

      String $$2 = $$0.f == fpx.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      this.b.b(xo.c($$2));
      this.b.j = true;
      this.r = new fsg.a($$0.y.b, $$0.y.c);
      this.o.a(Objects.requireNonNullElse($$0.b(), ""));
      this.n.a($$0.a());
      this.d();
   }

   @Override
   public void c(fpx $$0) {
      this.a();
   }

   public void a() {
      if (this.l.y == null
         || !Objects.equals(this.o.a(), this.l.d)
         || !Objects.equals(this.n.a(), this.l.e)
         || this.r.a() != this.l.y.b
         || this.r.b() != this.l.y.c) {
         this.j.a(this.o.a(), this.n.a(), this.r.a(), this.r.b());
      }
   }

   public record a(fqj a, @Nullable fpw b) {
   }
}
