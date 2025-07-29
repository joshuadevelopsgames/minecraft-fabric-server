import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class eko {
   final ekn a;
   private final jm<ezo.a> b;
   private final ekg c;
   private final dog.f d;
   private final eks e;
   private final ekn f;
   private final ekn g;
   private final Map<amd<ezo.a>, ezo> h;
   private final Map<ame, ekn> i;

   public static eko a(jm.a $$0, amd<ekf> $$1, long $$2) {
      return a($$0.b(mn.bc).b($$1).a(), $$0.b(mn.bd), $$2);
   }

   public static eko a(ekf $$0, jm<ezo.a> $$1, long $$2) {
      return new eko($$0, $$1, $$2);
   }

   private eko(ekf $$0, jm<ezo.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(ame.b("aquifer")).e();
      this.g = this.a.a(ame.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new eks(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements ejt.f {
         private final Map<ejt, ejt> d = new HashMap<>();

         private bck a(long $$0) {
            return new ekb($$2 + $$0);
         }

         @Override
         public ejt.c a(ejt.c $$0) {
            jl<ezo.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(ekj.a)) {
                  ezo $$2 = ezo.a(this.a(0L), new ezo.a(-7, 1.0, 1.0));
                  return new ejt.c($$1, $$2);
               }

               if ($$1.a(ekj.b)) {
                  ezo $$3 = ezo.a(this.a(1L), new ezo.a(-7, 1.0, 1.0));
                  return new ejt.c($$1, $$3);
               }

               if ($$1.a(ekj.j)) {
                  ezo $$4 = ezo.b(eko.this.a.a(ekj.j.a()), new ezo.a(0, 0.0));
                  return new ejt.c($$1, $$4);
               }
            }

            ezo $$5 = eko.this.a($$1.e().orElseThrow());
            return new ejt.c($$1, $$5);
         }

         private ejt a(ejt $$0) {
            if ($$0 instanceof ezl $$1) {
               bck $$2 = $$3 ? this.a(0L) : eko.this.a.a(ame.b("terrain"));
               return $$1.a($$2);
            } else {
               return (ejt)($$0 instanceof eju.i ? new eju.i($$2) : $$0);
            }
         }

         @Override
         public ejt apply(ejt $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      ejt.f $$4 = new ejt.f() {
         private final Map<ejt, ejt> a = new HashMap<>();

         private ejt a(ejt $$0) {
            if ($$0 instanceof eju.j $$1x) {
               return $$1x.j().a();
            } else {
               return $$0 instanceof eju.l $$2x ? $$2x.k() : $$0;
            }
         }

         @Override
         public ejt apply(ejt $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dog.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public ezo a(amd<ezo.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> ekj.a(this.b, this.a, $$0));
   }

   public ekn a(ame $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public ekg a() {
      return this.c;
   }

   public dog.f b() {
      return this.d;
   }

   public eks c() {
      return this.e;
   }

   public ekn d() {
      return this.f;
   }

   public ekn e() {
      return this.g;
   }
}
