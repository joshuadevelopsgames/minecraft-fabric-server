import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dtf extends dzl implements dqc, dxh {
   public static final MapCodec<dtf> a = b(dtf::new);
   public static final eez<jh> b = eer.T;
   public static final efb c = eer.U;
   private final Function<eeb, fjm> g;

   @Override
   public MapCodec<dtf> a() {
      return a;
   }

   protected dtf(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jh.c).b(c, 1));
      this.g = this.q();
   }

   private Function<eeb, fjm> q() {
      return this.a(this.a(b, c));
   }

   @Override
   public eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public boolean a(eeb $$0, dgo $$1) {
      return this.a($$0, $$1, c) ? true : super.a($$0, $$1);
   }

   @Override
   public fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.g.apply($$0);
   }

   @Override
   public double b() {
      return 3.0;
   }

   @Override
   public efb c() {
      return c;
   }

   @Override
   public eeb a(dgo $$0) {
      return this.a($$0, this, c, b);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return true;
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      int $$4 = $$3.c(c);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(c, $$4 + 1), 2);
      } else {
         a($$0, $$2, new dcv(this));
      }
   }
}
