import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class fvi {
   private static final int c = -1;
   public static final int a = -14647248;
   public static final int b = -9321636;
   private final jr<fvh> d = new jr<>(32);
   private final Map<dpz, Set<efe<?>>> e = Maps.newHashMap();

   public static fvi a() {
      fvi $$0 = new fvi();
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gws.a($$1, $$0x.c(dsi.b) == eex.a ? $$2.e() : $$2) : dms.a(), dqb.jk, dqb.jj);
      $$0.a(dsi.b, dqb.jk, dqb.jj);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gws.a($$1, $$2) : dms.a(), dqb.i, dqb.bB, dqb.bA, dqb.gB, dqb.bD);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         if ($$3 != 0) {
            return $$1 != null && $$2 != null ? gws.a($$1, $$2) : dms.a();
         } else {
            return -1;
         }
      }, dqb.tk, dqb.tl);
      $$0.a(($$0x, $$1, $$2, $$3) -> -10380959, dqb.aL);
      $$0.a(($$0x, $$1, $$2, $$3) -> -8345771, dqb.aM);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gws.b($$1, $$2) : -12012264, dqb.aK, dqb.aN, dqb.aO, dqb.aQ, dqb.fx, dqb.aS);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gws.c($$1, $$2) : -10732494, dqb.tm);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gws.d($$1, $$2) : -1, dqb.J, dqb.nK, dqb.fT);
      $$0.a(($$0x, $$1, $$2, $$3) -> dwj.b($$0x.c(dwj.f)), dqb.cH);
      $$0.a(dwj.f, dqb.cH);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? gws.a($$1, $$2) : -1, dqb.ej);
      $$0.a(($$0x, $$1, $$2, $$3) -> -2046180, dqb.fu, dqb.ft);
      $$0.a(($$0x, $$1, $$2, $$3) -> {
         int $$4 = $$0x.c(dyg.c);
         return baj.a($$4 * 32, 255 - $$4 * 8, $$4 * 4);
      }, dqb.fw, dqb.fv);
      $$0.a(dyg.c, dqb.fw, dqb.fv);
      $$0.a(($$0x, $$1, $$2, $$3) -> $$1 != null && $$2 != null ? -14647248 : -9321636, dqb.fF);
      return $$0;
   }

   public int a(eeb $$0, dmu $$1, jb $$2) {
      fvh $$3 = this.d.a(mm.e.a($$0.b()));
      if ($$3 != null) {
         return $$3.getColor($$0, null, null, 0);
      } else {
         fap $$4 = $$0.a((dly)$$1, $$2);
         return $$4 != null ? $$4.ak : -1;
      }
   }

   public int a(eeb $$0, @Nullable dlv $$1, @Nullable jb $$2, int $$3) {
      fvh $$4 = this.d.a(mm.e.a($$0.b()));
      return $$4 == null ? -1 : $$4.getColor($$0, $$1, $$2, $$3);
   }

   public void a(fvh $$0, dpz... $$1) {
      for (dpz $$2 : $$1) {
         this.d.a($$0, mm.e.a($$2));
      }
   }

   private void a(Set<efe<?>> $$0, dpz... $$1) {
      for (dpz $$2 : $$1) {
         this.e.put($$2, $$0);
      }
   }

   private void a(efe<?> $$0, dpz... $$1) {
      this.a(ImmutableSet.of($$0), $$1);
   }

   public Set<efe<?>> a(dpz $$0) {
      return this.e.getOrDefault($$0, ImmutableSet.of());
   }
}
