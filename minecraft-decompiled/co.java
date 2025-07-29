import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class co extends dl<co.a> {
   @Override
   public Codec<co.a> a() {
      return co.a.a;
   }

   public void a(auc $$0, jb $$1, dcv $$2) {
      aub $$3 = $$0.y();
      eeb $$4 = $$3.a_($$1);
      fdm $$5 = new fdm.a($$3).a(fgd.f, $$1.b()).a(fgd.a, $$0).a(fgd.g, $$4).a(fgd.i, $$2).a(fgc.o);
      fdj $$6 = new fdj.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public record a(Optional<bj> b, Optional<bj> c) implements dl.a {
      public static final Codec<co.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(co.a::a), bj.a.optionalFieldOf("location").forGetter(co.a::b)).apply($$0, co.a::new)
      );

      public static ar<co.a> a(dpz $$0) {
         bj $$1 = bj.a(fgr.a($$0).build());
         return aq.z.a(new co.a(Optional.empty(), Optional.of($$1)));
      }

      public static ar<co.a> a(fgs.a... $$0) {
         bj $$1 = bj.a(Arrays.stream($$0).map(fgs.a::build).toArray(fgs[]::new));
         return aq.z.a(new co.a(Optional.empty(), Optional.of($$1)));
      }

      public static <T extends Comparable<T>> ar<co.a> a(dpz $$0, efe<T> $$1, String $$2) {
         ds.a $$3 = ds.a.a().a($$1, $$2);
         bj $$4 = bj.a(fgr.a($$0).a($$3).build());
         return aq.z.a(new co.a(Optional.empty(), Optional.of($$4)));
      }

      public static ar<co.a> a(dpz $$0, efe<Boolean> $$1, boolean $$2) {
         return a($$0, $$1, String.valueOf($$2));
      }

      public static ar<co.a> a(dpz $$0, efe<Integer> $$1, int $$2) {
         return a($$0, $$1, String.valueOf($$2));
      }

      public static <T extends Comparable<T> & bda> ar<co.a> a(dpz $$0, efe<T> $$1, T $$2) {
         return a($$0, $$1, $$2.c());
      }

      private static co.a c(cv.a $$0, cn.a $$1) {
         bj $$2 = bj.a(fgq.a($$0).build(), fgz.a($$1).build());
         return new co.a(Optional.empty(), Optional.of($$2));
      }

      public static ar<co.a> a(cv.a $$0, cn.a $$1) {
         return aq.N.a(c($$0, $$1));
      }

      public static ar<co.a> b(cv.a $$0, cn.a $$1) {
         return aq.ab.a(c($$0, $$1));
      }

      public boolean a(fdj $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, fgc.o, "location"));
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<bj> b() {
         return this.c;
      }
   }
}
