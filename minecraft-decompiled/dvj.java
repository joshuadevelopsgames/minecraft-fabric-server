import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dvj extends dzl implements dqc {
   public static final MapCodec<dvj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(amd.a(mn.aP).fieldOf("feature").forGetter($$0x -> $$0x.c), t()).apply($$0, dvj::new)
   );
   private static final fjm b = dpz.b(6.0, 0.0, 6.0);
   private final amd<ems<?, ?>> c;

   @Override
   public MapCodec<dvj> a() {
      return a;
   }

   public dvj(amd<ems<?, ?>> $$0, eea.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (jb $$6 : jb.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         jb $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

         for (int $$8 = 0; $$8 < 4; $$8++) {
            if ($$1.w($$7) && $$0.a($$1, $$7)) {
               $$2 = $$7;
            }

            $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);
         }

         if ($$1.w($$7) && $$0.a($$1, $$7)) {
            $$1.a($$7, $$0, 2);
         }
      }
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      return $$0.s();
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jb $$3 = $$2.e();
      eeb $$4 = $$1.a_($$3);
      return $$4.a(azo.bd) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(aub $$0, jb $$1, eeb $$2, bck $$3) {
      Optional<? extends jl<ems<?, ?>>> $$4 = $$0.K_().f(mn.aP).a(this.c);
      if ($$4.isEmpty()) {
         return false;
      } else {
         $$0.a($$1, false);
         if ($$4.get().a().a($$0, $$0.n().g(), $$3, $$1)) {
            return true;
         } else {
            $$0.a($$1, $$2, 3);
            return false;
         }
      }
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return true;
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return $$1.i() < 0.4;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
