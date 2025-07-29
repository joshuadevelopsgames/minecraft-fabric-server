import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eyt extends eyx {
   public static final MapCodec<eyt> a = eyp.b.listOf().fieldOf("rules").xmap(eyt::new, $$0 -> $$0.b);
   private final ImmutableList<eyp> b;

   public eyt(List<? extends eyp> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public eza.d a(dmx $$0, jb $$1, jb $$2, eza.d $$3, eza.d $$4, eyw $$5) {
      bck $$6 = bck.a(bcb.a($$4.a()));
      eeb $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eyp $$8 = (eyp)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new eza.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected eyz<?> a() {
      return eyz.i;
   }
}
