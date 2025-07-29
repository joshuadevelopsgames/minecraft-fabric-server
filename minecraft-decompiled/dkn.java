import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dkn(jp<bzv<?>> d, boolean e) implements djz {
   public static final MapCodec<dkn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ka.a(mn.D).fieldOf("entity").forGetter(dkn::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dkn::c)).apply($$0, dkn::new)
   );

   @Override
   public void a(aub $$0, int $$1, djh $$2, bzm $$3, fis $$4) {
      jb $$5 = jb.a((jv)$$4);
      if (dmu.l($$5)) {
         Optional<jl<bzv<?>>> $$6 = this.b().a($$0.H_());
         if (!$$6.isEmpty()) {
            bzm $$7 = $$6.get().a().a($$0, $$5, bzu.k);
            if ($$7 != null) {
               if ($$7 instanceof cal $$8 && $$2.c() instanceof auc $$9) {
                  $$8.b($$9);
               }

               if (this.e && $$3.cu() != null) {
                  $$0.g().a($$7.cM(), $$3.cu());
               }

               $$7.b($$4.d, $$4.e, $$4.f, $$7.dP(), $$7.dR());
            }
         }
      }
   }

   @Override
   public MapCodec<dkn> a() {
      return a;
   }

   public jp<bzv<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
