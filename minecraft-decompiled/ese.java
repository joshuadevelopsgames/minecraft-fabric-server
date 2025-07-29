import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ese extends esi {
   public static final MapCodec<ese> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(ese::new, $$0 -> $$0.b);
   private final float b;

   public ese(float $$0) {
      this.b = $$0;
   }

   @Override
   protected esj<?> a() {
      return esj.d;
   }

   @Override
   public void a(esi.a $$0) {
      bck $$1 = $$0.b();
      List<jb> $$2 = $$0.c();
      if (!$$2.isEmpty()) {
         if (!($$1.i() >= this.b)) {
            List<jb> $$3 = new ArrayList<>($$2);
            ag.c($$3, $$1);
            Optional<jb> $$4 = $$3.stream().filter($$1x -> {
               for (jh $$2x : jh.values()) {
                  if (!$$0.a($$1x.a($$2x), $$0xx -> $$0xx.a(azo.D))) {
                     return false;
                  }
               }

               return true;
            }).findFirst();
            if (!$$4.isEmpty()) {
               $$0.a($$4.get(), dqb.cE.m().b(drv.c, eev.b).b(drv.d, true));
            }
         }
      }
   }
}
