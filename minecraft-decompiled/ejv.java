import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class ejv extends efz {
   public static final MapCodec<ejv> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(etb.a.fieldOf("settings").forGetter(ejv::h)).apply($$0, $$0.stable(ejv::new))
   );
   private final etb d;

   public ejv(etb $$0) {
      super(new doi($$0.d()), ag.b($$0::a));
      this.d = $$0;
   }

   @Override
   public ega a(jn<eve> $$0, eko $$1, long $$2) {
      Stream<jl<eve>> $$3 = this.d.c().map(jp::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return ega.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends efz> b() {
      return c;
   }

   public etb h() {
      return this.d;
   }

   @Override
   public void a(auj $$0, dnq $$1, eko $$2, efy $$3) {
   }

   @Override
   public int a(dmw $$0) {
      return $$0.L_() + Math.min($$0.M_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<efy> a(elc $$0, eko $$1, dnq $$2, efy $$3) {
      List<eeb> $$4 = this.d.f();
      jb.a $$5 = new jb.a();
      eka $$6 = $$3.a(eka.a.c);
      eka $$7 = $$3.a(eka.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.M_(), $$4.size()); $$8++) {
         eeb $$9 = $$4.get($$8);
         if ($$9 != null) {
            int $$10 = $$3.L_() + $$8;

            for (int $$11 = 0; $$11 < 16; $$11++) {
               for (int $$12 = 0; $$12 < 16; $$12++) {
                  $$3.a($$5.d($$11, $$10, $$12), $$9);
                  $$6.a($$11, $$10, $$12, $$9);
                  $$7.a($$11, $$10, $$12, $$9);
               }
            }
         }
      }

      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, eka.a $$2, dmw $$3, eko $$4) {
      List<eeb> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.ao()); $$6 >= 0; $$6--) {
         eeb $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.L_() + $$6 + 1;
         }
      }

      return $$3.L_();
   }

   @Override
   public dng a(int $$0, int $$1, dmw $$2, eko $$3) {
      return new dng($$2.L_(), this.d.f().stream().limit($$2.M_()).map($$0x -> $$0x == null ? dqb.a.m() : $$0x).toArray(eeb[]::new));
   }

   @Override
   public void a(List<String> $$0, eko $$1, jb $$2) {
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
      return -63;
   }
}
