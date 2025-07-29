import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dpk extends dph {
   public static final MapCodec<dpk> c = b(dpk::new);
   public static final eez<jh> d = dub.f;
   private static final Map<jh, fjm> e = fjj.c(dpz.b(16.0, 8.0, 5.0, 16.0));

   @Override
   public MapCodec<? extends dpk> a() {
      return c;
   }

   protected dpk(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, jh.c).b(b, true));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return e.get($$0.c(d));
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(d, b);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return $$4.g() == $$0.c(d) && !$$0.a($$1, $$3) ? dqb.a.m() : $$0;
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jh $$3 = $$0.c(d);
      jb $$4 = $$2.a($$3.g());
      eeb $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = super.a($$0);
      dmx $$2 = $$0.q();
      jb $$3 = $$0.a();
      jh[] $$4 = $$0.f();

      for (jh $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.b(d, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
