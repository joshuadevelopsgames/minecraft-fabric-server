import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drm extends dsy {
   public static final MapCodec<drm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mm.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, drm::new)
   );
   private final dpz b;

   @Override
   public MapCodec<drm> a() {
      return a;
   }

   public drm(dpz $$0, eea.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, eeb $$3, cqy $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public eeb a(dgo $$0) {
      dly $$1 = $$0.q();
      jb $$2 = $$0.a();
      eeb $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(dly $$0, jb $$1, eeb $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(dly $$0, jb $$1) {
      boolean $$2 = false;
      jb.a $$3 = $$1.k();

      for (jh $$4 : jh.values()) {
         eeb $$5 = $$0.a_($$3);
         if ($$4 != jh.a || o($$5)) {
            $$3.a($$1, $$4);
            $$5 = $$0.a_($$3);
            if (o($$5) && !$$5.c($$0, $$1, $$4.g())) {
               $$2 = true;
               break;
            }
         }
      }

      return $$2;
   }

   private static boolean o(eeb $$0) {
      return $$0.y().a(azu.a);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(eeb $$0, dly $$1, jb $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
