import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dxg extends dzl implements dqc, dux {
   public static final MapCodec<dxg> a = b(dxg::new);
   private static final fjm b = dpz.b(12.0, 0.0, 12.0);

   @Override
   public MapCodec<dxg> a() {
      return a;
   }

   protected dxg(eea.d $$0) {
      super($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      return $$0.c($$1, $$2, jh.b) && !$$0.a(dqb.lp);
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());
      return $$1.a(azu.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      eeb $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if (!$$8.l()) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return $$8;
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return $$0.a_($$1.d()).a(dqb.J);
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   protected fal b_(eeb $$0) {
      return fam.c.a(false);
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      eeb $$4 = dqb.bH.m();
      eeb $$5 = $$4.b(dyr.d, eex.a);
      jb $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable cam $$0, dly $$1, jb $$2, eeb $$3, fak $$4) {
      return false;
   }

   @Override
   public boolean a(dmv $$0, jb $$1, eeb $$2, fal $$3) {
      return false;
   }
}
