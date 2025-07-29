import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ede {
   private static final ede.a a = ede.a.a("trial_chamber/breeze");
   private static final ede.a b = ede.a.a("trial_chamber/melee/husk");
   private static final ede.a c = ede.a.a("trial_chamber/melee/spider");
   private static final ede.a d = ede.a.a("trial_chamber/melee/zombie");
   private static final ede.a e = ede.a.a("trial_chamber/ranged/poison_skeleton");
   private static final ede.a f = ede.a.a("trial_chamber/ranged/skeleton");
   private static final ede.a g = ede.a.a("trial_chamber/ranged/stray");
   private static final ede.a h = ede.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final ede.a i = ede.a.a("trial_chamber/slow_ranged/skeleton");
   private static final ede.a j = ede.a.a("trial_chamber/slow_ranged/stray");
   private static final ede.a k = ede.a.a("trial_chamber/small_melee/baby_zombie");
   private static final ede.a l = ede.a.a("trial_chamber/small_melee/cave_spider");
   private static final ede.a m = ede.a.a("trial_chamber/small_melee/silverfish");
   private static final ede.a n = ede.a.a("trial_chamber/small_melee/slime");

   public static void a(qq<edd> $$0) {
      a(
         $$0,
         a,
         edd.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bvt.a(a(bzv.s))).a(),
         edd.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bvt.a(a(bzv.s))).b(bvt.<amd<fdo>>b().a(fdf.aN, 3).a(fdf.aO, 7).a()).a()
      );
      a($$0, b, c().a(bvt.a(a(bzv.ao))).a(), c().a(bvt.a(a(bzv.ao, fdf.ak))).b(bvt.<amd<fdo>>b().a(fdf.aN, 3).a(fdf.aO, 7).a()).a());
      a($$0, c, c().a(bvt.a(a(bzv.bq))).a(), a().a(bvt.a(a(bzv.bq))).b(bvt.<amd<fdo>>b().a(fdf.aN, 3).a(fdf.aO, 7).a()).a());
      a($$0, d, c().a(bvt.a(a(bzv.bQ))).a(), c().b(bvt.<amd<fdo>>b().a(fdf.aN, 3).a(fdf.aO, 7).a()).a(bvt.a(a(bzv.bQ, fdf.ak))).a());
      a($$0, e, c().a(bvt.a(a(bzv.r))).a(), c().b(bvt.<amd<fdo>>b().a(fdf.aN, 3).a(fdf.aO, 7).a()).a(bvt.a(a(bzv.r, fdf.aj))).a());
      a($$0, f, c().a(bvt.a(a(bzv.bh))).a(), c().b(bvt.<amd<fdo>>b().a(fdf.aN, 3).a(fdf.aO, 7).a()).a(bvt.a(a(bzv.bh, fdf.aj))).a());
      a($$0, g, c().a(bvt.a(a(bzv.bu))).a(), c().b(bvt.<amd<fdo>>b().a(fdf.aN, 3).a(fdf.aO, 7).a()).a(bvt.a(a(bzv.bu, fdf.aj))).a());
      a($$0, h, b().a(bvt.a(a(bzv.r))).a(), b().b(bvt.<amd<fdo>>b().a(fdf.aN, 3).a(fdf.aO, 7).a()).a(bvt.a(a(bzv.r, fdf.aj))).a());
      a($$0, i, b().a(bvt.a(a(bzv.bh))).a(), b().b(bvt.<amd<fdo>>b().a(fdf.aN, 3).a(fdf.aO, 7).a()).a(bvt.a(a(bzv.bh, fdf.aj))).a());
      a($$0, j, b().a(bvt.a(a(bzv.bu))).a(), b().b(bvt.<amd<fdo>>b().a(fdf.aN, 3).a(fdf.aO, 7).a()).a(bvt.a(a(bzv.bu, fdf.aj))).a());
      a(
         $$0,
         k,
         edd.b().d(0.5F).b(20).a(bvt.a(a(bzv.bQ, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         edd.b().d(0.5F).b(20).b(bvt.<amd<fdo>>b().a(fdf.aN, 3).a(fdf.aO, 7).a()).a(bvt.a(a(bzv.bQ, $$0x -> $$0x.a("IsBaby", true), fdf.ak))).a()
      );
      a($$0, l, c().a(bvt.a(a(bzv.w))).a(), a().b(bvt.<amd<fdo>>b().a(fdf.aN, 3).a(fdf.aO, 7).a()).a(bvt.a(a(bzv.w))).a());
      a($$0, m, c().a(bvt.a(a(bzv.bg))).a(), a().b(bvt.<amd<fdo>>b().a(fdf.aN, 3).a(fdf.aO, 7).a()).a(bvt.a(a(bzv.bg))).a());
      a(
         $$0,
         n,
         c().a(bvt.<dno>b().a(a(bzv.bj, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bzv.bj, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bvt.<amd<fdo>>b().a(fdf.aN, 3).a(fdf.aO, 7).a())
            .a(bvt.<dno>b().a(a(bzv.bj, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bzv.bj, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bzm> dno a(bzv<T> $$0) {
      return a($$0, $$0x -> {}, null);
   }

   private static <T extends bzm> dno a(bzv<T> $$0, Consumer<ui> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bzm> dno a(bzv<T> $$0, amd<fdo> $$1) {
      return a($$0, $$0x -> {}, $$1);
   }

   private static <T extends bzm> dno a(bzv<T> $$0, Consumer<ui> $$1, @Nullable amd<fdo> $$2) {
      ui $$3 = new ui();
      $$3.a("id", mm.f.b($$0).toString());
      $$1.accept($$3);
      Optional<bzy> $$4 = Optional.ofNullable($$2).map($$0x -> new bzy($$0x, 0.0F));
      return new dno($$3, Optional.empty(), $$4);
   }

   private static void a(qq<edd> $$0, ede.a $$1, edd $$2, edd $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static amd<edd> a(String $$0) {
      return amd.a(mn.bn, ame.b($$0));
   }

   private static edd.a a() {
      return edd.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static edd.a b() {
      return edd.b().b(4.0F).d(2.0F).b(160);
   }

   private static edd.a c() {
      return edd.b().b(3.0F).d(0.5F).b(20);
   }

   record a(amd<edd> a, amd<edd> b) {

      public static ede.a a(String $$0) {
         return new ede.a(ede.a($$0 + "/normal"), ede.a($$0 + "/ominous"));
      }
   }
}
