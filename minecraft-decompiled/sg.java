import java.util.List;

public class sg {
   public static final euf a = ety.a(eka.a.e);
   public static final euf b = ety.a(eka.a.f);
   public static final euf c = ety.a(eka.a.c);
   public static final euf d = ety.a(eka.a.a);
   public static final euf e = ety.a(eka.a.d);
   public static final euf f = etx.a(eku.a(), eku.b());
   public static final euf g = etx.a(eku.b(10), eku.c(10));
   public static final euf h = etx.a(eku.b(8), eku.c(8));
   public static final euf i = etx.a(eku.b(4), eku.c(4));
   public static final euf j = etx.a(eku.a(), eku.a(256));

   public static void a(qq<euc> $$0) {
      sa.a($$0);
      sb.a($$0);
      sc.a($$0);
      sd.a($$0);
      se.a($$0);
      sf.a($$0);
      sh.a($$0);
      si.a($$0);
      sj.a($$0);
   }

   public static amd<euc> a(String $$0) {
      return amd.a(mn.bg, ame.b($$0));
   }

   public static void a(qq<euc> $$0, amd<euc> $$1, jl<ems<?, ?>> $$2, List<euf> $$3) {
      $$0.a($$1, new euc($$2, List.copyOf($$3)));
   }

   public static void a(qq<euc> $$0, amd<euc> $$1, jl<ems<?, ?>> $$2, euf... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static euf a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (int)$$3) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bvt<bwo> $$4 = bvt.<bwo>b().a(bwl.a($$0), (int)$$3 - 1).a(bwl.a($$0 + $$2), 1).a();
         return etu.a(new bwv($$4));
      }
   }

   public static eue a() {
      return etr.a(elh.c);
   }

   public static etr a(dpz $$0) {
      return etr.a(elh.a($$0.m(), jb.c));
   }

   public static jl<euc> a(jl<ems<?, ?>> $$0, euf... $$1) {
      return jl.a(new euc($$0, List.of($$1)));
   }

   public static <FC extends epm, F extends enh<FC>> jl<euc> a(F $$0, FC $$1, euf... $$2) {
      return a(jl.a(new ems($$0, $$1)), $$2);
   }

   public static <FC extends epm, F extends enh<FC>> jl<euc> a(F $$0, FC $$1) {
      return a($$0, $$1, elh.c);
   }

   public static <FC extends epm, F extends enh<FC>> jl<euc> a(F $$0, FC $$1, elh $$2) {
      return a($$0, $$1, etr.a($$2));
   }
}
