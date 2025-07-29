import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.List;

public interface gzc {
   void a(bck var1, List<gzb> var2);

   default List<gzb> a(bck $$0) {
      List<gzb> $$1 = new ObjectArrayList();
      this.a($$0, $$1);
      return $$1;
   }

   hrs a();

   public static class a implements gzc.c {
      final gzc.b a;
      private final huc.a<gzc> b = new huc.a<gzc>() {
         public gzc a(huc $$0) {
            return a.this.a.a($$0);
         }
      };

      public a(gzc.b $$0) {
         this.a = $$0;
      }

      @Override
      public void a(huk.a $$0) {
         this.a.a($$0);
      }

      @Override
      public gzc a(eeb $$0, huc $$1) {
         return $$1.a(this.b);
      }

      @Override
      public Object a(eeb $$0) {
         return this;
      }
   }

   public interface b extends huk {
      Codec<bvs<gzl>> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gzl.a.forGetter(bvs::a), bbi.p.optionalFieldOf("weight", 1).forGetter(bvs::b)).apply($$0, bvs::new)
      );
      Codec<hup.a> b = bbi.b(a.listOf()).flatComapMap($$0 -> new hup.a(bvt.a(Lists.transform($$0, $$0x -> $$0x.a(gzj.a::new)))), $$0 -> {
         List<bvs<gzc.b>> $$1 = $$0.b().d();
         List<bvs<gzl>> $$2 = new ArrayList<>($$1.size());

         for (bvs<gzc.b> $$3 : $$1) {
            if (!($$3.a() instanceof gzj.a $$5)) {
               return DataResult.error(() -> "Only single variants are supported");
            }

            $$2.add(new bvs<>($$5.b(), $$3.b()));
         }

         return DataResult.success($$2);
      });
      Codec<gzc.b> c = Codec.either(b, gzj.a.d).flatComapMap($$0 -> (gzc.b)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         return switch ($$0) {
            case gzj.a $$3 -> DataResult.success(Either.right($$3));
            case hup.a $$4 -> DataResult.success(Either.left($$4));
            default -> DataResult.error(() -> "Only a single variant or a list of variants are supported");
         };
      });

      gzc a(huc var1);

      default gzc.c a() {
         return new gzc.a(this);
      }
   }

   public interface c extends huk {
      gzc a(eeb var1, huc var2);

      Object a(eeb var1);
   }
}
