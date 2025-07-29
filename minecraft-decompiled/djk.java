import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableObject;

public class djk {
   public static int a(jl<dji> $$0, dcv $$1) {
      djo $$2 = $$1.a(kq.l, djo.a);
      return $$2.a($$0);
   }

   public static djo a(dcv $$0, Consumer<djo.a> $$1) {
      kp<djo> $$2 = d($$0);
      djo $$3 = $$0.a($$2);
      if ($$3 == null) {
         return djo.a;
      } else {
         djo.a $$4 = new djo.a($$3);
         $$1.accept($$4);
         djo $$5 = $$4.b();
         $$0.b($$2, $$5);
         return $$5;
      }
   }

   public static boolean a(dcv $$0) {
      return $$0.c(d($$0));
   }

   public static void a(dcv $$0, djo $$1) {
      $$0.b(d($$0), $$1);
   }

   public static djo b(dcv $$0) {
      return $$0.a(d($$0), djo.a);
   }

   private static kp<djo> d(dcv $$0) {
      return $$0.a(dcz.vY) ? kq.J : kq.l;
   }

   public static boolean c(dcv $$0) {
      return !$$0.a(kq.l, djo.a).d() || !$$0.a(kq.J, djo.a).d();
   }

   public static int a(aub $$0, dcv $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$1, ($$3x, $$4) -> ((dji)$$3x.a()).a($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(aub $$0, dcv $$1, dcv $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$3x, $$4x) -> ((dji)$$3x.a()).b($$0, $$4x, $$2, $$4));
      return $$4.intValue();
   }

