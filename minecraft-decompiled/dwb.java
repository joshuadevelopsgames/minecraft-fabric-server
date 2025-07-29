import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dwb extends dpz implements dqh {
   public static final MapCodec<dwb> a = b(dwb::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fjm f = fjj.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dwb> a() {
      return a;
   }

   public dwb(eea.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(eeb $$0, eeb $$1, jh $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if (!($$3 instanceof cam) || $$3.dy().a(this)) {
         $$3.a($$0, new fis(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            bck $$5 = $$1.H_();
            boolean $$6 = $$3.an != $$3.dC() || $$3.ap != $$3.dI();
            if ($$6 && $$5.h()) {
               $$1.a(me.aN, $$3.dC(), $$2.v() + 1, $$3.dI(), bcb.b($$5, -1.0F, 1.0F) * 0.083333336F, 0.05F, bcb.b($$5, -1.0F, 1.0F) * 0.083333336F);
            }
         }
      }

      jb $$7 = $$2.j();
      $$4.a(caf.d, $$2x -> {
         if ($$1 instanceof aub $$3x && $$2x.cb() && ($$3x.P().c(dmq.d) || $$2x instanceof cut) && $$2x.c($$3x, $$7)) {
            $$1.b($$7, false);
         }
      });
      $$4.a(caf.a);
      $$4.a(caf.d);
   }

   @Override
   public void a(dmu $$0, eeb $$1, jb $$2, bzm $$3, double $$4) {
      if (!($$4 < 4.0) && $$3 instanceof cam $$5) {
         cam.a $$7 = $$5.eT();
         ayy $$8 = $$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, bzm $$3) {
      fjm $$4 = this.b($$0, $$1, $$2, fix.a($$3));
      return $$4.c() ? fjj.b() : $$4;
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      if (!$$3.c() && $$3 instanceof fjc $$4) {
         bzm $$5 = $$4.d();
         if ($$5 != null) {
            if ($$5.am > 2.5) {
               return f;
            }

            boolean $$6 = $$5 instanceof cqy;
            if ($$6 || a($$5) && $$3.a(fjj.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fjj.a();
   }

   @Override
   protected fjm c(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return fjj.a();
   }

   public static boolean a(bzm $$0) {
      if ($$0.ap().a(azs.h)) {
         return true;
      } else {
         return $$0 instanceof cam ? ((cam)$$0).a(bzw.c).a(dcz.qG) : false;
      }
   }

   @Override
   public dcv a(@Nullable cam $$0, dmv $$1, jb $$2, eeb $$3) {
      $$1.a($$2, dqb.a.m(), 11);
      if (!$$1.B_()) {
         $$1.c(2001, $$2, dpz.j($$3));
      }

      return new dcv(dcz.rI);
   }

   @Override
   public Optional<ayy> as_() {
      return Optional.of(ayz.dn);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return true;
   }
}
