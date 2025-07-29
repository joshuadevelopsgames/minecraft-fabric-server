import com.mojang.serialization.MapCodec;
import java.util.Map;

public class duc extends dpz {
   public static final MapCodec<duc> a = b(duc::new);
   public static final ees b = dvu.b;
   public static final ees c = dvu.c;
   public static final ees d = dvu.d;
   public static final ees e = dvu.e;
   public static final ees f = dvu.f;
   public static final ees g = dvu.g;
   private static final Map<jh, ees> h = dvu.h;

   @Override
   public MapCodec<duc> a() {
      return a;
   }

   public duc(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, true).b(c, true).b(d, true).b(e, true).b(f, true).b(g, true));
   }

   @Override
   public eeb a(dgo $$0) {
      dly $$1 = $$0.q();
      jb $$2 = $$0.a();
      return this.m()
         .b(g, !$$1.a_($$2.e()).a(this))
         .b(f, !$$1.a_($$2.d()).a(this))
         .b(b, !$$1.a_($$2.f()).a(this))
         .b(c, !$$1.a_($$2.i()).a(this))
         .b(d, !$$1.a_($$2.g()).a(this))
         .b(e, !$$1.a_($$2.h()).a(this));
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$6.a(this) ? $$0.b(h.get($$4), false) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(h.get($$1.a(jh.c)), $$0.c(b))
         .b(h.get($$1.a(jh.d)), $$0.c(d))
         .b(h.get($$1.a(jh.f)), $$0.c(c))
         .b(h.get($$1.a(jh.e)), $$0.c(e))
         .b(h.get($$1.a(jh.b)), $$0.c(f))
         .b(h.get($$1.a(jh.a)), $$0.c(g));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.b(h.get($$1.b(jh.c)), $$0.c(b))
         .b(h.get($$1.b(jh.d)), $$0.c(d))
         .b(h.get($$1.b(jh.f)), $$0.c(c))
         .b(h.get($$1.b(jh.e)), $$0.c(e))
         .b(h.get($$1.b(jh.b)), $$0.c(f))
         .b(h.get($$1.b(jh.a)), $$0.c(g));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
