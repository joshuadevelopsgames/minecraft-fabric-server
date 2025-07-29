import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dzq extends dxk {
   public static final MapCodec<dzq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(efp.a.fieldOf("wood_type").forGetter(dxk::d), t()).apply($$0, dzq::new));
   public static final eez<jh> b = dub.f;
   private static final Map<jh, fjm> c = fjj.c(dpz.a(16.0, 4.5, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dzq> a() {
      return a;
   }

   public dzq(efp $$0, eea.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.C.b().b(b, jh.c).b(d, false));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = this.m();
      fal $$2 = $$0.q().b_($$0.a());
      dmx $$3 = $$0.q();
      jb $$4 = $$0.a();
      jh[] $$5 = $$0.f();

      for (jh $$6 : $$5) {
         if ($$6.o().d()) {
            jh $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(d, $$2.a() == fam.c);
            }
         }
      }

      return null;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(eeb $$0) {
      return $$0.c(b).p();
   }

   @Override
   public fis o(eeb $$0) {
      return c.get($$0.c(b)).a().f();
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, d);
   }
}
