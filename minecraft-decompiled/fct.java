import java.nio.file.Path;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fct implements Comparable<fct> {
   public static final xo a = xo.c("selectWorld.select");
   private final dmy b;
   private final fcu c;
   private final String d;
   private final boolean e;
   private final boolean f;
   private final boolean g;
   private final Path h;
   @Nullable
   private xo i;

   public fct(dmy $$0, fcu $$1, String $$2, boolean $$3, boolean $$4, boolean $$5, Path $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.e = $$3;
   }

   public String a() {
      return this.d;
   }

   public String b() {
      return StringUtils.isEmpty(this.b.a()) ? this.d : this.b.a();
   }

   public Path c() {
      return this.h;
   }

   public boolean d() {
      return this.e;
   }

   public boolean e() {
      return this.g;
   }

   public long f() {
      return this.c.b();
   }

   public int a(fct $$0) {
      if (this.f() < $$0.f()) {
         return 1;
      } else {
         return this.f() > $$0.f() ? -1 : this.d.compareTo($$0.d);
      }
   }

   public dmy g() {
      return this.b;
   }

   public dmr h() {
      return this.b.b();
   }

   public boolean i() {
      return this.b.c();
   }

   public boolean j() {
      return this.b.e();
   }

   public yc k() {
      return bdb.b(this.c.c()) ? xo.c("selectWorld.versionUnknown") : xo.b(this.c.c());
   }

   public fcu l() {
      return this.c;
   }

   public boolean m() {
      return this.o().a();
   }

   public boolean n() {
      return this.o() == fct.a.b;
   }

   public fct.a o() {
      ah $$0 = ac.b();
      int $$1 = $$0.a().b();
      int $$2 = this.c.d().b();
      if (!$$0.f() && $$2 < $$1) {
         return fct.a.c;
      } else {
         return $$2 > $$1 ? fct.a.b : fct.a.a;
      }
   }

   public boolean p() {
      return this.f;
   }

   public boolean q() {
      return !this.p() && !this.d() ? !this.r() : true;
   }

   public boolean r() {
      return ac.b().a().a(this.c.d());
   }

   public xo s() {
      if (this.i == null) {
         this.i = this.z();
      }

      return this.i;
   }

   private xo z() {
      if (this.p()) {
         return xo.c("selectWorld.locked").a(o.m);
      } else if (this.d()) {
         return xo.c("selectWorld.conversion").a(o.m);
      } else if (!this.r()) {
         return xo.a("selectWorld.incompatible.info", this.k()).a(o.m);
      } else {
         yc $$0 = this.i() ? xo.i().b(xo.c("gameMode.hardcore").b(-65536)) : xo.c("gameMode." + this.h().b());
         if (this.j()) {
            $$0.f(", ").b(xo.c("selectWorld.commands"));
         }

         if (this.e()) {
            $$0.f(", ").b(xo.c("selectWorld.experimental").a(o.o));
         }

         yc $$1 = this.k();
         yc $$2 = xo.b(", ").b(xo.c("selectWorld.version")).b(xn.w);
         if (this.m()) {
            $$2.b($$1.a(this.n() ? o.m : o.u));
         } else {
            $$2.b($$1);
         }

         $$0.b($$2);
         return $$0;
      }
   }

   public xo t() {
      return a;
   }

   public boolean u() {
      return !this.q();
   }

   public boolean v() {
      return !this.d() && !this.p();
   }

   public boolean w() {
      return !this.q();
   }

   public boolean x() {
      return !this.q();
   }

   public boolean y() {
      return true;
   }

   public static enum a {
      a(false, false, ""),
      b(true, true, "downgrade"),
      c(true, false, "snapshot");

      private final boolean d;
      private final boolean e;
      private final String f;

      private a(final boolean $$0, final boolean $$1, final String $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public boolean a() {
         return this.d;
      }

      public boolean b() {
         return this.e;
      }

      public String c() {
         return this.f;
      }
   }

   public static class b extends fct {
      private static final xo b = xo.c("recover_world.warning").a($$0 -> $$0.a(-65536));
      private static final xo c = xo.c("recover_world.button");
      private final long d;

      public b(String $$0, Path $$1, long $$2) {
         super(null, null, $$0, false, false, false, $$1);
         this.d = $$2;
      }

      @Override
      public String b() {
         return this.a();
      }

      @Override
      public xo s() {
         return b;
      }

      @Override
      public long f() {
         return this.d;
      }

      @Override
      public boolean q() {
         return false;
      }

      @Override
      public xo t() {
         return c;
      }

      @Override
      public boolean u() {
         return true;
      }

      @Override
      public boolean v() {
         return false;
      }

      @Override
      public boolean w() {
         return false;
      }

      @Override
      public boolean x() {
         return false;
      }
   }

   public static class c extends fct {
      private static final xo b = xo.c("symlink_warning.more_info");
      private static final xo c = xo.c("symlink_warning.title").b(-65536);

      public c(String $$0, Path $$1) {
         super(null, null, $$0, false, false, false, $$1);
      }

      @Override
      public String b() {
         return this.a();
      }

      @Override
      public xo s() {
         return c;
      }

      @Override
      public long f() {
         return -1L;
      }

      @Override
      public boolean q() {
         return false;
      }

      @Override
      public xo t() {
         return b;
      }

      @Override
      public boolean u() {
         return true;
      }

      @Override
      public boolean v() {
         return false;
      }

      @Override
      public boolean w() {
         return false;
      }

      @Override
      public boolean x() {
         return false;
      }
   }
}
