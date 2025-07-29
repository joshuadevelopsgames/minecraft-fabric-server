import com.google.common.base.Suppliers;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hny implements hoe {
   private final List<fvq> a;
   private final List<gyv> b;
   private final Supplier<Vector3f[]> c;
   private final hoj d;
   private final boolean e;

   public hny(List<fvq> $$0, List<gyv> $$1, hoj $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = Suppliers.memoize(() -> a(this.b));
      boolean $$3 = false;

      for (gyv $$4 : $$1) {
         if ($$4.e().f()) {
            $$3 = true;
            break;
         }
      }

      this.e = $$3;
   }

   public static Vector3f[] a(List<gyv> $$0) {
      Set<Vector3f> $$1 = new HashSet<>();

      for (gyv $$2 : $$0) {
         gzd.a($$2.b(), $$1::add);
      }

      return $$1.toArray(Vector3f[]::new);
   }

   @Override
   public void a(hoh $$0, dcv $$1, hof $$2, dct $$3, @Nullable grk $$4, @Nullable cam $$5, int $$6) {
      $$0.a(this);
      hoh.b $$7 = $$0.a();
      if ($$1.C()) {
         hoh.a $$8 = a($$1) ? hoh.a.c : hoh.a.b;
         $$7.a($$8);
         $$0.c();
         $$0.a($$8);
      }

      int $$9 = this.a.size();
      int[] $$10 = $$7.a($$9);

      for (int $$11 = 0; $$11 < $$9; $$11++) {
         int $$12 = this.a.get($$11).a($$1, $$4, $$5);
         $$10[$$11] = $$12;
         $$0.a(Integer.valueOf($$12));
      }

      $$7.a(this.c);
      $$7.a(gxe.a($$1));
      this.d.a($$7, $$3);
      $$7.b().addAll(this.b);
      if (this.e) {
         $$0.c();
      }
   }

   private static boolean a(dcv $$0) {
      return $$0.a(azx.bz) || $$0.a(dcz.sv);
   }

   public record a(ame b, List<fvq> c) implements hoe.b {
      public static final MapCodec<hny.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ame.a.fieldOf("model").forGetter(hny.a::b), fvr.a.listOf().optionalFieldOf("tints", List.of()).forGetter(hny.a::c))
            .apply($$0, hny.a::new)
      );

      @Override
      public void a(huk.a $$0) {
         $$0.markDependency(this.b);
      }

      @Override
      public hoe a(hoe.a $$0) {
         huc $$1 = $$0.a();
         hul $$2 = $$1.a(this.b);
         gzk $$3 = $$2.g();
         List<gyv> $$4 = $$2.a($$3, $$1, htu.a).a();
         hoj $$5 = hoj.a($$1, $$2, $$3);
         return new hny(this.c, $$4, $$5);
      }

      @Override
      public MapCodec<hny.a> a() {
         return a;
      }
   }
}
