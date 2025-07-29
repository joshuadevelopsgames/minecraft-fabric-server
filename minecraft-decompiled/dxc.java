import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dxc extends dpl implements dxl {
   public static final MapCodec<dxc> a = b(dxc::new);
   public static final ees b = eer.C;
   public static final ees c = eer.I;
   public static final ees d = eer.e;
   private static final fjm f = dpz.b(16.0, 0.0, 8.0);
   public static final double e = f.c(jh.a.b);

   @Override
   public MapCodec<dxc> a() {
      return a;
   }

   public dxc(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, false).b(c, false).b(d, false));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, bzm $$3) {
      if ($$0 instanceof aub $$4) {
         auc $$5 = ecl.a($$3);
         if ($$5 != null) {
            $$4.a($$1, ebb.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, false), 3);
         $$1.a($$2, ebb.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return f;
   }

   @Override
   protected fjm d_(eeb $$0) {
      return f;
   }

   @Override
   protected boolean g_(eeb $$0) {
      return true;
   }

   @Nullable
   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ecl($$0, $$1);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      return this.m().b(c, $$0.q().b_($$0.a()).a() == fam.c);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(c) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, dcv $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bwl.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return !$$0.C ? dpl.a($$2, ebb.M, ($$0x, $$1x, $$2x, $$3) -> ejk.c.a($$0x, $$3.gI(), $$3.gJ())) : null;
   }
}
