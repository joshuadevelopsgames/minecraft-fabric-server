import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dyh extends dpz {
   public static final MapCodec<dyh> a = b(dyh::new);
   private static final xo c = xo.c("container.stonecutter");
   public static final eez<jh> b = dub.f;
   private static final fjm d = dpz.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<dyh> a() {
      return a;
   }

   public dyh(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jh.c));
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(azj.az);
      }

      return bxj.a;
   }

   @Nullable
   @Override
   protected bxm b(eeb $$0, dmu $$1, jb $$2) {
      return new bxs(($$2x, $$3, $$4) -> new daq($$2x, $$3, cyz.a($$1, $$2)), c);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return d;
   }

   @Override
   protected boolean g_(eeb $$0) {
      return true;
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

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
