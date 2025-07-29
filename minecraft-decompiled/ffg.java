import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class ffg extends few {
   public static final MapCodec<ffg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and($$0.group(fdh.e.fieldOf("component").forGetter($$0x -> $$0x.b), fdx.a.listOf().fieldOf("entries").forGetter($$0x -> $$0x.c)))
         .apply($$0, ffg::new)
   );
   private final fdg<?> b;
   private final List<fdz> c;

   ffg(List<fgs> $$0, fdg<?> $$1, List<fdz> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public fey<ffg> b() {
      return fez.t;
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Builder<dcv> $$2 = Stream.builder();
         this.c.forEach($$2x -> $$2x.expand($$1, $$2xx -> $$2xx.a(fdo.a($$1.d(), $$2::add), $$1)));
         this.b.a($$0, $$2.build());
         return $$0;
      }
   }

   @Override
   public void a(fdp $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(new bci.d("entries", $$1)));
      }
   }

   public static ffg.a a(fdg<?> $$0) {
      return new ffg.a($$0);
   }

   public static class a extends few.a<ffg.a> {
      private final com.google.common.collect.ImmutableList.Builder<fdz> a = ImmutableList.builder();
      private final fdg<?> b;

      public a(fdg<?> $$0) {
         this.b = $$0;
      }

      protected ffg.a a() {
         return this;
      }

      public ffg.a a(fdz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fex b() {
         return new ffg(this.g(), this.b, this.a.build());
      }
   }
}
