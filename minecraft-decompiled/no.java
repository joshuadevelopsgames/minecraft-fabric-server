import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class no implements nr {
   protected final jn.a a;
   protected final Set<dcr> b;
   protected final cyd c;
   protected final Map<amd<fdo>, fdo.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected fgs.a a() {
      return fgz.a(cn.a.a().a(bo.a.a().a(la.b, lb.a(List.of(new bu(this.a.e(mn.aW).b(djn.v), cx.d.b(1))))).b()));
   }

   protected fgs.a b() {
      return this.a().invert();
   }

   protected fgs.a c() {
      return fgz.a(cn.a.a().a(this.a.e(mn.N), dcz.tu));
   }

   private fgs.a f() {
      return this.c().or(this.a());
   }

   private fgs.a g() {
      return this.f().invert();
   }

   protected no(Set<dcr> $$0, cyd $$1, jn.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected no(Set<dcr> $$0, cyd $$1, Map<amd<fdo>, fdo.a> $$2, jn.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends fet<T>> T a(dmt $$0, fet<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(feh.c()) : $$1.c();
   }

   protected <T extends fgk<T>> T a(dmt $$0, fgk<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(fgo.c()) : $$1.d();
   }

   public fdo.a a(dmt $$0) {
      return fdo.b().a(this.a($$0, fdn.a().a(fhl.a(1.0F)).a(fdw.a($$0))));
   }

   private static fdo.a a(dpz $$0, fgs.a $$1, fdz.a<?> $$2) {
      return fdo.b().a(fdn.a().a(fhl.a(1.0F)).a(fdw.a($$0).a($$1).a($$2)));
   }

   protected fdo.a a(dpz $$0, fdz.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected fdo.a b(dpz $$0, fdz.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected fdo.a c(dpz $$0, fdz.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected fdo.a a(dpz $$0, dmt $$1) {
      return this.a($$0, (fdz.a<?>)this.a((dmt)$$0, fdw.a($$1)));
   }

   protected fdo.a a(dmt $$0, fho $$1) {
      return fdo.b().a(fdn.a().a(fhl.a(1.0F)).a((fdz.a<?>)this.a($$0, fdw.a($$0).a(ffo.a($$1)))));
   }

   protected fdo.a a(dpz $$0, dmt $$1, fho $$2) {
      return this.a($$0, (fdz.a<?>)this.a((dmt)$$0, fdw.a($$1).a(ffo.a($$2))));
   }

   private fdo.a d(dmt $$0) {
      return fdo.b().a(fdn.a().a(this.a()).a(fhl.a(1.0F)).a(fdw.a($$0)));
   }

   private fdo.a e(dmt $$0) {
      return fdo.b().a(this.a(dqb.gq, fdn.a().a(fhl.a(1.0F)).a(fdw.a(dqb.gq)))).a(this.a($$0, fdn.a().a(fhl.a(1.0F)).a(fdw.a($$0))));
   }

   protected fdo.a a(dpz $$0) {
      return fdo.b().a(fdn.a().a(fhl.a(1.0F)).a((fdz.a<?>)this.a((dmt)$$0, fdw.a($$0).a(ffo.a(fhl.a(2.0F)).a(fgr.a($$0).a(ds.a.a().a(dxn.b, efj.c)))))));
   }

   protected <T extends Comparable<T> & bda> fdo.a a(dpz $$0, efe<T> $$1, T $$2) {
      return fdo.b().a(this.a($$0, fdn.a().a(fhl.a(1.0F)).a(fdw.a($$0).a(fgr.a($$0).a(ds.a.a().a($$1, $$2))))));
   }

   protected fdo.a b(dpz $$0) {
      return fdo.b().a(this.a($$0, fdn.a().a(fhl.a(1.0F)).a(fdw.a($$0).a(fej.a(fej.b.a).a(kq.g)))));
   }

   protected fdo.a c(dpz $$0) {
      return fdo.b().a(this.a($$0, fdn.a().a(fhl.a(1.0F)).a(fdw.a($$0).a(fej.a(fej.b.a).a(kq.g).a(kq.ap).a(kq.as).a(kq.at)))));
   }

   protected fdo.a d(dpz $$0) {
      jn.b<dji> $$1 = this.a.e(mn.aW);
      return this.a($$0, (fdz.a<?>)this.a((dmt)$$0, fdw.a(dcz.pL).a(ffo.a(fhs.a(2.0F, 5.0F))).a(feg.a($$1.b(djn.x)))));
   }

   protected fdo.a e(dpz $$0) {
      jn.b<dji> $$1 = this.a.e(mn.aW);
      return this.a($$0, (fdz.a<?>)this.a((dmt)$$0, fdw.a(dcz.pG).a(ffo.a(fhs.a(4.0F, 9.0F))).a(feg.a($$1.b(djn.x)))));
   }

   protected fdo.a f(dpz $$0) {
      jn.b<dji> $$1 = this.a.e(mn.aW);
      return this.a($$0, (fdz.a<?>)this.a((dmt)$$0, fdw.a(dcz.mm).a(ffo.a(fhs.a(4.0F, 5.0F))).a(feg.b($$1.b(djn.x)))));
   }

   protected fdo.a g(dpz $$0) {
      return fdo.b().a(this.a($$0, fdn.a().a(fhl.a(1.0F)).a(fdw.a($$0).a(fej.a(fej.b.a).a(kq.g).a(kq.h).a(kq.q).a(kq.am).a(kq.k)))));
   }

   protected fdo.a h(dpz $$0) {
      return fdo.b().a(fdn.a().a(this.a()).a(fhl.a(1.0F)).a(fdw.a($$0).a(fej.a(fej.b.a).a(kq.ar)).a(fei.a($$0).a(dpt.c))));
   }

   protected fdo.a i(dpz $$0) {
      return fdo.b().a(fdn.a().a(fhl.a(1.0F)).a(fdw.a($$0).a(this.a()).a(fej.a(fej.b.a).a(kq.ar)).a(fei.a($$0).a(dpt.c)).a(fdw.a($$0))));
   }

   protected fdo.a j(dpz $$0) {
      return fdo.b().a(fdn.a().a(fdw.a(dcz.yb)).a(fgr.a($$0).a(ds.a.a().a(dqx.A_, true))));
   }

   protected fdo.a a(dpz $$0, dcr $$1) {
      jn.b<dji> $$2 = this.a.e(mn.aW);
      return this.a($$0, (fdz.a<?>)this.a((dmt)$$0, fdw.a($$1).a(feg.a($$2.b(djn.x)))));
   }

   protected fdo.a b(dpz $$0, dmt $$1) {
      return this.a($$0, (fdz.a<?>)this.a((dmt)$$0, fdw.a($$1).a(ffo.a(fhs.a(-6.0F, 2.0F))).a(feu.a(fdi.b(0)))));
   }

   protected fdo.a k(dpz $$0) {
      jn.b<dji> $$1 = this.a.e(mn.aW);
      return this.b($$0, (fdz.a<?>)this.a((dmt)$$0, fdw.a(dcz.qA).a(fgx.a(0.125F)).a(feg.a($$1.b(djn.x), 2))));
   }

   public fdo.a b(dpz $$0, dcr $$1) {
      return fdo.b()
         .a(
            this.a(
               $$0,
               fdn.a()
                  .a(fhl.a(1.0F))
                  .a(fdw.a($$1).a(dyg.c.a(), $$1x -> ffo.a(fhk.a(3, ($$1x + 1) / 15.0F)).a(fgr.a($$0).a(ds.a.a().a(dyg.c, $$1x.intValue())))))
            )
         );
   }

   public fdo.a c(dpz $$0, dcr $$1) {
      return fdo.b().a(this.a($$0, fdn.a().a(fhl.a(1.0F)).a(fdw.a($$1).a(ffo.a(fhk.a(3, 0.53333336F))))));
   }

   protected fdo.a b(dmt $$0) {
      return fdo.b().a(fdn.a().a(fhl.a(1.0F)).a(this.c()).a(fdw.a($$0)));
   }

   protected fdo.a c(dmt $$0) {
      return fdo.b().a(fdn.a().a(fhl.a(1.0F)).a(this.f()).a(fdw.a($$0)));
   }

   protected fdo.a a(dpz $$0, fgs.a $$1) {
      return fdo.b()
         .a(
            fdn.a()
               .a(
                  (fdz.a<?>)this.a(
                     (dmt)$$0,
                     fdw.a($$0)
                        .a($$1)
                        .a(jh.values(), $$1x -> ffo.a(fhl.a(1.0F), true).a(fgr.a($$0).a(ds.a.a().a(dvg.b($$1x), true))))
                        .a(ffo.a(fhl.a(-1.0F), true))
                  )
               )
         );
   }

   protected fdo.a l(dpz $$0) {
      return fdo.b()
         .a(
            fdn.a()
               .a(
                  (fdz.a<?>)this.a(
                     (dmt)$$0,
                     fdw.a($$0).a(jh.values(), $$1 -> ffo.a(fhl.a(1.0F), true).a(fgr.a($$0).a(ds.a.a().a(dvg.b($$1), true)))).a(ffo.a(fhl.a(-1.0F), true))
                  )
               )
         );
   }

   protected fdo.a m(dpz $$0) {
      return fdo.b().a(fdn.a().a((fdz.a<?>)this.a($$0, fdw.a($$0).a(fgr.a($$0).a(ds.a.a().a(dve.b, true))))));
   }

   protected fdo.a a(dpz $$0, dpz $$1, float... $$2) {
      jn.b<dji> $$3 = this.a.e(mn.aW);
      return this.c($$0, ((feb.a)this.a((dmt)$$0, fdw.a($$1))).a(fgh.a($$3.b(djn.x), $$2)))
         .a(fdn.a().a(fhl.a(1.0F)).a(this.g()).a(((feb.a)this.a((dmt)$$0, fdw.a(dcz.qv).a(ffo.a(fhs.a(1.0F, 2.0F))))).a(fgh.a($$3.b(djn.x), f))));
   }

   protected fdo.a b(dpz $$0, dpz $$1, float... $$2) {
      jn.b<dji> $$3 = this.a.e(mn.aW);
      return this.a($$0, $$1, $$2)
         .a(
            fdn.a()
               .a(fhl.a(1.0F))
               .a(this.g())
               .a(((feb.a)this.a((dmt)$$0, fdw.a(dcz.pz))).a(fgh.a($$3.b(djn.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected fdo.a n(dpz $$0) {
      jn.b<dji> $$1 = this.a.e(mn.aW);
      return this.c($$0, ((feb.a)this.a((dmt)dqb.aS, fdw.a(dcz.qv).a(ffo.a(fhs.a(1.0F, 2.0F))))).a(fgh.a($$1.b(djn.x), f)));
   }

   protected fdo.a a(dpz $$0, dcr $$1, dcr $$2, fgs.a $$3) {
      jn.b<dji> $$4 = this.a.e(mn.aW);
      return this.a((dmt)$$0, fdo.b().a(fdn.a().a(fdw.a($$1).a($$3).a(fdw.a($$2)))).a(fdn.a().a($$3).a(fdw.a($$2).a(feg.a($$4.b(djn.x), 0.5714286F, 3)))));
   }

   protected fdo.a o(dpz $$0) {
      return fdo.b().a(fdn.a().a(this.c()).a(fdw.a($$0).a(ffo.a(fhl.a(2.0F)))));
   }

   protected fdo.a a(dpz $$0, dpz $$1) {
      jn.b<dpz> $$2 = this.a.e(mn.i);
      fdz.a<?> $$3 = fdw.a($$1).a(ffo.a(fhl.a(2.0F))).a(this.c()).a(((feb.a)this.a((dmt)$$0, fdw.a(dcz.qA))).a(fgx.a(0.125F)));
      return fdo.b()
         .a(fdn.a().a($$3).a(fgr.a($$0).a(ds.a.a().a(dsi.b, eex.b))).a(fgq.a(cv.a.a().a(az.a.a().a($$2, $$0).a(ds.a.a().a(dsi.b, eex.a))), new jb(0, 1, 0))))
         .a(fdn.a().a($$3).a(fgr.a($$0).a(ds.a.a().a(dsi.b, eex.a))).a(fgq.a(cv.a.a().a(az.a.a().a($$2, $$0).a(ds.a.a().a(dsi.b, eex.b))), new jb(0, -1, 0))));
   }

   protected fdo.a p(dpz $$0) {
      return fdo.b()
         .a(
            fdn.a()
               .a(fhl.a(1.0F))
               .a((fdz.a<?>)this.a($$0, fdw.a($$0).a(List.of(2, 3, 4), $$1 -> ffo.a(fhl.a($$1.intValue())).a(fgr.a($$0).a(ds.a.a().a(dqq.f, $$1.intValue()))))))
         );
   }

   public fdo.a q(dpz $$0) {
      return $$0 instanceof dxh $$1
         ? fdo.b()
            .a(
               fdn.a()
                  .a(fhl.a(1.0F))
                  .a(
                     (fdz.a<?>)this.a(
                        $$0,
                        fdw.a($$0)
                           .a(
                              IntStream.rangeClosed(1, 4).boxed().toList(),
                              $$2 -> ffo.a(fhl.a($$2.intValue())).a(fgr.a($$0).a(ds.a.a().a($$1.c(), $$2.intValue())))
                           )
                     )
                  )
            )
         : d();
   }

   protected static fdo.a r(dpz $$0) {
      return fdo.b().a(fdn.a().a(fhl.a(1.0F)).a(fdw.a($$0)));
   }

   public static fdo.a d() {
      return fdo.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<amd<fdo>, fdo.a> $$0) {
      this.e();
      Set<amd<fdo>> $$1 = new HashSet<>();

      for (dpz $$2 : mm.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((amd<fdo>)$$3)) {
                  fdo.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), mm.e.b($$2)));
                  }

                  $$0.accept((amd<fdo>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dpz $$0, dpz $$1) {
      jn.b<dji> $$2 = this.a.e(mn.aW);
      fdo.a $$3 = this.c($$0, fdw.a($$0).a(fgh.a($$2.b(djn.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected fdo.a s(dpz $$0) {
      return this.a($$0, dsg.c, eex.b);
   }

   protected void t(dpz $$0) {
      this.a($$0, $$0x -> this.e((dmt)((dth)$$0x).b()));
   }

   protected void c(dpz $$0, dpz $$1) {
      this.a($$0, this.d((dmt)$$1));
   }

   protected void c(dpz $$0, dmt $$1) {
      this.a($$0, this.a($$1));
   }

   protected void u(dpz $$0) {
      this.c($$0, $$0);
   }

   protected void v(dpz $$0) {
      this.c($$0, (dmt)$$0);
   }

   protected void a(dpz $$0, Function<dpz, fdo.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dpz $$0, fdo.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
