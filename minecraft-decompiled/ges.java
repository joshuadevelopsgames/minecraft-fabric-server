import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ges extends get {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final xo c = xo.c("recover_world.title").a(o.r);
   private static final xo d = xo.c("recover_world.bug_tracker");
   private static final xo e = xo.c("recover_world.restore");
   private static final xo f = xo.c("recover_world.no_fallback");
   private static final xo u = xo.c("recover_world.done.title");
   private static final xo v = xo.c("recover_world.done.success");
   private static final xo w = xo.c("recover_world.done.failed");
   private static final xo x = xo.c("recover_world.issue.none").a(o.k);
   private static final xo y = xo.c("recover_world.issue.missing_file").a(o.m);
   private final BooleanConsumer z;
   private final gbo A = gbo.d().a(8);
   private final xo B;
   private final fyj C;
   private final fyj D;
   private final fcs.c E;

   public ges(fue $$0, BooleanConsumer $$1, fcs.c $$2) {
      super(c);
      this.z = $$1;
      this.B = xo.a("recover_world.message", xo.b($$2.f()).a(o.h));
      this.C = new fyj(this.B, $$0.h);
      this.E = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      xo $$5 = xo.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.D = new fyj($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.A.c().b();
      this.A.a(new fyx(this.m, $$0.h));
      this.A.a(this.C.b(true));
      this.A.a(this.D);
      gbo $$7 = gbo.e().a(5);
      $$7.a(fxo.a(d, gdq.b(this, bav.j)).b(120, 20).a());
      $$7.a(fxo.a(e, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fzb.a(f)).a()).j = $$6;
      this.A.a($$7);
      this.A.a(fxo.a(xn.k, $$0x -> this.aP_()).b(120, 20).a());
      this.A.a(this::c);
   }

   private void a(fue $$0) {
      Exception $$1 = this.a(this.E, false);
      Exception $$2 = this.a(this.E, true);
      if ($$1 != null && $$2 == null) {
         $$0.c(new gee(xo.c("recover_world.restoring")));
         gko.a(this.E);
         if (this.E.n()) {
            $$0.a(new gdr(this.z, u, v, xn.j, xn.k));
         } else {
            $$0.a(new gdm(() -> this.z.accept(false), u, w));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new gdm(() -> this.z.accept(false), u, w));
      }
   }

   private xo a(fcs.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return xo.i();
      } else {
         yc $$3 = xo.i();
         Instant $$4 = $$0.a($$1);
         yc $$5 = $$4 != null ? xo.b(gkz.a.format($$4)) : xo.c("recover_world.state_entry.unknown");
         $$3.b(xo.a("recover_world.state_entry", $$5.a(o.h)));
         if ($$2 == null) {
            $$3.b(x);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(y);
         } else if ($$2 instanceof va) {
            $$3.b(xo.b($$2.getCause().toString()).a(o.m));
         } else {
            $$3.b(xo.b($$2.toString()).a(o.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(fcs.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (ut | va | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.c();
   }

   @Override
   protected void c() {
      this.D.d(this.o - 50);
      this.C.d(this.o - 50);
      this.A.a();
      gbi.a(this.A, this.I());
   }

   @Override
   public xo i() {
      return xn.a(super.i(), this.B);
   }

   @Override
   public void aP_() {
      this.z.accept(false);
   }
}
