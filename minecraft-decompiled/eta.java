import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eta {
   public static final amd<esz> a = a("classic_flat");
   public static final amd<esz> b = a("tunnelers_dream");
   public static final amd<esz> c = a("water_world");
   public static final amd<esz> d = a("overworld");
   public static final amd<esz> e = a("snowy_kingdom");
   public static final amd<esz> f = a("bottomless_pit");
   public static final amd<esz> g = a("desert");
   public static final amd<esz> h = a("redstone_ready");
   public static final amd<esz> i = a("the_void");

   public static void a(qq<esz> $$0) {
      new eta.a($$0).a();
   }

   private static amd<esz> a(String $$0) {
      return amd.a(mn.aX, ame.b($$0));
   }

   static class a {
      private final qq<esz> a;

      a(qq<esz> $$0) {
         this.a = $$0;
      }

      private void a(amd<esz> $$0, dmt $$1, amd<dnx> $$2, Set<amd<eve>> $$3, boolean $$4, boolean $$5, esy... $$6) {
         jm<eve> $$7 = this.a.a(mn.bi);
         jm<euc> $$8 = this.a.a(mn.bg);
         jm<dnx> $$9 = this.a.a(mn.aK);
         jp.a<eve> $$10 = jp.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         etb $$11 = new etb(Optional.of($$10), $$9.b($$2), etb.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new esz($$1.h().e(), $$11));
      }

      public void a() {
         this.a(eta.a, dqb.i, doe.b, ImmutableSet.of(eur.a), false, false, new esy(1, dqb.i), new esy(2, dqb.j), new esy(1, dqb.I));
         this.a(eta.b, dqb.b, doe.u, ImmutableSet.of(eur.j, eur.r), true, false, new esy(1, dqb.i), new esy(5, dqb.j), new esy(230, dqb.b), new esy(1, dqb.I));
         this.a(
            eta.c,
            dcz.rG,
            doe.U,
            ImmutableSet.of(eur.m, eur.l, eur.g),
            false,
            false,
            new esy(90, dqb.J),
            new esy(5, dqb.O),
            new esy(5, dqb.j),
            new esy(5, dqb.b),
            new esy(64, dqb.tu),
            new esy(1, dqb.I)
         );
         this.a(
            eta.d,
            dqb.bA,
            doe.b,
            ImmutableSet.of(eur.a, eur.j, eur.f, eur.k, eur.r),
            true,
            true,
            new esy(1, dqb.i),
            new esy(3, dqb.j),
            new esy(59, dqb.b),
            new esy(1, dqb.I)
         );
         this.a(
            eta.e,
            dqb.ed,
            doe.d,
            ImmutableSet.of(eur.a, eur.c),
            false,
            false,
            new esy(1, dqb.ed),
            new esy(1, dqb.i),
            new esy(3, dqb.j),
            new esy(59, dqb.b),
            new esy(1, dqb.I)
         );
         this.a(eta.f, dcz.qy, doe.b, ImmutableSet.of(eur.a), false, false, new esy(1, dqb.i), new esy(3, dqb.j), new esy(2, dqb.m));
         this.a(
            eta.g,
            dqb.L,
            doe.f,
            ImmutableSet.of(eur.a, eur.b, eur.j, eur.r),
            true,
            false,
            new esy(8, dqb.L),
            new esy(52, dqb.bc),
            new esy(3, dqb.b),
            new esy(1, dqb.I)
         );
         this.a(eta.h, dcz.mm, doe.f, ImmutableSet.of(), false, false, new esy(116, dqb.bc), new esy(3, dqb.b), new esy(1, dqb.I));
         this.a(eta.i, dqb.iy, doe.a, ImmutableSet.of(), true, false, new esy(1, dqb.a));
      }
   }
}
