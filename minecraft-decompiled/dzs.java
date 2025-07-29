import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dzs extends dyy {
   public static final MapCodec<dzs> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dzs::new));
   public static final eez<jh> e = dub.f;
   private static final Map<jh, fjm> f = fjj.c(dpz.a(5.0, 3.0, 13.0, 11.0, 16.0));

   @Override
   public MapCodec<dzs> a() {
      return d;
   }

   protected dzs(mi $$0, eea.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(e, jh.c));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return o($$0);
   }

   public static fjm o(eeb $$0) {
      return f.get($$0.c(e));
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return b($$1, $$2, $$0.c(e));
   }

   public static boolean b(dmx $$0, jb $$1, jh $$2) {
      jb $$3 = $$1.a($$2.g());
      eeb $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = this.m();
      dmx $$2 = $$0.q();
      jb $$3 = $$0.a();
      jh[] $$4 = $$0.f();

      for (jh $$5 : $$4) {
         if ($$5.o().d()) {
            jh $$6 = $$5.g();
            $$1 = $$1.b(e, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4.g() == $$0.c(e) && !$$0.a($$1, $$3) ? dqb.a.m() : $$0;
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      jh $$4 = $$0.c(e);
      double $$5 = $$2.u() + 0.5;
      double $$6 = $$2.v() + 0.7;
      double $$7 = $$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      jh $$10 = $$4.g();
      $$1.a(me.ah, $$5 + 0.27 * $$10.j(), $$6 + 0.22, $$7 + 0.27 * $$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.c, $$5 + 0.27 * $$10.j(), $$6 + 0.22, $$7 + 0.27 * $$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(e);
   }
}
