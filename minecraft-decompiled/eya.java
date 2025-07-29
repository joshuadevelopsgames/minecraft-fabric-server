import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eya extends eyx {
   public static final MapCodec<eya> a = Codec.FLOAT.fieldOf("mossiness").xmap(eya::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final eeb[] e = new eeb[]{dqb.kg.m(), dqb.kn.m()};
   private final float f;

   public eya(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public eza.d a(dmx $$0, jb $$1, jb $$2, eza.d $$3, eza.d $$4, eyw $$5) {
      bck $$6 = $$5.b($$4.a());
      eeb $$7 = $$4.b();
      jb $$8 = $$4.a();
      eeb $$9 = null;
      if ($$7.a(dqb.eZ) || $$7.a(dqb.b) || $$7.a(dqb.fc)) {
         $$9 = this.a($$6);
      } else if ($$7.a(azo.I)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(azo.G)) {
         $$9 = this.b($$6);
      } else if ($$7.a(azo.H)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dqb.cy)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new eza.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private eeb a(bck $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         eeb[] $$1 = new eeb[]{dqb.fb.m(), a($$0, dqb.fC)};
         eeb[] $$2 = new eeb[]{dqb.fa.m(), a($$0, dqb.nN)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private eeb a(bck $$0, eeb $$1) {
      jh $$2 = $$1.c(dye.b);
      efa $$3 = $$1.c(dye.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         eeb[] $$4 = new eeb[]{dqb.nN.m().b(dye.b, $$2).b(dye.c, $$3), dqb.ob.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private eeb b(bck $$0) {
      return $$0.i() < this.f ? dqb.ob.m() : null;
   }

   @Nullable
   private eeb c(bck $$0) {
      return $$0.i() < this.f ? dqb.op.m() : null;
   }

   @Nullable
   private eeb d(bck $$0) {
      return $$0.i() < 0.15F ? dqb.pT.m() : null;
   }

   private static eeb a(bck $$0, dpz $$1) {
      return $$1.m().b(dye.b, jh.c.a.a($$0)).b(dye.c, ag.a(efa.values(), $$0));
   }

   private eeb a(bck $$0, eeb[] $$1, eeb[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static eeb a(bck $$0, eeb[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected eyz<?> a() {
      return eyz.k;
   }
}
