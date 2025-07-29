import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpg extends dpz implements dxl {
   public static final MapCodec<dpg> a = b(dpg::new);
   public static final ees b = eer.I;

   @Override
   public MapCodec<dpg> a() {
      return a;
   }

   protected dpg(eea.d $$0) {
      super($$0);
      this.l(this.m().b(b, false));
   }

   @Override
   protected boolean e_(eeb $$0) {
      return $$0.y().c();
   }

   @Override
   protected dwn a_(eeb $$0) {
      return dwn.a;
   }

   @Override
   protected float c(eeb $$0, dly $$1, jb $$2) {
      return 1.0F;
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

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      return this.m().b(b, $$0.q().b_($$0.a()).a() == fam.c);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   @Override
   public dcv a(@Nullable cam $$0, dmv $$1, jb $$2, eeb $$3) {
      return $$0 instanceof cut $$4 && $$4.gI() ? dxl.super.a($$0, $$1, $$2, $$3) : dcv.l;
   }

   @Override
   public boolean a(@Nullable cam $$0, dly $$1, jb $$2, eeb $$3, fak $$4) {
      return $$0 instanceof cut $$5 && $$5.gI() ? dxl.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
