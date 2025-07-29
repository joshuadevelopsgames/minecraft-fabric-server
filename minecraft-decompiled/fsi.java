import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.Nullable;
import org.slf4j.Logger;

class fsi extends fzs implements fsb {
   private static final Logger b = LogUtils.getLogger();
   private static final int d = 200;
   private static final int e = 2;
   private static final int f = 6;
   static final xo a = xo.c("mco.configure.world.subscription.tab");
   private static final xo g = xo.c("mco.configure.world.subscription.start");
   private static final xo h = xo.c("mco.configure.world.subscription.timeleft");
   private static final xo i = xo.c("mco.configure.world.subscription.recurring.daysleft");
   private static final xo j = xo.c("mco.configure.world.subscription.expired").a(o.h);
   private static final xo k = xo.c("mco.configure.world.subscription.less_than_a_day").a(o.h);
   private static final xo l = xo.c("mco.configure.world.subscription.unknown");
   private static final xo m = xo.c("mco.configure.world.subscription.recurring.info");
   private final fsc n;
   private final fue o;
   private final fxo p;
   private final fxz q;
   private final fyx r;
   private final fyx s;
   private final fyx t;
   private fpx u;
   private xo v = l;
   private xo w = l;
   @Nullable
   private fqo.a x;

   fsi(fsc $$0, fue $$1, fpx $$2) {
      super(a);
      this.n = $$0;
      this.o = $$1;
      this.u = $$2;
      gbj.b $$3 = this.c.b(6).d(1);
      fwz $$4 = $$0.B();
      $$3.a(new fyx(200, 9, g, $$4).c());
      this.r = $$3.a(new fyx(200, 9, this.w, $$4).c());
      $$3.a(gbp.b(2));
      this.s = $$3.a(new fyx(200, 9, h, $$4).c());
      this.t = $$3.a(new fyx(200, 9, this.v, $$4).c());
      $$3.a(gbp.b(2));
      $$3.a(fxo.a(xo.c("mco.configure.world.subscription.extend"), $$3x -> gdq.a($$0, bav.a($$2.c, $$1.Y().b()))).a(0, 0, 200, 20).a());
      $$3.a(gbp.b(2));
      this.p = $$3.a(
         fxo.a(xo.c("mco.configure.world.delete.button"), $$2x -> $$1.a(frs.b($$0, xo.c("mco.configure.world.delete.question.line1"), $$0xx -> this.c())))
            .a(0, 0, 200, 20)
            .a()
      );
      $$3.a(gbp.b(2));
      this.q = $$3.a(new fxz(200, xo.i(), $$4, true, true, 4), gbn.i().b());
      this.q.d(200);
      this.q.b(false);
      this.a($$2);
   }

   private void c() {
      fsu.a($$0 -> $$0.j(this.u.b), fsu.a(this.n::a, "Couldn't delete world")).thenRunAsync(() -> this.o.a(this.n.j()), this.o);
      this.o.a(this.n);
   }

   private void a(long $$0) {
      foq $$1 = foq.a();

      try {
         fqo $$2 = $$1.h($$0);
         this.v = this.a($$2.b);
         this.w = b($$2.a);
         this.x = $$2.c;
      } catch (fqx var5) {
         b.error("Couldn't get subscription", var5);
         this.o.a(this.n.a(var5));
      }
   }

   private static xo b(long $$0) {
      Calendar $$1 = new GregorianCalendar(TimeZone.getDefault());
      $$1.setTimeInMillis($$0);
      return xo.b(DateFormat.getDateTimeInstance().format($$1.getTime())).a(o.h);
   }

   private xo a(int $$0) {
      if ($$0 < 0 && this.u.k) {
         return j;
      } else if ($$0 <= 1) {
         return k;
      } else {
         int $$1 = $$0 / 30;
         int $$2 = $$0 % 30;
         boolean $$3 = $$1 > 0;
         boolean $$4 = $$2 > 0;
         if ($$3 && $$4) {
            return xo.a("mco.configure.world.subscription.remaining.months.days", $$1, $$2).a(o.h);
         } else if ($$3) {
            return xo.a("mco.configure.world.subscription.remaining.months", $$1).a(o.h);
         } else {
            return $$4 ? xo.a("mco.configure.world.subscription.remaining.days", $$2).a(o.h) : xo.i();
         }
      }
   }

   @Override
   public void a(fpx $$0) {
      this.u = $$0;
      this.a($$0.b);
      this.r.b(this.w);
      if (this.x == fqo.a.a) {
         this.s.b(h);
      } else if (this.x == fqo.a.b) {
         this.s.b(i);
      }

      this.t.b(this.v);
      boolean $$1 = fol.b() && $$0.v != null;
      this.p.j = $$0.k;
      if ($$1) {
         this.q.b(xo.a("mco.snapshot.subscription.info", $$0.v));
      } else {
         this.q.b(m);
      }

      this.c.a();
   }

   @Override
   public xo aS_() {
      return xn.b(a, g, this.w, h, this.v);
   }
}
