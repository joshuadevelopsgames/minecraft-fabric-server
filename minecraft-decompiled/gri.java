import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gri extends grh implements aby, xc {
   static final Logger k = LogUtils.getLogger();
   private final GameProfile l;
   private cyd m;
   private final jz.b n;
   private final gry o = new gry();
   @Nullable
   private grr p;
   @Nullable
   protected fxp.c j;

   public gri(fue $$0, wd $$1, grp $$2) {
      super($$0, $$1, $$2);
      this.l = $$2.a();
      this.n = $$2.c();
      this.m = $$2.d();
      this.j = $$2.i();
   }

   @Override
   public boolean c() {
      return this.b.i();
   }

   @Override
   protected void a(abe $$0) {
      this.b($$0);
   }

   private void b(abe $$0) {
      k.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(aca $$0) {
      zz.a($$0, this, this.a);
      this.o.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aar $$0) {
      zz.a($$0, this, this.a);
      this.o.a($$0.b());
   }

   @Override
   public void a(acd $$0) {
      this.m = cyf.e.a($$0.b());
   }

   @Override
   public void a(acc $$0) {
      zz.a($$0, this, this.a);
      if (this.p == null) {
         this.p = new grr();
      }

      List<awv> $$1 = this.p.a($$0.b());
      this.b(new aci($$1));
   }

   @Override
   public void a(acb $$0) {
      this.j = null;
   }

   private <T> T a(Function<axr, T> $$0) {
      if (this.p == null) {
         return $$0.apply(axr.b);
      } else {
         Object var3;
         try (axe $$1 = this.p.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abz $$0) {
      zz.a($$0, this, this.a);
      jz.b $$1 = this.a($$0x -> this.o.a($$0x, this.n, this.b.e()));
      this.b.a(ahl.c.a(wx.a($$1)), new grl(this.a, this.b, new grp(this.l, this.e, $$1, this.m, this.d, this.c, this.f, this.h, this.j, this.i, this.a())));
      this.b.a(ach.a);
      this.b.a(ahl.b.a(wx.a($$1), new ahl.a() {
         @Override
         public boolean a() {
            return true;
         }
      }));
   }

   @Override
   public void d() {
      this.g();
   }

   @Override
   public void a(wf $$0) {
      super.a($$0);
      this.a.C();
   }

   @Override
   protected gfi e() {
      return new gfi() {
         @Override
         public void a(xo $$0) {
            gri.this.b.a($$0);
         }

         @Override
         public void a(String $$0, @Nullable get $$1) {
            gri.k.warn("Commands are not supported in configuration phase, trying to run '{}'", $$0);
         }

         @Override
         public void a(jl<art> $$0, @Nullable get $$1) {
            gri.this.a($$0, this, $$1);
         }

         @Override
         public void a(ame $$0, Optional<vi> $$1) {
            gri.this.b(new aav($$0, $$1));
         }

         @Override
         public amw a() {
            return gri.this.a();
         }
      };
   }
}
