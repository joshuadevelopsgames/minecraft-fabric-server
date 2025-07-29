import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dzn extends doq {
   public static final MapCodec<dzn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbt.q.fieldOf("color").forGetter(doq::b), t()).apply($$0, dzn::new));
   public static final eez<jh> b = dub.f;
   private static final Map<jh, fjm> c = fjj.c(dpz.a(16.0, 0.0, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dzn> a() {
      return a;
   }

   public dzn(dbt $$0, eea.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(b, jh.c));
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = this.m();
      dmx $$2 = $$0.q();
      jb $$3 = $$0.a();
      jh[] $$4 = $$0.f();

      for (jh $$5 : $$4) {
         if ($$5.o().d()) {
            jh $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
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
      $$0.a(b);
   }
}
