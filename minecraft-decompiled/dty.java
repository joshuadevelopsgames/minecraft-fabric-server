import com.mojang.serialization.MapCodec;

public class dty extends dpz implements dxl {
   public static final MapCodec<dty> a = b(dty::new);
   public static final ees b = eer.I;
   private static final fjm c = dpz.b(8.0, 0.0, 8.0);

   public dty(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, false));
   }

   @Override
   public MapCodec<dty> a() {
      return a;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(b) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, $$1.b(fam.c));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return c;
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
