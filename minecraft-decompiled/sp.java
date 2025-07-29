import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public class sp extends ta {
   public static final MapCodec<sp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(amd.a(mn.aC).fieldOf("function").forGetter(sp::q), tt.a.forGetter(ta::n)).apply($$0, sp::new)
   );
   private final amd<Consumer<sy>> c;

   public sp(amd<Consumer<sy>> $$0, tt<jl<tu>> $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public void a(sy $$0) {
      $$0.a().K_().c(this.c).map(jl.c::a).orElseThrow(() -> new IllegalStateException("Trying to access missing test function: " + this.c.a())).accept($$0);
   }

   private amd<Consumer<sy>> q() {
      return this.c;
   }

   @Override
   public MapCodec<sp> a() {
      return a;
   }

   @Override
   protected yc b() {
      return xo.c("test_instance.type.function");
   }

   @Override
   public xo c() {
      return this.o().b(this.a("test_instance.description.function", this.c.a().toString())).b(this.p());
   }
}
