import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class sl extends ta {
   public static final MapCodec<sl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tt.a.forGetter(ta::n)).apply($$0, sl::new));

   public sl(tt<jl<tu>> $$0) {
      super($$0);
   }

   @Override
   public void a(sy $$0) {
      jb $$1 = this.b($$0);
      ect $$2 = $$0.a($$1, ect.class);
      $$2.j();
      $$0.e(() -> {
         List<jb> $$1x = this.a($$0, efm.d);
         if ($$1x.isEmpty()) {
            $$0.b(xo.a("test_block.error.missing", efm.d.a()));
         }

         boolean $$2x = $$1x.stream().map($$1xx -> $$0.a($$1xx, ect.class)).anyMatch(ect::u);
         if ($$2x) {
            $$0.e();
         } else {
            this.a($$0, efm.c, $$1xx -> $$0.b(xo.b($$1xx.v())));
            this.a($$0, efm.b, ect::j);
         }
      });
   }

   private void a(sy $$0, efm $$1, Consumer<ect> $$2) {
      for (jb $$4 : this.a($$0, $$1)) {
         ect $$5 = $$0.a($$4, ect.class);
         if ($$5.u()) {
            $$2.accept($$5);
            $$5.f();
         }
      }
   }

   private jb b(sy $$0) {
      List<jb> $$1 = this.a($$0, efm.a);
      if ($$1.isEmpty()) {
         $$0.b(xo.a("test_block.error.missing", efm.a.a()));
      }

      if ($$1.size() != 1) {
         $$0.b(xo.a("test_block.error.too_many", efm.a.a()));
      }

      return $$1.getFirst();
   }

   private List<jb> a(sy $$0, efm $$1) {
      List<jb> $$2 = new ArrayList<>();
      $$0.a($$3 -> {
         eeb $$4 = $$0.a($$3);
         if ($$4.a(dqb.pJ) && $$4.c(dyt.b) == $$1) {
            $$2.add($$3.j());
         }
      });
      return $$2;
   }

   @Override
   public MapCodec<sl> a() {
      return a;
   }

   @Override
   protected yc b() {
      return xo.c("test_instance.type.block_based");
   }
}
