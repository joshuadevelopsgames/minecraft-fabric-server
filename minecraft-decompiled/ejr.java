import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ejr extends efz {
   public static final MapCodec<ejr> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(amc.d(doe.b)).apply($$0, $$0.stable(ejr::new)));
   private static final int h = 2;
   private static final List<eeb> i = StreamSupport.stream(mm.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = bcb.f(bcb.c((float)i.size()));
   private static final int k = bcb.f((float)i.size() / j);
   protected static final eeb d = dqb.a.m();
   protected static final eeb e = dqb.iy.m();
   public static final int f = 70;
   public static final int g = 60;

   public ejr(jl.c<dnx> $$0) {
      super(new doi($$0));
   }

   @Override
   protected MapCodec<? extends efz> b() {
      return c;
   }

   @Override
   public void a(auj $$0, dnq $$1, eko $$2, efy $$3) {
   }

   @Override
   public void a(dnt $$0, efy $$1, dnq $$2) {
      jb.a $$3 = new jb.a();
      dlz $$4 = $$1.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = ke.a($$5, $$7);
            int $$10 = ke.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            eeb $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<efy> a(elc $$0, eko $$1, dnq $$2, efy $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, eka.a $$2, dmw $$3, eko $$4) {
      return 0;
   }

   @Override
   public dng a(int $$0, int $$1, dmw $$2, eko $$3) {
      return new dng(0, new eeb[0]);
   }

   @Override
   public void a(List<String> $$0, eko $$1, jb $$2) {
   }

   public static eeb a(int $$0, int $$1) {
      eeb $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = bcb.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(auj $$0, long $$1, eko $$2, dnz $$3, dnq $$4, efy $$5) {
   }

   @Override
   public void a(auj $$0) {
   }

   @Override
   public int g() {
      return 0;
   }

   @Override
   public int e() {
      return 384;
   }

   @Override
   public int f() {
      return 63;
   }
}
