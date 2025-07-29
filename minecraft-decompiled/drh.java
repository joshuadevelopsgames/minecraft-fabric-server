import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class drh extends dub implements dqc {
   public static final MapCodec<drh> a = b(drh::new);
   public static final int b = 2;
   public static final efb c = eer.au;
   private static final List<Map<jh, fjm>> d = IntStream.rangeClosed(0, 2)
      .mapToObj($$0 -> fjj.c(dpz.b(4 + $$0 * 2, 7 - $$0 * 2, 12.0).a(0.0, 0.0, ($$0 - 5) / 16.0).d()))
      .toList();

   @Override
   public MapCodec<drh> a() {
      return a;
   }

   public drh(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, jh.c).b(c, 0));
   }

   @Override
   protected boolean f(eeb $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$1.A.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, $$4 + 1), 2);
         }
      }
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      eeb $$3 = $$1.a_($$2.a($$0.c(f)));
      return $$3.a(azo.x);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return d.get($$0.c(c)).get($$0.c(f));
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = this.m();
      dmx $$2 = $$0.q();
      jb $$3 = $$0.a();

      for (jh $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.b(f, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4 == $$0.c(f) && !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      $$0.a($$2, $$3.b(c, $$3.c(c) + 1), 2);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(f, c);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
