import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class due extends dpz {
   public static final MapCodec<due> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mm.e.q().fieldOf("host").forGetter(due::b), t()).apply($$0, due::new));
   private final dpz b;
   private static final Map<dpz, dpz> c = Maps.newIdentityHashMap();
   private static final Map<eeb, eeb> d = Maps.newIdentityHashMap();
   private static final Map<eeb, eeb> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends due> a() {
      return a;
   }

   public due(dpz $$0, eea.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dpz b() {
      return this.b;
   }

   public static boolean o(eeb $$0) {
      return c.containsKey($$0.b());
   }

   private void a(aub $$0, jb $$1) {
      csc $$2 = bzv.bg.a($$0, bzu.k);
      if ($$2 != null) {
         $$2.b($$1.u() + 0.5, $$1.v(), $$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.Y();
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, dcv $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.P().c(dmq.i) && !djk.a($$3, azr.t)) {
         this.a($$1, $$2);
      }
   }

   public static eeb p(eeb $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public eeb q(eeb $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static eeb a(Map<eeb, eeb> $$0, eeb $$1, Supplier<eeb> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         eeb $$2x = $$2.get();

         for (efe $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
