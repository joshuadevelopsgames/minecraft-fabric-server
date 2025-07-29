import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class gdt extends get {
   private static final xo a = xo.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final gbk c = new gbk(this);
   private final get d;
   private final Consumer<jl<dnx>> e;
   final jy<dnx> f;
   private gdt.a u;
   jl<dnx> v;
   private fxo w;

   public gdt(get $$0, gkv $$1, Consumer<jl<dnx>> $$2) {
      super(xo.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.e = $$2;
      this.f = $$1.a().f(mn.aK);
      jl<dnx> $$3 = this.f.a(doe.b).or(() -> this.f.c().findAny()).orElseThrow();
      this.v = $$1.e().a().d().c().stream().findFirst().orElse($$3);
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
      $$0.a(new fyx(a, this.q));
      this.u = this.c.c(new gdt.a());
      gbo $$1 = this.c.b(gbo.e().a(8));
      this.w = $$1.a(fxo.a(xn.d, $$0x -> {
         this.e.accept(this.v);
         this.aP_();
      }).a());
      $$1.a(fxo.a(xn.e, $$0x -> this.aP_()).a());
      this.u.a(this.u.aH_().stream().filter($$0x -> Objects.equals($$0x.b, this.v)).findFirst().orElse(null));
      this.c.a(this::c);
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

   class a extends fyl<gdt.a.a> {
      a() {
         super(gdt.this.n, gdt.this.o, gdt.this.p - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         gdt.this.f.c().map($$0x -> new gdt.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable gdt.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            gdt.this.v = $$0.b;
         }

         gdt.this.l();
      }

      class a extends fyl.a<gdt.a.a> {
         final jl.c<dnx> b;
         final xo c;

         public a(final jl.c<dnx> $$0) {
            this.b = $$0;
            ame $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (ud.a().b($$2)) {
               this.c = xo.c($$2);
            } else {
               this.c = xo.b($$1.toString());
            }
         }

         @Override
         public xo a() {
            return xo.a("narrator.select", this.c);
         }

         @Override
         public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(gdt.this.q, this.c, $$3 + 5, $$2 + 2, -1);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
