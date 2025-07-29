import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class tr {
   public static final int a = 10;
   public static final String b = "Minecraft.Server/src/test/convertables/data";
   public static Path c = Paths.get("Minecraft.Server/src/test/convertables/data");

   public static dwu a(int $$0) {
      switch ($$0) {
         case 0:
            return dwu.a;
         case 1:
            return dwu.b;
         case 2:
            return dwu.c;
         case 3:
            return dwu.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dwu $$0) {
      switch ($$0) {
         case a:
            return 0;
         case b:
            return 1;
         case c:
            return 2;
         case d:
            return 3;
         default:
            throw new IllegalArgumentException("Unknown rotation value, don't know how many steps it represents: " + $$0);
      }
   }

   public static ecu a(ame $$0, jb $$1, kg $$2, dwu $$3, aub $$4) {
      euq $$5 = b(ecu.a($$1), $$2, $$3);
      a($$5, $$4);
      $$4.c($$1, dqb.pK.m());
      ecu $$6 = (ecu)$$4.c_($$1);
      amd<ta> $$7 = amd.a(mn.bm, $$0);
      $$6.a(new ecu.a(Optional.of($$7), $$2, $$3, false, ecu.b.a, Optional.empty()));
      return $$6;
   }

   public static void a(euq $$0, aub $$1) {
      int $$2 = $$0.i() - 1;
      euq $$3 = new euq($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      jb.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.o().a($$3);
      $$1.a($$3);
      fin $$4 = fin.a($$3);
      List<bzm> $$5 = $$1.a(bzm.class, $$4, $$0x -> !($$0x instanceof cut));
      $$5.forEach(bzm::at);
   }

   public static jb a(jb $$0, kg $$1, dwu $$2) {
      jb $$3 = $$0.a($$1).b(-1, -1, -1);
      return eza.a($$3, dvd.a, $$2, $$0);
   }

   public static euq b(jb $$0, kg $$1, dwu $$2) {
      jb $$3 = a($$0, $$1, $$2);
      euq $$4 = euq.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<jb> a(jb $$0, int $$1, aub $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<jb> b(jb $$0, int $$1, aub $$2) {
      Comparator<jb> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<jb> c(jb $$0, int $$1, aub $$2) {
      return $$2.B().a($$0x -> $$0x.a(clt.u), $$0x -> true, $$0, $$1, clp.b.c).map(jb::j);
   }

   public static Stream<jb> a(jb $$0, bzm $$1, aub $$2) {
      int $$3 = 200;
      fis $$4 = $$1.bI();
      fis $$5 = $$4.e($$1.bW().c(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, ebb.U))
         .flatMap(Optional::stream)
         .filter($$2x -> $$2x.f().b($$4, $$5).isPresent())
         .map(eaz::aA_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, jb $$1, aub $$2) {
      eeb $$3;
      if ($$1.v() < $$0) {
         $$3 = dqb.b.m();
      } else {
         $$3 = dqb.a.m();
      }

      gf $$5 = new gf($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 818);
      $$2.a($$1, $$3.b());
   }

   private static boolean a(jb $$0, jb $$1, aub $$2) {
      return $$2.c_($$0) instanceof ecu $$3 ? $$3.d().b($$1) : false;
   }
}
