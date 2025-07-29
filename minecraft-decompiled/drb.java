import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class drb extends dwt implements dxl {
   public static final MapCodec<drb> a = b(drb::new);
   public static final ees b = eer.I;
   private static final Map<jh.a, fjm> e = fjj.b(dpz.a(3.0, 3.0, 16.0));

   @Override
   public MapCodec<drb> a() {
      return a;
   }

   public drb(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, false).b(d, jh.a.b));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return e.get($$0.c(d));
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == fam.c;
      return super.a($$0).b(b, $$2);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b).a(d);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(b) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
