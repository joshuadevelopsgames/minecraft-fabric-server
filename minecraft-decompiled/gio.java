import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class gio extends giq {
   private static final xo a = xo.c("options.online.title");
   @Nullable
   private fuh<Unit> f;

   public gio(get $$0, fui $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aV_() {
      super.aV_();
      if (this.f != null) {
         fxm $$0 = this.d.b(this.f);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fuh<?>[] a(fui $$0, fue $$1) {
      List<fuh<?>> $$2 = new ArrayList<>();
      $$2.add($$0.X());
      $$2.add($$0.Y());
      fuh<Unit> $$3 = y.a(
         $$1.s,
         $$0x -> {
            bxg $$1x = $$0x.an();
            return new fuh<>(
               "options.difficulty.online",
               fuh.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fuh.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {}
            );
         }
      );
      if ($$3 != null) {
         this.f = $$3;
         $$2.add($$3);
      }

      return $$2.toArray(new fuh[0]);
   }

   @Override
   protected void l() {
      this.d.a(this.a(this.c, this.n));
   }
}
