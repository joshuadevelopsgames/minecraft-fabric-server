import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record da(ui d) {
   private static final Logger e = LogUtils.getLogger();
   public static final Codec<da> a = vj.f.xmap(da::new, da::a);
   public static final zm<ByteBuf, da> b = zk.s.a(da::new, da::a);
   public static final String c = "SelectedItem";

   public boolean a(kl $$0) {
      dfd $$1 = $$0.a(kq.b, dfd.a);
      return $$1.b(this.d);
   }

   public boolean a(bzm $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable vi $$0) {
      return $$0 != null && ux.a(this.d, $$0, true);
   }

   public static ui b(bzm $$0) {
      ui var7;
      try (bci.j $$1 = new bci.j($$0.ef(), e)) {
         fcz $$2 = fcz.a($$1, $$0.eb());
         $$0.d($$2);
         if ($$0 instanceof cut $$3) {
            dcv $$4 = $$3.gs().g();
            if (!$$4.f()) {
               $$2.a("SelectedItem", dcv.b, $$4);
            }
         }

         var7 = $$2.b();
      }

      return var7;
   }

   public ui a() {
      return this.d;
   }
}
