import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpf extends dpl {
   public static final MapCodec<dpf> a = b(dpf::new);
   public static final eez<jh> b = eer.R;
   public static final ees c = eer.y;

   @Override
   public MapCodec<dpf> a() {
      return a;
   }

   public dpf(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jh.c).b(c, false));
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if ($$1 instanceof aub $$5 && $$1.c_($$2) instanceof ear $$6) {
         $$3.a($$6);
         $$3.a(azj.as);
         ctj.a($$5, $$3, true);
      }

      return bxj.a;
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      bxf.a($$0, $$1, $$2);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      eaz $$4 = $$1.c_($$2);
      if ($$4 instanceof ear) {
         ((ear)$$4).k();
      }
   }

   @Nullable
   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ear($$0, $$1);
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return cym.a($$1.c_($$2));
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
      $$0.a(b, c);
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
