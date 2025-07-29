import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eyb extends eyx {
   public static final MapCodec<eyb> a = eeb.a.xmap(eea.a::b, dpz::m).listOf().fieldOf("blocks").xmap(eyb::new, $$0 -> $$0.e);
   public static final eyb b = new eyb(ImmutableList.of(dqb.pH));
   public static final eyb c = new eyb(ImmutableList.of(dqb.a));
   public static final eyb d = new eyb(ImmutableList.of(dqb.a, dqb.pH));
   private final ImmutableList<dpz> e;

   public eyb(List<dpz> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public eza.d a(dmx $$0, jb $$1, jb $$2, eza.d $$3, eza.d $$4, eyw $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected eyz<?> a() {
      return eyz.e;
   }
}
