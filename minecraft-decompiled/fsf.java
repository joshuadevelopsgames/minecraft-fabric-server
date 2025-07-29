import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class fsf extends get {
   private static final xo a = xo.c("mco.configure.world.region_preference.title");
   private static final int b = 8;
   private final gbk c = new gbk(this);
   private final get d;
   private final BiConsumer<fqj, fpw> e;
   final Map<fpw, fqn> f;
   @Nullable
   private fsf.a u;
   fsg.a v;
   @Nullable
   private fxo w;

   public fsf(get $$0, BiConsumer<fqj, fpw> $$1, Map<fpw, fqn> $$2, fsg.a $$3) {
      super(a);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.v = $$3;
   }

   @Override
   public void aP_() {
      this.n.a(this.d);
   }

   @Override
   protected void aV_() {
      gbo $$0 = this.c.a(gbo.d().a(8));
      $$0.c().b();
      $$0.a(new fyx(this.o(), this.q));
      this.u = this.c.c(new fsf.a());
      gbo $$1 = this.c.b(gbo.e().a(8));
      this.w = $$1.a(fxo.a(xn.d, $$0x -> {
         this.e.accept(this.v.a(), this.v.b());
         this.aP_();
      }).a());
      $$1.a(fxo.a(xn.e, $$0x -> this.aP_()).a());
      this.u.a(this.u.aH_().stream().filter($$0x -> Objects.equals($$0x.b, this.v)).findFirst().orElse(null));
      this.c.a($$1x -> {
         fxm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      this.u.a(this.o, this.c);
   }

   void l() {
      this.w.j = this.u.p() != null;
   }

   class a extends fyl<fsf.a.a> {
      a() {
         super(fsf.this.n, fsf.this.o, fsf.this.p - 77, 40, 16);
         this.b(new fsf.a.a(fqj.a, null));
         this.b(new fsf.a.a(fqj.b, null));
         fsf.this.f.keySet().stream().map($$0 -> new fsf.a.a(fqj.c, $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fsf.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fsf.this.v = $$0.b;
         }

         fsf.this.l();
      }

      class a extends fyl.a<fsf.a.a> {
         final fsg.a b;
         private final xo c;

         public a(final fqj $$0, @Nullable final fpw $$1) {
            this(new fsg.a($$0, $$1));
         }

         public a(final fsg.a $$0) {
            this.b = $$0;
            if ($$0.a() == fqj.c) {
               if ($$0.b() != null) {
                  this.c = xo.c($$0.b().z);
               } else {
                  this.c = xo.i();
               }
            } else {
               this.c = xo.c($$0.a().f);
            }
         }

         @Override
         public xo a() {
            return xo.a("narrator.select", this.c);
         }

         @Override
         public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fsf.this.q, this.c, $$3 + 5, $$2 + 2, -1);
            if (this.b.b() != null && fsf.this.f.containsKey(this.b.b())) {
               fqn $$10 = fsf.this.f.getOrDefault(this.b.b(), fqn.e);
               $$0.a(gxx.ar, $$10.b(), $$3 + $$4 - 18, $$2 + 2, 10, 8);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
