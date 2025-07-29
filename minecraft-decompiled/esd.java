import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class esd extends esi {
   public static final MapCodec<esd> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(esd::new, $$0 -> $$0.b);
   private final float b;

   public esd(float $$0) {
      this.b = $$0;
   }

   @Override
   protected esj<?> a() {
      return esj.e;
   }

   @Override
   public void a(esi.a $$0) {
      bck $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<jb> $$2 = $$0.c();
         if (!$$2.isEmpty()) {
            int $$3 = $$2.getFirst().v();
            $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
               for (jh $$3x : jh.c.a) {
                  if ($$1.i() <= 0.25F) {
                     jh $$4 = $$3x.g();
                     jb $$5 = $$2x.b($$4.j(), 0, $$4.l());
                     if ($$0.a($$5)) {
                        $$0.a($$5, dqb.gb.m().b(drh.c, $$1.a(3)).b(drh.f, $$3x));
                     }
                  }
               }
            });
         }
      }
   }
}
