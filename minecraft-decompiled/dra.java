import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dra extends dxk {
   public static final MapCodec<dra> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(efp.a.fieldOf("wood_type").forGetter(dxk::d), t()).apply($$0, dra::new));
   public static final efb b = eer.be;
   public static final ees c = eer.a;
   private static final fjm e = dpz.b(10.0, 0.0, 16.0);
   private static final Map<Integer, fjm> f = fjj.c(dpz.a(14.0, 2.0, 0.0, 10.0))
      .entrySet()
      .stream()
      .collect(Collectors.toMap($$0 -> efh.a($$0.getKey()), Entry::getValue));

   @Override
   public MapCodec<dra> a() {
      return a;
   }

   public dra(efp $$0, eea.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.C.b().b(b, 0).b(c, false).b(d, false));
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      return (bxj)($$2.c_($$3) instanceof ecn $$7 && this.a($$4, $$6, $$7, $$0) ? bxj.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   private boolean a(cut $$0, fio $$1, ecn $$2, dcv $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof dck && $$1.c().equals(jh.a);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jh.a, dyl.b);
   }

   @Override
   public eeb a(dgo $$0) {
      dmu $$1 = $$0.q();
      fal $$2 = $$1.b_($$0.a());
      jb $$3 = $$0.a().d();
      eeb $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(azo.aG);
      jh $$6 = jh.a((double)$$0.i());
      boolean $$7 = !dpz.a($$4.g($$1, $$3), jh.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dzp.b)) {
            jh $$8 = $$4.c(dzp.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jh> $$9 = efh.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? efh.a($$6.g()) : efh.a($$0.i() + 180.0F);
      return this.m().b(c, $$7).b(b, $$10).b(d, $$2.a() == fam.c);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return f.getOrDefault($$0.c(b), e);
   }

   @Override
   protected fjm b_(eeb $$0, dly $$1, jb $$2) {
      return this.a($$0, $$1, $$2, fix.a());
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4 == jh.b && !this.a($$0, $$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(eeb $$0) {
      return efh.b($$0.c(b));
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a($$0.c(b), 16));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.b(b, $$1.a($$0.c(b), 16));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new eca($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return a($$2, ebb.i, ecn::a);
   }
}
