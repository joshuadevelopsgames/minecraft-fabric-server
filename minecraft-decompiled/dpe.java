import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dpe extends doq {
   public static final MapCodec<dpe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbt.q.fieldOf("color").forGetter(doq::b), t()).apply($$0, dpe::new));
   public static final efb b = eer.be;
   private static final Map<dbt, dpz> c = Maps.newHashMap();
   private static final fjm d = dpz.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dpe> a() {
      return a;
   }

   public dpe(dbt $$0, eea.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(b, 0));
      c.put($$0, this);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return d;
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(b, efh.a($$0.i() + 180.0F));
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4 == jh.a && !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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
      $$0.a(b);
   }

   public static dpz a(dbt $$0) {
      return c.getOrDefault($$0, dqb.jl);
   }
}