   public static int b(aub $$0, dcv $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$1, ($$3x, $$4) -> ((dji)$$3x.a()).d($$0, $$4, $$1, $$3));
      return $$3.intValue();
   }

   public static int a(aub $$0, @Nullable bzm $$1, bzm $$2, int $$3) {
      if ($$1 instanceof cam $$4) {
         MutableFloat $$5 = new MutableFloat($$3);
         a($$4, ($$3x, $$4x, $$5x) -> ((dji)$$3x.a()).a($$0, $$4x, $$5x.a(), $$2, $$5));
         return $$5.intValue();
      } else {
         return $$3;
      }
   }

   public static dcv a(djl $$0) {
      dcv $$1 = new dcv(dcz.vY);
      $$1.a($$0.b(), $$0.c());
      return $$1;
   }

   private static void a(dcv $$0, djk.b $$1) {
      djo $$2 = $$0.a(kq.l, djo.a);

      for (Entry<jl<dji>> $$3 : $$2.b()) {
         $$1.accept((jl<dji>)$$3.getKey(), $$3.getIntValue());
      }
   }

   private static void a(dcv $$0, bzw $$1, cam $$2, djk.a $$3) {
      if (!$$0.f()) {
         djo $$4 = $$0.a(kq.l);
         if ($$4 != null && !$$4.d()) {
            djh $$5 = new djh($$0, $$1, $$2);

            for (Entry<jl<dji>> $$6 : $$4.b()) {
               jl<dji> $$7 = (jl<dji>)$$6.getKey();
               if ($$7.a().a($$1)) {
                  $$3.accept($$7, $$6.getIntValue(), $$5);
               }
            }
         }
      }
   }

   private static void a(cam $$0, djk.a $$1) {
      for (bzw $$2 : bzw.j) {
         a($$0.a($$2), $$2, $$0, $$1);
      }
   }

   public static boolean a(aub $$0, cam $$1, byb $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      a($$1, ($$4, $$5, $$6) -> $$3.setValue($$3.isTrue() || $$4.a().a($$0, $$5, $$1, $$2)));
      return $$3.isTrue();
   }

   public static float b(aub $$0, cam $$1, byb $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5, $$6) -> $$4.a().a($$0, $$5, $$6.a(), $$1, $$2, $$3));
      return $$3.floatValue();
   }

   public static float a(aub $$0, dcv $$1, bzm $$2, byb $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dji)$$5x.a()).b($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float b(aub $$0, dcv $$1, bzm $$2, byb $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dji)$$5x.a()).c($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float c(aub $$0, dcv $$1, bzm $$2, byb $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dji)$$5x.a()).e($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static float d(aub $$0, dcv $$1, bzm $$2, byb $$3, float $$4) {
      MutableFloat $$5 = new MutableFloat($$4);
      a($$1, ($$5x, $$6) -> ((dji)$$5x.a()).d($$0, $$6, $$1, $$2, $$3, $$5));
      return $$5.floatValue();
   }

   public static void a(aub $$0, bzm $$1, byb $$2) {
      if ($$2.d() instanceof cam $$3) {
         a($$0, $$1, $$2, $$3.ed());
      } else {
         a($$0, $$1, $$2, null);
      }
   }

   public static void a(aub $$0, bzm $$1, byb $$2, @Nullable dcv $$3) {
      a($$0, $$1, $$2, $$3, null);
   }

   public static void a(aub $$0, bzm $$1, byb $$2, @Nullable dcv $$3, @Nullable Consumer<dcr> $$4) {
      if ($$1 instanceof cam $$5) {
         a($$5, ($$3x, $$4x, $$5x) -> ((dji)$$3x.a()).a($$0, $$4x, $$5x, djm.c, $$1, $$2));
      }

      if ($$3 != null) {
         if ($$2.d() instanceof cam $$6) {
            a($$3, bzw.a, $$6, ($$3x, $$4x, $$5) -> ((dji)$$3x.a()).a($$0, $$4x, $$5, djm.a, $$1, $$2));
         } else if ($$4 != null) {
            djh $$7 = new djh($$3, null, null, $$4);
            a($$3, ($$4x, $$5) -> ((dji)$$4x.a()).a($$0, $$5, $$7, djm.a, $$1, $$2));
         }
      }
   }

   public static void a(aub $$0, cam $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, $$1));
   }

   public static void a(aub $$0, dcv $$1, cam $$2, bzw $$3) {
      a($$1, $$3, $$2, ($$2x, $$3x, $$4) -> ((dji)$$2x.a()).a($$0, $$3x, $$4, $$2));
   }

   public static void a(cam $$0) {
      a($$0, ($$1, $$2, $$3) -> $$1.a().a($$2, $$3, $$0));
   }

   public static void a(dcv $$0, cam $$1, bzw $$2) {
      a($$0, $$2, $$1, ($$1x, $$2x, $$3) -> ((dji)$$1x.a()).a($$2x, $$3, $$1));
   }

   public static void b(aub $$0, cam $$1) {
      a($$1, ($$2, $$3, $$4) -> $$2.a().a($$0, $$3, $$4, (bzm)$$1));
   }

   public static int a(jl<dji> $$0, cam $$1) {
      Iterable<dcv> $$2 = $$0.a().a($$1).values();
      int $$3 = 0;

      for (dcv $$4 : $$2) {
         int $$5 = a($$0, $$4);
         if ($$5 > $$3) {
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static int a(aub $$0, dcv $$1, bzm $$2, int $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dji)$$4x.a()).e($$0, $$5, $$1, $$2, $$4));
      return Math.max(0, $$4.intValue());
   }

   public static float a(aub $$0, dcv $$1, bzm $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      a($$1, ($$4x, $$5) -> ((dji)$$4x.a()).f($$0, $$5, $$1, $$2, $$4));
      return Math.max(0.0F, $$4.floatValue());
   }

   public static int a(aub $$0, dcv $$1, dcv $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$3x, $$4) -> ((dji)$$3x.a()).c($$0, $$4, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static void a(aub $$0, dcv $$1, cvo $$2, Consumer<dcr> $$3) {
      cam $$5 = $$2.ah_() instanceof cam $$4 ? $$4 : null;
      djh $$6 = new djh($$1, null, $$5, $$3);
      a($$1, ($$3x, $$4x) -> ((dji)$$3x.a()).b($$0, $$4x, $$6, $$2));
   }

   public static void a(aub $$0, dcv $$1, @Nullable cam $$2, bzm $$3, @Nullable bzw $$4, fis $$5, eeb $$6, Consumer<dcr> $$7) {
      djh $$8 = new djh($$1, $$4, $$2, $$7);
      a($$1, ($$5x, $$6x) -> ((dji)$$5x.a()).a($$0, $$6x, $$8, $$3, $$5, $$6));
   }

   public static int c(aub $$0, dcv $$1, int $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$1, ($$3x, $$4) -> ((dji)$$3x.a()).e($$0, $$4, $$1, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(aub $$0, cam $$1, byb $$2, float $$3) {
      MutableFloat $$4 = new MutableFloat($$3);
      bck $$5 = $$1.ec();
      a($$1, ($$5x, $$6, $$7x) -> {
         fdj $$8 = dji.b($$0, $$6, $$1, $$2);
         ((dji)$$5x.a()).a(djj.m).forEach($$4xx -> {
            if ($$4xx.a() == djm.c && $$4xx.b() == djm.c && $$4xx.a($$8)) {
               $$4.setValue(((dkb)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
            }
         });
      });
      if ($$2.d() instanceof cam $$7) {
         a($$7, ($$5x, $$6, $$7x) -> {
            fdj $$8 = dji.b($$0, $$6, $$1, $$2);
            ((dji)$$5x.a()).a(djj.m).forEach($$4xx -> {
               if ($$4xx.a() == djm.a && $$4xx.b() == djm.c && $$4xx.a($$8)) {
                  $$4.setValue(((dkb)$$4xx.c()).a($$6, $$5, $$4.floatValue()));
               }
            });
         });
      }

      return $$4.floatValue();
   }

   public static void a(dcv $$0, bzx $$1, BiConsumer<jl<cbn>, cbq> $$2) {
      a($$0, ($$2x, $$3) -> ((dji)$$2x.a()).a(djj.l).forEach($$4 -> {
         if (((dji)$$2x.a()).g().h().contains($$1)) {
            $$2.accept($$4.c(), $$4.a($$3, $$1));
         }
      }));
   }

   public static void a(dcv $$0, bzw $$1, BiConsumer<jl<cbn>, cbq> $$2) {
      a($$0, ($$2x, $$3) -> ((dji)$$2x.a()).a(djj.l).forEach($$4 -> {
         if (((dji)$$2x.a()).a($$1)) {
            $$2.accept($$4.c(), $$4.a($$3, $$1));
         }
      }));
   }

   public static int a(aub $$0, dcv $$1, bzm $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().d($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float b(aub $$0, dcv $$1, bzm $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().c($$0, $$5, $$1, $$2, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static int c(aub $$0, dcv $$1, bzm $$2) {
      MutableFloat $$3 = new MutableFloat(0.0F);
      a($$1, ($$4, $$5) -> $$4.a().b($$0, $$5, $$1, $$2, $$3));
      return Math.max(0, $$3.intValue());
   }

   public static float a(dcv $$0, cam $$1, float $$2) {
      MutableFloat $$3 = new MutableFloat($$2);
      a($$0, ($$2x, $$3x) -> ((dji)$$2x.a()).b($$1.ec(), $$3x, $$3));
      return Math.max(0.0F, $$3.floatValue());
   }

   public static float a(dcv $$0, cam $$1) {
      MutableFloat $$2 = new MutableFloat(0.0F);
      a($$0, ($$2x, $$3) -> ((dji)$$2x.a()).a($$1.ec(), $$3, $$2));
      return $$2.floatValue();
   }

   public static boolean a(dcv $$0, bae<dji> $$1) {
      djo $$2 = $$0.a(kq.l, djo.a);

      for (Entry<jl<dji>> $$3 : $$2.b()) {
         jl<dji> $$4 = (jl<dji>)$$3.getKey();
         if ($$4.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(dcv $$0, kp<?> $$1) {
      MutableBoolean $$2 = new MutableBoolean(false);
      a($$0, ($$2x, $$3) -> {
         if (((dji)$$2x.a()).i().c($$1)) {
            $$2.setTrue();
         }
      });
      return $$2.booleanValue();
   }

   public static <T> Optional<T> b(dcv $$0, kp<List<T>> $$1) {
      Pair<List<T>, Integer> $$2 = c($$0, $$1);
      if ($$2 != null) {
         List<T> $$3 = (List<T>)$$2.getFirst();
         int $$4 = (Integer)$$2.getSecond();
         return Optional.of($$3.get(Math.min($$4, $$3.size()) - 1));
      } else {
         return Optional.empty();
      }
   }

   @Nullable
   public static <T> Pair<T, Integer> c(dcv $$0, kp<T> $$1) {
      MutableObject<Pair<T, Integer>> $$2 = new MutableObject();
      a($$0, ($$2x, $$3) -> {
         if ($$2.getValue() == null || (Integer)((Pair)$$2.getValue()).getSecond() < $$3) {
            T $$4 = ((dji)$$2x.a()).i().a($$1);
            if ($$4 != null) {
               $$2.setValue(Pair.of($$4, $$3));
            }
         }
      });
      return (Pair<T, Integer>)$$2.getValue();
   }

   public static Optional<djh> a(kp<?> $$0, cam $$1, Predicate<dcv> $$2) {
      List<djh> $$3 = new ArrayList<>();

      for (bzw $$4 : bzw.j) {
         dcv $$5 = $$1.a($$4);
         if ($$2.test($$5)) {
            djo $$6 = $$5.a(kq.l, djo.a);

            for (Entry<jl<dji>> $$7 : $$6.b()) {
               jl<dji> $$8 = (jl<dji>)$$7.getKey();
               if ($$8.a().i().c($$0) && $$8.a().a($$4)) {
                  $$3.add(new djh($$5, $$4, $$1));
               }
            }
         }
      }

      return ag.b($$3, $$1.ec());
   }

   public static int a(bck $$0, int $$1, int $$2, dcv $$3) {
      djg $$4 = $$3.a(kq.C);
      if ($$4 == null) {
         return 0;
      } else {
         if ($$2 > 15) {
            $$2 = 15;
         }

         int $$5 = $$0.a(8) + 1 + ($$2 >> 1) + $$0.a($$2 + 1);
         if ($$1 == 0) {
            return Math.max($$5 / 3, 1);
         } else {
            return $$1 == 1 ? $$5 * 2 / 3 + 1 : Math.max($$5, $$2 * 2);
         }
      }
   }

   public static dcv a(bck $$0, dcv $$1, int $$2, jz $$3, Optional<? extends jp<dji>> $$4) {
      return a($$0, $$1, $$2, $$4.<Stream<jl<dji>>>map(jp::a).orElseGet(() -> $$3.f(mn.aW).c().map($$0xx -> $$0xx)));
   }

   public static dcv a(bck $$0, dcv $$1, int $$2, Stream<jl<dji>> $$3) {
      List<djl> $$4 = b($$0, $$1, $$2, $$3);
      if ($$1.a(dcz.rW)) {
         $$1 = new dcv(dcz.vY);
      }

      for (djl $$5 : $$4) {
         $$1.a($$5.b(), $$5.c());
      }

      return $$1;
   }

   public static List<djl> b(bck $$0, dcv $$1, int $$2, Stream<jl<dji>> $$3) {
      List<djl> $$4 = Lists.newArrayList();
      djg $$5 = $$1.a(kq.C);
      if ($$5 == null) {
         return $$4;
      } else {
         $$2 += 1 + $$0.a($$5.a() / 4 + 1) + $$0.a($$5.a() / 4 + 1);
         float $$6 = ($$0.i() + $$0.i() - 1.0F) * 0.15F;
         $$2 = bcb.a(Math.round($$2 + $$2 * $$6), 1, Integer.MAX_VALUE);
         List<djl> $$7 = a($$2, $$1, $$3);
         if (!$$7.isEmpty()) {
            bvu.a($$0, $$7, djl::a).ifPresent($$4::add);

            while ($$0.a(50) <= $$2) {
               if (!$$4.isEmpty()) {
                  a($$7, ag.c($$4));
               }

               if ($$7.isEmpty()) {
                  break;
               }

               bvu.a($$0, $$7, djl::a).ifPresent($$4::add);
               $$2 /= 2;
            }
         }

         return $$4;
      }
   }

   public static void a(List<djl> $$0, djl $$1) {
      $$0.removeIf($$1x -> !dji.a($$1.b(), $$1x.b()));
   }

   public static boolean a(Collection<jl<dji>> $$0, jl<dji> $$1) {
      for (jl<dji> $$2 : $$0) {
         if (!dji.a($$2, $$1)) {
            return false;
         }
      }

      return true;
   }

   public static List<djl> a(int $$0, dcv $$1, Stream<jl<dji>> $$2) {
      List<djl> $$3 = Lists.newArrayList();
      boolean $$4 = $$1.a(dcz.rW);
      $$2.filter($$2x -> ((dji)$$2x.a()).a($$1) || $$4).forEach($$2x -> {
         dji $$3x = (dji)$$2x.a();

         for (int $$4x = $$3x.e(); $$4x >= $$3x.d(); $$4x--) {
            if ($$0 >= $$3x.b($$4x) && $$0 <= $$3x.c($$4x)) {
               $$3.add(new djl($$2x, $$4x));
               break;
            }
         }
      });
      return $$3;
   }

   public static void a(dcv $$0, jz $$1, amd<dkq> $$2, bxh $$3, bck $$4) {
      dkq $$5 = $$1.f(mn.aV).c($$2);
      if ($$5 != null) {
         a($$0, $$4x -> $$5.a($$0, $$4x, $$4, $$3));
      }
   }

   @FunctionalInterface
   interface a {
      void accept(jl<dji> var1, int var2, djh var3);
   }

   @FunctionalInterface
   interface b {
      void accept(jl<dji> var1, int var2);
   }
}
