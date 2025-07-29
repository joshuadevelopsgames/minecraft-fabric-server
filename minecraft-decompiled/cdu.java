import com.google.common.collect.ImmutableMap;

public class cdu extends ccd<cao> {
   private final bwo c;
   private final float d;
   private final float e;
   private final float f;

   public cdu(bwo $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cjo.o, cjp.b, cjo.R, cjp.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aub $$0, cao $$1, long $$2) {
      bck $$3 = $$1.ec();
      float $$4 = bcb.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = bcb.h($$1.dP() + 2.0F * $$3.i() * this.d - this.d);
      fis $$6 = fis.a($$4, $$5);
      $$1.eh().a(cjo.o, new ccg($$1.bI().e($$6)));
      $$1.eh().a(cjo.R, this.c.a($$3));
   }
}
