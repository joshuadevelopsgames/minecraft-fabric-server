import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ffh extends few {
   public static final MapCodec<ffh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and(
            $$0.group(
               fdo.a.fieldOf("name").forGetter($$0x -> $$0x.b),
               Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
               mm.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
            )
         )
         .apply($$0, ffh::new)
   );
   private final amd<fdo> b;
   private final long c;
   private final jl<ebb<?>> d;

   private ffh(List<fgs> $$0, amd<fdo> $$1, long $$2, jl<ebb<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public fey<ffh> b() {
      return fez.y;
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(kq.at, new dfw(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(fdp $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.a(new fdp.d(this.b));
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.a(new fdp.a(this.b));
         }
      }
   }

   public static few.a<?> a(ebb<?> $$0, amd<fdo> $$1) {
      return a($$2 -> new ffh($$2, $$1, 0L, $$0.a()));
   }

   public static few.a<?> a(ebb<?> $$0, amd<fdo> $$1, long $$2) {
      return a($$3 -> new ffh($$3, $$1, $$2, $$0.a()));
   }
}
